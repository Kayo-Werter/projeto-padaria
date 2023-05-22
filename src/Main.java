import poo.padaria.menu.Padaria;
import poo.padaria.produtos.HistoricoDeCompras;
import poo.padaria.produtos.Produtos;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                Gerente g = new Gerente("Kayo", "Gerente", 4);
                Padeiro p = new Padeiro("kayo", "Padeiro", 44);
                Cliente c = new Cliente("Pablo", "213.653.194-78");
                Padaria pa = new Padaria();

                pa.inicializar();

                System.out.println(pa.visualizacao());

                System.out.println(pa.getListaProdutos());
        }
}