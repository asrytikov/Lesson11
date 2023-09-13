package p10;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("in.txt"))
        ) {
            String text;
            while (!(text=bufferedReader.readLine()).equals("ESC")){
                bufferedWriter.write(text + "\n");
                bufferedWriter.flush();
            }


        }catch (IOException exception){
            exception.printStackTrace();
        }


    }

}
