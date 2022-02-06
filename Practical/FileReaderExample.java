package nikita_code;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("D:\\nikita\\test.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}