package _05_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
    public static void main(String[] args) throws InterruptedException {
        /* Make a CowTimer, set its time and start it.
         * Use a short delay (seconds) when testing, then try with longer delays
         */
    	String time = JOptionPane.showInputDialog(null, "How long in seconds do you want the Cow Timer to be?");
        int time2 = Integer.parseInt(time);
    	CowTimer cow = new CowTimer();
        cow.setTime(time2);
        cow.start();
    }
}
