public class Item {
    private String description;
    // Status for om emnet er færdiggjort eller ej
    private boolean isDone;

    // Konstruktør til at initialisere beskrivelse og status
    public Item(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    // Metode til at returnere beskrivelsen af emnet
    public String getDescription() {
        return description;
    }

    // Metode til at returnere om emnet er færdiggjort eller ej
    public boolean isDone() {
        return isDone;
    }

    // Metode til at markere emnet som færdiggjort
    public void markAsDone() {
        this.isDone = true;
    }

    // Overskriver toString() for at give en strengrepræsentation af emnet
    @Override
    public String toString() {
        return description + ", " + (isDone ? "færdig" : "ikke færdig");
    }
}