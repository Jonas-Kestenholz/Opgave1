import java.util.List;

// En klasse til at repræsentere en todoliste
public class TodoList {
    // En liste over items på todolisten
    private List<Item> items;

    // Konstruktør der initialiserer todolisten med en liste over items
    public TodoList(List<Item> items) {
        this.items = items;
    }

    // Metode til at vise hele todolisten
    public void displayList() {
        int index = 1;
        // Gennemgår hver item på todolisten og udskriver den med dens indeks
        for (Item item : items) {
            System.out.println(index++ + ": " + item.toString());
        }
    }

}