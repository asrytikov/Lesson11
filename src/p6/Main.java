package p6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("note.txt", true);) {
            String text = "Test text";
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

}
