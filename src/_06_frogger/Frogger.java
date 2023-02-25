package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    public static final int WIDTH = 844;
    static final int HEIGHT = 600;
    int frogX = 300;
    int frogY = 530;
    int cr = 422;
    int cl = 422;
    int cry = 360;
    int cly = 210;
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
           image (carRight,cl,360);
           image (carLeft,cr, 210);
           image (frog, frogX, frogY);
           outOfBounds();
           car1.display1(this,carLeft);
           
           car1.moveLeft();
           car2.moveRight();
           car1.display1(this,carLeft);
          
           if(intersects(car1)) {
        	   frogX = 300;
        	   frogY = 530;
           }
           if(intersects(car2)){
        	   frogX = 300;
        	   frogY = 530;
           }
           if(cr <= 0) {
        	   cr = 844;
           }
           if(cl >= 844) {
        	   cl = 0;
           }
           cr--;
           cl++;
       }
       public void keyPressed()
       {
           if(key == CODED){
               if(keyCode == UP)
               {
                   //Frog Y position goes up
            	   frogY -= 17;
               }
               else if(keyCode == DOWN)
               {
                   //Frog Y position goes down 
            	   frogY += 17;
               }
               else if(keyCode == RIGHT)
               {
                   //Frog X position goes right
            	   frogX += 17;
               }
               else if(keyCode == LEFT)
               {
                   //Frog X position goes left
            	   frogX -= 17;
               }
           }
           }
       public void outOfBounds()
       {
    	   if(frogX >= WIDTH) {
    		   frogX = 10;
    	   }else if(frogX <= 0) {
    		   frogX = WIDTH - 75;
    	   }else if(frogY >= HEIGHT) {
    		   frogY -= 10;
    	   }else if(frogY <= 0) {
    		   frogY += 10;
    	   }
       }
       boolean intersects(Car car) {
    	   if ((frogY > car.carY && frogY < car.carY+50) &&
    	                  (frogX > car.carX && frogX < car.carX+car.getSize())) {
    	     return true;
    	    }
    	   else  {
    	    return false;
    	   }
    	   }
       
       
       public static void main(String[] args) {
    	   PApplet.main(Frogger.class.getName());
	}
}
