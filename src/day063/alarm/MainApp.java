package day063.alarm;

import java.util.Timer;
import java.util.TimerTask;

public class MainApp {
    public static void main(String[] args) {

        Timer timer = new Timer("Alarm");

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Merhaba");
            }
        };

        timer.scheduleAtFixedRate(timerTask,5000,3000);
        timer.cancel();

    }
}

/*
Yukardaki Anonim nesnenin gerçeği

class myTask extends TimerTask{
    @Override
    public void run(){}
 */
