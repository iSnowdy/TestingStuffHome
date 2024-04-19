package Cron;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Cron01 {
    public static void main (String[] args) {
        System.out.println("Hello World");

        final ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(1);

        final Runnable RUNNABLE = new Runnable() {
            int countDownStart = 10;
            @Override
            public void run() {
                System.out.println(countDownStart);
                countDownStart --;

                if (countDownStart < 0) {
                    System.out.println("Time is up!");
                    SCHEDULER.shutdown();
                }
            }
        };
        SCHEDULER.scheduleAtFixedRate(RUNNABLE, 0, 1, TimeUnit.SECONDS);
    }
}
