package nikita_code;


//package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

  public static void main(String[] args) {
      FileWriter writer = null;
      try {
          writer = new FileWriter("D:\\\\nikita\\\\test.txt");
          writer.write("Writing Test data");
          writer.flush();
          System.out.println("Data written to File");
      } catch (IOException ioe) {
          ioe.printStackTrace();
      } finally {
          try {
              if (writer != null) {
                  writer.close();
              }
          } catch (IOException ioe) {

          }
      }
  }

}