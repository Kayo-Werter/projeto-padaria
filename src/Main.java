import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Kayo", "Gerente", 4);
        Padeiro p = new Padeiro("kayo", "gerente", 5);
        Cliente c = new Cliente("china", 10);
        Menu menu = new Menu();

        menu.menuInicial(p, g,c);


    }
}
