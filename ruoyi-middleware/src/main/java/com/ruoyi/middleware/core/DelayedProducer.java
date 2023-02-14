package com.ruoyi.middleware.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description:
 * @Author: zhongyc
 * @Data: 2023-02-14 13:13
 * @Version: v1.0
 */
@Slf4j
@Component
public class DelayedProducer {
    public static final String DELAYED_EXCHANGE_NAME = "delayed.exchange";
    public static final String DELAYED_ROUTING_KEY = "delayed.routing.key";
    @Resource
    private RabbitTemplate rabbitTemplate;

    @Deprecated
    public void sendToMessage(String message, Integer delayTime) {
        rabbitTemplate.convertAndSend(DELAYED_EXCHANGE_NAME, DELAYED_ROUTING_KEY, message,
                correlationData -> {
                    correlationData.getMessageProperties().setDelay(delayTime);
                    return correlationData;
                });
        log.info("当前时间:{},发送一条延迟{}毫秒的信息给队列 delayed.queue:{}", new Date(), delayTime, message);
    }
}
