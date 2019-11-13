package tankwars.powerup;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ExtraLife extends PowerUp {
    private int x, y;
    private Rectangle r;
    private static BufferedImage img;

    public ExtraLife(int x, int y){
        this.x = x;
        this.y = y;
        this.r = new Rectangle(x, y, img.getWidth(), img.getHeight());
    }

    public static void setImg(BufferedImage img){
        ExtraLife.img = img;
    }

    @Override
    public Rectangle getRectangle() {
        return new Rectangle(x, y, img.getWidth(), img.getHeight());
    }

    public void drawImage(Graphics2D buffer){
        buffer.drawImage(img, x, y, null);
    }
}
