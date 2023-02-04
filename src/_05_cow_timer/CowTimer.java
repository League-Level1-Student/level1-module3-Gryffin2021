package _05_cow_timer;

import javax.swing.JOptionPane;

import game_tools.Sound;

/*
 * Objective: Create a Cow Count Down program!
 * 
 * In this class:
 * 1. Make a constructor for the CowTimer class that initializes the seconds
 *    variable.
 * 
 * 2. In the start() method, count down the seconds, print the current second,
 *    then sleep for the number of seconds using Thread.sleep(int milliseconds).
 *    For example, if the count down seconds is 10, the console should print
 *    the remaining seconds with a 1 second delay between each print:
 *    10
 *    9
 *    8
 *    ...
 * 
 * 3. After the timer is finished, use the playSound() method to play a moo
 *    sound. You can use "moo.wav" as the sound file.
 * 
 * In the CowTimerRunner class:
 * Complete the main method
 */
public class CowTimer {
    private int seconds;
    public CowTimer() {
    	
    }
    public void setTime(int time2) {
        this.seconds = time2;
        System.out.println("Cow time set to " + this.seconds + " seconds.");
    }

    public void start() throws InterruptedException {;
    	for(int i = seconds; i >= 0; i--) {
        System.out.println(i);
        Thread.sleep(1000);
        }
    	playSound("moo.wav");
    }

    public void playSound(final String file) {
        String fileName = "_05_cow_timer/" + file;
        Sound sound = new Sound(fileName);
        sound.play();
    }
}
