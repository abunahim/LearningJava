package LearningJava.Write_Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Files {
    public static void main(String[] args) throws IOException {

        String filePath = "src/LearningJava/Write_Files/Hello_World.txt";
        String textContent = "HELLO WORLD!!";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
