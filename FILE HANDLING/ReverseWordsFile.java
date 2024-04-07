import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWordsFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        try {
            reverseWordsInFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void reverseWordsInFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                StringBuilder reversedLine = new StringBuilder();
                for (String word : words) {
                    reversedLine.append(reverseWord(word)).append(" ");
                }
                System.out.println(reversedLine.toString().trim());
            }
        }
    }

    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
