/*Program to list the sub directory and files in a given directory and also 
search for a file name.*/

import java.io.File;
import java.util.Scanner;

public class DirectoryExplorer {

    // This method lists all files and directories within a given directory
    static void listFilesAndDirectories(File directory) {
        File[] fileList = directory.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listFilesAndDirectories(file); // Recursively list subdirectories
                }
            }
        }
    }

    // This method searches for a file by name within a given directory
    static void searchFile(File directory, String fileName) {
        File[] fileList = directory.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    System.out.println("File found at: " + file.getAbsolutePath());
                    return;
                } else if (file.isDirectory()) {
                    searchFile(file, fileName); // Recursively search subdirectories
                }
            }
        }
        System.out.println("File '" + fileName + "' not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for directory path
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        // Check if the directory exists and is valid
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Files and directories in the specified directory:");
            listFilesAndDirectories(directory);

            // Prompt user for the file name to search
            System.out.print("\nEnter the file name to search: ");
            String fileName = scanner.nextLine();
            System.out.println("Searching for file '" + fileName + "'...");
            searchFile(directory, fileName);
        } else {
            System.out.println("Invalid directory path.");
        }

        scanner.close();
    }
}
