package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet {
 public int carX = 0;
 public int carY = 0;
 public int size = 0;
 public Car(int x, int y, int size) {
	 this.carX = x;
	 this.carY = y;
	 this.size = size;
 }
 void display(PApplet g)
 {
   g.fill(0,255,0);
   g.rect(carX , carY,  size, 50);
 }
 public void moveLeft() {
	 	carX -= 10;
	 	if(carX <= 0) {
	 		carX = 854;
	 	}
 }
	 	public void moveRight() {
		 	carX += 10;
		 	if(carX >= 854) {
		 		carX = 0;
		 	}
		}
	 	public int getX() {
	 		return carX;
	 	}
	 	public int getY() {
	 		return carY;
	 	}
	 	public int getSize() {
	 		return size;
	 	}
	 
	 
 }

