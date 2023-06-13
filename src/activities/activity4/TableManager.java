package activities.activity4;

import java.io.*;
import java.util.ArrayList;

public class  TableManager{

    static ArrayList<Table> tableList = new ArrayList<>();
    public void saveTable(Table table) throws IOException{

        tableList.add(table);

        FileOutputStream fileOutput = new FileOutputStream("src/files/activity4.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
        ObjectOutput objectOutput = new ObjectOutputStream(bufferedOutput);

        for (int i = 0; i < tableList.size() ; i++) {
            objectOutput.writeObject(tableList.get(i));
        }

        objectOutput.close();
    }

    public void showTables() throws IOException {
        FileInputStream fileInput = new FileInputStream("src/files/activity4.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
        ObjectInput objectInput = new ObjectInputStream(bufferedInput);


        try {

            Table table = (Table) objectInput.readObject();


            while(true){
                System.out.println(table);
                table = (Table) objectInput.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Se ha llegado hasta el final del archivo.");
        } catch (ClassNotFoundException e) {
            System.out.println("Se ha producido un error al leer el fichero.");
        }

        objectInput.close();

    }
}

