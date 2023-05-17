import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("Kayo", "Gerente", 4);
        Padeiro p = new Padeiro("kayo", "Padeiro", 44);
        Cliente c = new Cliente ("joao");


        Menu menu = new Menu();

        menu.menuInicial(g, p, c);




    }
}