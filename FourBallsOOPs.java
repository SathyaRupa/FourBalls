import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOOPs extends PApplet {
    public final int HEIGHT = 420;
    public final int WIDTH = 648;

    ArrayList<Ball> balls = new ArrayList<>();

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int speed = 1; speed <= 4; speed++) {
            balls.add(new Ball(speed, speed * HEIGHT/5));
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.draw(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsOOPs");
    }
}