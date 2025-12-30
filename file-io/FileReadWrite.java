import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);

        int sum = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }

        scanner.close();

        FileWriter writer = new FileWriter("output.txt");
        writer.write("Sum: " + sum);
        writer.close();

        System.out.println("Result written to output.txt");
    }
}
