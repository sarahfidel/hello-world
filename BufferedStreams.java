
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreams {
    public static void main(String[] args) {
        //Writing binary data using bufferedoutputstream
        String sentence = "New line acquired at 1200.";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Admin\\Documents\\java\\Java wrk\\example.txt"))) {
            byte[] data = sentence.getBytes();
            bos.write(data);
            System.out.println("Binary data written using BufferedOutputStream.");
        }
        catch (IOException e) {
            System.out.println("Error writing binary data: " + e.getMessage());
        }

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Admin\\Documents\\java\\Java wrk\\example.txt"))) {
            System.out.println("Reading binary data using BufferedInputStream");  
            int data;
                while ((data = bis.read()) != -1) { 
                    System.out.println((char) data);
                } 
        } catch (IOException e) {
            System.out.println("Error reading binary data: " + e.getMessage());
        }
    }
}
