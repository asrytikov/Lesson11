package p3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        String text = "Information";

        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\users\\130923.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
        ){
            printStream.println(text);
            System.out.println("Write in file end");
        }catch (IOException exception){
            exception.printStackTrace();
        }


    }

}
