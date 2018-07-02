package pl.peplinski.zadanie;

public class Menu {
    public void displayMenu() {
        String[] display = new String[]
                {"1 - Add to DB", "2 - Show", "3 - Show all", "4 - Update", "5 - Remove"};

        for (int i = 0; i < display.length; i++) {
            System.out.println(display[i]);
        }
    }
}
