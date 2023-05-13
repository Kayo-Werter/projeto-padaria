import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produtos> lista = new ArrayList<>();

        Produtos pao = new Produtos("Pao", 1, 3);
        lista.add(pao);
        Produtos ovo = new Produtos("Ovo", 2, 2);
        lista.add(ovo);
        Produtos queijo = new Produtos("Queijo", 3, 2);
        lista.add(queijo);
        Produtos bolo = new Produtos("Bolo", 4, 1);
        lista.add(bolo);

        Estoque estoque = new Estoque(lista);

        System.out.println(estoque);


//        Scanner leitura = new Scanner(System.in);
//        System.out.println("Nome do Cliente");
//        String nome = leitura.nextLine();
//
//        System.out.println("Saldo do cliente: ");
//        double saldo = leitura.nextDouble();
//        Cliente c1 = new Cliente(nome, saldo);
//
//        int sair = 1;
//        while (sair != 0) {
//            System.out.println("Qual produto você deseja comprar?");
//            String prod = leitura.nextLine();
//
//            System.out.println("Valor: ");
//            double val = leitura.nextDouble();
//
//            Produtos produtos = new Produtos(prod, val);
//            boolean compraRealizada = c1.lancaCompra(produtos);
//
//            if (compraRealizada) {
//                System.out.println("Compra realizada!");
//                System.out.println("Digite 0 para sair do programa e 1 para continuar comprando: ");
//                sair = leitura.nextInt();
//            } else {
//                System.out.println("Saldo insuficiente!");
//                sair = 0;
//            }
//        }
//
//        System.out.println("************************************");
//        System.out.println("Compras realizadas por " + c1.getNome() + "!");
//        Collections.sort(c1.getHistoricoDeCompras());
//
//        for (Produtos p: c1.getHistoricoDeCompras()) {
//            System.out.println(p.getNome() + " - " + p.getValor());
//        }
//        System.out.println("************************************");
//        System.out.println("\nSaldo: " + c1.getSaldo());
    }
}
