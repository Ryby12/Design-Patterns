package plm;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgBMP {
    public ImgBMP(String path) {
        try {
            BufferedImage picture = ImageIO.read(new File(path));
            JLabel pLable=new JLabel(new ImageIcon(picture));
            JPanel jPanel=new JPanel();
            jPanel.add(pLable);
            JFrame jFrame=new JFrame();
            jFrame.setSize(new Dimension(picture.getWidth(), picture.getHeight()));
            jFrame.add(jPanel);
            jFrame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
