import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AbstractChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            checkAbstract(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void checkAbstract(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder abstractContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                abstractContent.append(line);
            }
            String abstractText = abstractContent.toString();
            int charCount = abstractText.length();
            System.out.println("Character count: " + charCount);

            if (charCount <= 250) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }
        }
    }
}
