package p8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("note.txt"))) {
            String text = "Test Test TestTestTestTestTestTestTestTestTestTestTestTest\n";
            for(int i=0; i<10; i++){
            bufferedWriter.write(text);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
