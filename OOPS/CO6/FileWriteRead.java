
/*Write a program to write to a file, then read from the file and display the contents on 
the console. */
import java.io.*;
import java.util.Scanner;

public class FileWriteRead {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Write to the file
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        System.out.println("Enter text to insert: ");
        String textToWrite = scanner.nextLine();
        fileOutputStream.write(textToWrite.getBytes());
        fileOutputStream.close();

        // Read from the file
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] fileContentBytes = new byte[fileInputStream.available()];
        fileInputStream.read(fileContentBytes);
        fileInputStream.close();

        // Display contents on the console
        String fileContent = new String(fileContentBytes);
        System.out.println("Contents of " + fileName + ":");
        System.out.println(fileContent);

        scanner.close();
    }
}
