package exercise_5;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        /* System.out.println("Program started...");

        class MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println("Hello World!");
                System.exit(0);
            }
        }
        MyTimerTask task = new MyTimerTask();

        Timer timer = new Timer("Timer");

        long delay = 5000L;
        timer.schedule(task, delay); */

        // Using  anonymous class

       /* System.out.println("Program started ...");
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Hello World!");
                System.exit(0);
            }
        };
        Timer timer = new Timer("Timer");
        long delay = 5000L;
        timer.scheduleAtFixedRate(task, delay, delay);
        */

        // Anonymous object

        System.out.println("Hello World");
        Timer timer = new Timer("Timer");
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Hello World");
                System.exit(0);
            }
        }, 5000L);
    }
}

