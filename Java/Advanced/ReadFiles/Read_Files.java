package LearningJava.Read_Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Files {
    public static void main(String[] args) {

        String filePath = "src/LearningJava/Read_Files/Poem.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            //System.out.println("That file exist");
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
