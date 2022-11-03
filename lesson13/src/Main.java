import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();

        Scanner scanner = new Scanner(System.in);
        out.print("Enter book name: ");
        String name = scanner.nextLine().trim();
        scanner.close();

        // Method find and reed the book by name
        fileManager.readBook(name);

        // Method create and write statistic file
        fileManager.writeReport(name);

        // Output method
        out.println("\n"+fileManager.findTenPopularWords());
        out.println("\nCount uniq words = ".concat(String.valueOf(fileManager.countUniqueWords())));
    }
}