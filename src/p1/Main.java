import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
       String text = "Hello all!";
       byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try(BufferedInputStream stream = new BufferedInputStream(in)){
            int c;
            while ((c=stream.read())!=-1){
                System.out.print((char) c);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println();
    }
}