import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opretter en instans af FileIO objekt
        FileIO fileIO = new FileIO();
        // Indlæser items fra en CSV-fil
        ArrayList<Item> items = fileIO.loadFile("Data/todo.csv");

        // Opretter en instans af TodoList med de indlæste items
        TodoList todoList = new TodoList(items);
        // Viser listen over items
        items.add(new Item("Rydde op",true));

        Item secondItem = items.get(1);
        secondItem.markAsDone();
        todoList.displayList();


    }
}






//Skal måske tilføjes fra konsol
//add item metode
//måske fjerne alt fra main til metoder
//max kapacitet