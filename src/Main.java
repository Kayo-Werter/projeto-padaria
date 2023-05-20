import poo.padaria.menu.Menu;
import poo.padaria.menu.Padaria;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Funcionario;
import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

public class Main {
    public static void main(String[] args) {

        Padeiro p = new Padeiro("kayo", "Padeiro", 44);
        Padaria pa = new Padaria();


        pa.funcionariosCadastrados();
        pa.produtosEstoque();
        pa.clientesCadastrados();
        System.out.println(pa.getListaClientes());


//        Menu menu = new Menu(pa);
//
//        menu.menuInicial(p);





    }
}