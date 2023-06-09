package activities.activity2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/files/activity2.txt");

        int ch;

        while ((ch=fr.read())!=-1){
            System.out.print(((char)ch) + "_" + ch + ", ");
        }

        fr.close();
    }
}
