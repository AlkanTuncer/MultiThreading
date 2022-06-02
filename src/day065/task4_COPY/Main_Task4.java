package day065.task4_COPY;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main_Task4 {
    public static void main(String[] args) {

        // Task 4 - 1
        String source = "source/GS.jpg";
        String target = "target/GS.jpg";

        if (copy(source,target)){
            System.out.println("Başarıyla kopyalandı.");
        }else {
            System.out.println("Dosya kopyalanamadı.");
        }

    }

    // Dosya kopyalamak için metot yazıyoruz.
    public static boolean copy(String source,String target){
        boolean result = false;
        int MAX = 524288;

        byte[] data = new byte[MAX];
        try(FileInputStream fis = new FileInputStream(source)){
            try(FileOutputStream fos = new FileOutputStream(target)){

                int okunan = 0;
                while((okunan = fis.read(data))>0){
                    if (okunan != MAX){
                        fos.write(data,0,okunan);
                    }else {
                        fos.write(data);
                    }
                }
                result = true;
            }catch (Exception ex){
                System.err.println(ex.getMessage());;
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());;
        }
        return result;
    }

}

/*
    TASK 4 :

    1. JavaIO Kütüphanesi sınıflarını kullanarak bir adet dosyayı kopya ediniz.

    2. Birden fazla dosyayı kopya ediniz.

    3. Birden fazla dosyayı Thread kullanarak paralel kopya ediniz.

    4. Bir dosyayı parçalara ayırıp Thread kullanarak kopya ediniz.

 */
