// Another easiest method to copy one file to another

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles {

    public static void main(String[] args) {

        try {
            FileReader f1 = new FileReader("file1.txt");
            FileWriter f2 = new FileWriter("file2.txt");

            // Read each character and write it
            int character = f1.read();
            while (character != -1) {
                System.out.print((char) character);
                f2.write(character);
                character = f1.read();
            }

            f1.close();
            f2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}