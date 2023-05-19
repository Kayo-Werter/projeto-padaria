import poo.padaria.menu.Menu;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Funcionario;
import poo.padaria.usuarios.Padeiro;

public class Main {
    public static void main(String[] args) {

        Funcionario.Gerente g = new Funcionario.Gerente("Kayo", "poo.padaria.funcionarios.Funcionario.poo.padaria.funcionarios.Gerente", 4);
        Padeiro p = new Padeiro("kayo", "poo.padaria.funcionarios.Padeiro", 44);
        Cliente c = new Cliente ("joao");


        Menu menu = new Menu();

        menu.menuInicial(g, p, c);




    }
}