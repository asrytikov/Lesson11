package p4;

import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        try(PrintStream printStream = new PrintStream("note.txt")) {
            printStream.print("13-09-23!!!");
            printStream.println("Programmer's day");
            printStream.printf("Name: %s Age: %d \n", "Maria", 23);
            String message = "PrintStream";
            byte[] messBytes = message.getBytes();
            printStream.write(messBytes);
            System.out.println("The file written");
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

}
