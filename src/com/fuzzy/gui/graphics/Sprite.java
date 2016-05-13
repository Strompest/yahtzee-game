package com.fuzzy.gui.graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by 17Obradovijohn on 5/3/2016.
 */
public class Sprite {

    private BufferedImage image;

    public Sprite(String path) {
        this(new File(path));
    }

    public Sprite(File file) {
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.err.println("Couldn't load image file: " + file.getAbsolutePath());
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void draw(Graphics g, int x, int y) {
        g.drawImage(image, x, y, null);
    }

    public void draw(Graphics g, int x, int y, int width, int height) {
        g.drawImage(image, x, y, width, height, null);
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }
}
