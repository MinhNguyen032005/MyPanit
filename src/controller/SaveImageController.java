package controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SaveImageController {


    public static void saveDrawingToFile(JPanel drawingPanel) {
        // Tạo BufferedImage và vẽ lại các hình ảnh lên đó
        if (drawingPanel.getWidth() <= 0 || drawingPanel.getHeight() <= 0) {
            JOptionPane.showMessageDialog(drawingPanel, "No pictures are drawn");
            return;
        }
        BufferedImage image = new BufferedImage(drawingPanel.getWidth(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        drawingPanel.paint(g2d);
        g2d.dispose();

        // Hiển thị hộp thoại lưu file
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(drawingPanel) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                ImageIO.write(image, "png", file);
                JOptionPane.showMessageDialog(drawingPanel, "File saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(drawingPanel, "Error saving file: " + ex.getMessage());
            }
        }
    }
}
