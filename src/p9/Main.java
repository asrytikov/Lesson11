package p9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("note.txt"))) {

            String s;
            while ((s=reader.readLine())!=null){
                System.out.println(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
