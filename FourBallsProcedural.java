import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 458;
    public static final int DIAMETER = 12;
    public  int xPosition = 5;
    public int yPosition = 5;
    private int position = 1;

    public static void main(String[] args){
        PApplet.main("FourBallsProcedural");
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        for (int speed = 1; speed <= 4; speed++) {
            drawBall(speed*position,speed*HEIGHT/5);
        }
        position ++;
    }

    private void drawBall(int xPosition, int yPosition){
        ellipse(xPosition, yPosition, DIAMETER,DIAMETER);
    }

}
