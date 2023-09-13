package p2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        String text = "HELLO ALL!";

        try(FileOutputStream out = new FileOutputStream("note.txt");
            BufferedOutputStream stream = new BufferedOutputStream(out);
        ){
            byte[] buffer = text.getBytes();
            stream.write(buffer, 0, buffer.length);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
