package com.ruoyi.common.utils.poi;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author: zhongyc
 * @Data: 2022-12-15 10:18
 * @Version: v1.0
 */
public class ExcelWaterMark {
    private static final Logger log = LoggerFactory.getLogger(ExcelWaterMark.class);

    /**
     * 给 Excel 添加水印
     *
     * @param workbook      XSSFWorkbook
     * @param waterMarkText 水印文字内容
     */
    public static void insertWaterMarkText(XSSFWorkbook workbook, String waterMarkText) {
        BufferedImage image = createWatermarkImage(waterMarkText);
        // 导出到字节流B
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", os);
        } catch (IOException e) {
            log.error("添加水印失败");
        }
        int pictureIdx = workbook.addPicture(os.toByteArray(), XSSFWorkbook.PICTURE_TYPE_PNG);
        XSSFPictureData pictureData = workbook.getAllPictures().get(pictureIdx);
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            // 获取每个Sheet表
            XSSFSheet sheet = workbook.getSheetAt(i);
            PackagePartName ppn = pictureData.getPackagePart().getPartName();
            String relType = XSSFRelation.IMAGES.getRelation();
            PackageRelationship pr = sheet.getPackagePart().addRelationship(ppn, TargetMode.INTERNAL, relType, null);
            sheet.getCTWorksheet().addNewPicture().setId(pr.getId());

        }
    }

    /**
     * 创建水印图片 excel
     *
     * @param waterMark 水印内容
     */
    public static BufferedImage createWatermarkImage(String waterMark) {
        String[] textArray = waterMark.split("\n");
        java.awt.Font font = new java.awt.Font("microsoft-yahei", java.awt.Font.PLAIN, 20);
        Integer width = 500;
        Integer height = 200;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 背景透明 开始
        Graphics2D g = image.createGraphics();
        image = g.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        g.dispose();
        // 背景透明 结束
        g = image.createGraphics();
        // 设定画笔颜色
        g.setColor(new Color(Integer.parseInt("#C5CBCF".substring(1), 16)));
        // 设置画笔字体
        g.setFont(font);
        // 设定倾斜度
        g.shear(0.1, -0.26);
        // 设置字体平滑
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int y = 150;
        for (int i = 0; i < textArray.length; i++) {
            // 画出字符串
            g.drawString(textArray[i], 0, y);
            y = y + font.getSize();
        }
        // 释放画笔
        g.dispose();
        return image;
    }
}
