package activities.activity3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/files/activity3.txt");
            if(!file.exists()){
                file.createNewFile();
            }


            FileReader frOne = new FileReader("src/files/activity1.txt");
            FileReader frTwo = new FileReader("src/files/activity2.txt");
            FileWriter fw = new FileWriter("src/files/activity3.txt");

            int ch;



            while ((ch=frOne.read())!=-1){
                fw.write((char)ch);
            }

            while ((ch=frTwo.read())!=-1){
                fw.write((char)ch);
            }

            fw.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
