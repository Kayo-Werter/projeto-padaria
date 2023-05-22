import poo.padaria.menu.Menu;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Funcionario;
import poo.padaria.usuarios.Padeiro;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< Updated upstream
        Padeiro p = new Padeiro("kayo", "Padeiro", 44);
        Padaria pa = new Padaria();
=======
        Funcionario.Gerente g = new Funcionario.Gerente("Kayo", "poo.padaria.funcionarios.Funcionario.poo.padaria.funcionarios.Gerente", 4);
        Padeiro p = new Padeiro("kayo", "poo.padaria.funcionarios.Padeiro", 44);
        Cliente c = new Cliente ("joao");
>>>>>>> parent of a227534 (organizando administrador principal)


        Menu menu = new Menu();

<<<<<<< HEAD
=======
        Gerente g = new Gerente("Kayo", "Gerente", 4);
        Padeiro p = new Padeiro("Chines", "Padeiro", 44);
        Cliente c = new Cliente ("Pablo", "461.357.984-15");
        Padaria pa = new Padaria();
>>>>>>> Stashed changes
=======
        menu.menuInicial(g, p, c);
>>>>>>> parent of a227534 (organizando administrador principal)



        String data = "22/05/2023";

        List<Produtos> lista = new ArrayList<>();

        Produtos presunto = new Produtos("presunto", 5.90, 30);
        Produtos mussarela = new Produtos("mussarela", 8.70, 30);

        lista.add(presunto);
        lista.add(mussarela);

        HistoricoDeCompras compras = new HistoricoDeCompras(data, c, lista);

        pa.registrarPedidos(compras);
        System.out.println(pa.visualizacao());

    }
}