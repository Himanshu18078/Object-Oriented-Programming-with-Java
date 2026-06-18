package FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String [] args){
        String fileName = "Example.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Look It's already 2am and i am still studying");
            writer.flush();
            System.out.println("File written Successfully");
        }
        catch (IOException e){
            System.out.printf("Exception occurred %s",e.getMessage());
        }
    }
}
