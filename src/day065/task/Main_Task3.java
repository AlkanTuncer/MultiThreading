package day065.task;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Main_Task3 {
    public static void main(String[] args) {

        // TASK 3

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                if (count<=0) cancel();
                System.out.print(count-- + " ");
            }
        };

        timer.scheduleAtFixedRate(task,10_000,1_000);

    }
}
