//Write a program to copy one file to another

import java.io.*;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to enter the source file path
        System.out.print("Enter the source file path: ");
        String sourceFilePath = reader.readLine();

        // Prompt user to enter the destination file path
        System.out.print("Enter the destination file path: ");
        String destinationFilePath = reader.readLine();

        // Copy the file from source to destination
        try (InputStream inputStream = new FileInputStream(sourceFilePath);
                OutputStream outputStream = new FileOutputStream(destinationFilePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        } finally {
            reader.close();
        }
    }
}
