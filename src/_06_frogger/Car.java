package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet {
 public int carX = 0;
 public int carY = 0;
 public int size = 0;
 public Car(int x, int y, int size) {
	 carX = x;
	 carY = y;
	 this.size = size;
 }
 void display(PApplet g)
 {
   g.fill(0,255,0);
   g.rect(carX , carY,  size, 50);
 }
 public void moveLeft(int carX) {
	for(int i = 0; i < -1; i ++) {
		carX += 15;
		this.carX = carX;
		if(carX <= 0) {
			carX = 854;
		}
	}
	 
	 
 }
}
