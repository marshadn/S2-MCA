import java.io.*;

public class NumberSeparation {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to enter the input file path
        System.out.print("Enter the input file path: ");
        String inputFilePath = reader.readLine();

        // Define the output file paths for even and odd numbers
        String evenFilePath = "even.txt";
        String oddFilePath = "odd.txt";

        // Setup readers and writers
        BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
        BufferedWriter evenFileWriter = new BufferedWriter(new FileWriter(evenFilePath));
        BufferedWriter oddFileWriter = new BufferedWriter(new FileWriter(oddFilePath));

        String line;
        while ((line = fileReader.readLine()) != null) {
            int number = Integer.parseInt(line);
            if (number % 2 == 0) {
                evenFileWriter.write(line);
                evenFileWriter.newLine();
            } else {
                oddFileWriter.write(line);
                oddFileWriter.newLine();
            }
        }

        System.out.println("Even and odd numbers separated successfully.");

        // Close all resources
        reader.close();
        fileReader.close();
        evenFileWriter.close();
        oddFileWriter.close();
    }
}
