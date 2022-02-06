package nikita_code;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {

  public static void main(String[] args) {

      FileOutputStream fos = null;
      OutputStreamWriter osw = null;
      String data = "Testing OutputStreamWriter functionality";
      try {
          fos = new FileOutputStream("D:\\\\Nikita\\\\test.txt");
         osw = new OutputStreamWriter(fos, "UTF-8");
          osw.write(data);
          osw.flush();
          System.out.println("Data written to File");
      } catch (IOException ioe) {
          ioe.printStackTrace();
      } finally {
          // Closing the streams
          if (fos != null)
              try {
                  fos.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          if (osw != null)
              try {
                  osw.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
      }
  }

}
