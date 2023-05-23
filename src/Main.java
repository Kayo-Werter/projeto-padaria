import poo.padaria.menu.Menu;
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


                Padaria pa = new Padaria();

                pa.inicializar();

                Menu menu = new Menu();
                menu.menuInicial();
        }
}