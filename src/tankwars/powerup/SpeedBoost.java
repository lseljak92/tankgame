package tankwars.powerup;

import tankwars.CollidableObject;
import tankwars.Tank;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SpeedBoost extends PowerUp{

        private int x, y;
        private Rectangle r;
        private static BufferedImage img;
        private boolean collided = false;

        public SpeedBoost(int x, int y){
            this.x = x;
            this.y = y;
            this.r = new Rectangle(x, y, img.getWidth(), img.getHeight());
        }

        public static void setImg(BufferedImage img){
            tankwars.powerup.SpeedBoost.img = img;
        }

        @Override
        public void checkCollision(CollidableObject c) {
            if(c instanceof Tank){
                if(this.getRectangle().intersects(c.getRectangle())){
                    collided = true;
                    ((Tank) c).setSpeed(4);
                }
            }
        }

        public boolean hasCollided() { return collided; }

        @Override
        public Rectangle getRectangle() {
            return new Rectangle(x, y, img.getWidth(), img.getHeight());
        }

        public void drawImage(Graphics2D buffer){
            buffer.drawImage(img, x, y, null);
        }

}
