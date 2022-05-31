package day063.alarm;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Timer;
import java.util.TimerTask;

public class MainApp1 {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                try {
                    new ProcessBuilder("mspaint")
                            .inheritIO()
                            .start()
                            .waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        timer.scheduleAtFixedRate(tt,10_000,30_000);  // 10 sn sonra Paint acılıcak ve 30 sn de bir tekrar tekrar acılacak.

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }
}
