import poo.padaria.menu.Menu;
import poo.padaria.menu.Padaria;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Funcionario;
import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

public class Main {
    public static void main(String[] args) {

<<<<<<< Updated upstream
        Padeiro p = new Padeiro("kayo", "Padeiro", 44);
        Padaria pa = new Padaria();


        pa.funcionariosCadastrados();
        pa.produtosEstoque();
        pa.clientesCadastrados();
        System.out.println(pa.getListaClientes());


//        Menu menu = new Menu(pa);
//
//        menu.menuInicial(p);

=======
        Gerente g = new Gerente("Kayo", "Gerente", 4);
        Padeiro p = new Padeiro("Chines", "Padeiro", 44);
        Cliente c = new Cliente ("Pablo", "461.357.984-15");
        Padaria pa = new Padaria();
>>>>>>> Stashed changes



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