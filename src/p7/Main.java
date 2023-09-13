package p7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("note.txt")) {

            /*int c;
            while ((c= fileReader.read())!=-1){
                System.out.print((char) c);
            }*/

            char[] buf = new char[256];
            int c;
            while ((c= fileReader.read(buf))>0){
                if (c<256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }


        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
