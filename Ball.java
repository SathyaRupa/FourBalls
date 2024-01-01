import processing.core.PApplet;

public class Ball extends PApplet {

    int x;
    int speed;
    int HEIGHT;
    int DIAMETER;

    public Ball(int speed, int height) {
        this.HEIGHT = height;
        this.speed = speed;
        this.DIAMETER = 15;
        this.x = 0;
    }
        public void draw(PApplet pApplet){
            pApplet.ellipse(x, HEIGHT, DIAMETER, DIAMETER);
            x = x + speed;
        }
}