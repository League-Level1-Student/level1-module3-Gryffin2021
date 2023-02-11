package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    public static final int WIDTH = 844;
    static final int HEIGHT = 600;
    int x = 300;
    int y = 530;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    Car car1 = new Car(250, 360, 160);
    Car car2 = new Car(250, 210, 160);
       public void settings(){
           size(WIDTH,HEIGHT);
       }
       public void setup() {
           back = loadImage("src/_06_frogger/froggerBackground.png");
           carLeft = loadImage("src/_06_frogger/carLeft.png");
           carLeft.resize(160,100);
           carRight = loadImage("src/_06_frogger/carRight.png");
           carRight.resize(160,100);
           frog = loadImage("src/_06_frogger/frog.png");
           frog.resize(75,75);
       }
       public void draw() {
           background(back);
           image (carLeft,250,360);
           image (carRight,250, 210);
           image (frog, x, y);
           outOfBounds();
           car1.display(this);
           car2.display(this);
           
       }
       public void keyPressed()
       {
           if(key == CODED){
               if(keyCode == UP)
               {
                   //Frog Y position goes up
            	   y -= 10;
               }
               else if(keyCode == DOWN)
               {
                   //Frog Y position goes down 
            	   y += 10;
               }
               else if(keyCode == RIGHT)
               {
                   //Frog X position goes right
            	   x += 10;
               }
               else if(keyCode == LEFT)
               {
                   //Frog X position goes left
            	   x -= 10;
               }
           }
           }
       public void outOfBounds()
       {
    	   if(x >= WIDTH) {
    		   x = 10;
    	   }else if(x <= 0) {
    		   x = WIDTH - 75;
    	   }else if(y >= HEIGHT) {
    		   y -= 10;
    	   }else if(y <= 0) {
    		   y += 10;
    	   }
       }
       public static void main(String[] args) {
    	   PApplet.main(Frogger.class.getName());
	}
}
