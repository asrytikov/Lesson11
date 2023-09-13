package p5;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        String test = "Test text";

        try(PrintWriter printWriter = new PrintWriter(System.out)) {
            printWriter.println(test);
        }catch (Exception exception){
            exception.printStackTrace();
        }


    }

}
