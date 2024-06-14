import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    // En metode til at indlæse data fra en fil og returnere en liste over items
    public ArrayList<Item> loadFile(String filePath) {
        ArrayList<Item> items = new ArrayList<>();
        File file = new File(filePath); // instantiere file objekt
        try (Scanner scanner = new Scanner(file)) { // try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Spring over overskriftslinjen
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // opbevar data i en beholder
                String[] parts = line.split(",");
                String description = parts[0].trim();
                boolean isDone = Boolean.parseBoolean(parts[1].trim());
                items.add(new Item(description, isDone));
            }
        } catch (FileNotFoundException e) {

        }
        return items;
    }
}