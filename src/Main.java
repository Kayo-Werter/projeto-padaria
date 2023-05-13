import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Kayo", "Gerente", 4);
        Padeiro p = new Padeiro("kayo", "gerente", 5);
        Menu menu = new Menu();

        menu.menuGeral(g, p);


    }
}
