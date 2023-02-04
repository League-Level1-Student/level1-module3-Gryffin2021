package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 300;
    int y = 530;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
       public void settings(){
           size(844,600);
       }
       public void setup() {
           back = loadImage("froggerBackground.png");
           carLeft = loadImage("carLeft.png");
           carLeft.resize(160,100);
           carRight = loadImage("carRight.png");
           carRight.resize(160,100);
           frog = loadImage("frog.png");
           frog.resize(75,75);
       }
       public void draw() {
           background(back);
           image (carLeft,250,360);
           image (carRight,250, 210);
           image (frog, x, y);
           
       }
       public void keyPressed()
       {
           if(key == CODED){
               if(keyCode == UP)
               {
                   //Frog Y position goes up
            	   y += 10;
               }
               else if(keyCode == DOWN)
               {
                   //Frog Y position goes down 
            	   y -= 10;
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
}
