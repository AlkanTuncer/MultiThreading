package day065.task4_COPY;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy extends Thread{

    // TASK 4- 3

    private String source;
    private String target;

    public FileCopy(String source, String target) {
        this.source = source;
        this.target = target;
        this.start();
    }

    @Override
    public void run() {
        copy(source,target);
    }

    private boolean copy(String source, String target) {
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
