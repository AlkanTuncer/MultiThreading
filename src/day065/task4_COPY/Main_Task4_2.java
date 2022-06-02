package day065.task4_COPY;

public class Main_Task4_2 {
    public static void main(String[] args) {

        String pathSource = "source/";
        String pathTarget = "target/";

        String[] files = {
                "Geralt.jpg","GS.jpg","Joker.jpg"
        };

        for (var item : files){
            if(Main_Task4.copy(pathSource+item,pathTarget+item)){
                System.out.println(item+" dosyası başarıyla kopyalandı.");
            }else {
                System.out.println(item+" dosyası kopyalanamadı.");
            }
        }

    }
}
