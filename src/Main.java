import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        System.out.println("Adicione produtos ao estoque");
        ArrayList<Produtos> lista = new ArrayList<>();
        Estoque estoque = new Estoque(lista);

        int opc = 1;
        while (opc != 3) {

            System.out.println("Digite 3 para sair do programa e 2 para adicionar um novo produto e 1 para listar");
            opc = leitura.nextInt();
            leitura.nextLine();



            if (opc == 2) {
                System.out.print("Produto: ");
                String prod = leitura.nextLine();

                System.out.print("\nValor do produto: ");
                double valor = leitura.nextDouble();

                System.out.println("\nQuantidade disponível: ");
                int qtd = leitura.nextInt();


                Produtos produtos = new Produtos(prod, valor, qtd);
                lista.add(produtos);

                System.out.println("Item Adicionado!");
            } else if (opc == 1) {
                if (lista.size() == 0) {
                    System.out.println("Estoque vazio! adicione um produto antes de listar");
                } else {
                    System.out.println(estoque);
                }
            } else {
                System.out.println("Saindo do programa");
            }
        }

        System.out.println(estoque);




//        Scanner leitura = new Scanner(System.in);
//        System.out.println("Nome do Cliente");
//        String nome = leitura.nextLine();
//
//        System.out.println("Saldo do cliente: ");
//        double saldo = leitura.nextDouble();
//        Cliente c1 = new Cliente(nome, saldo);
//
//        int opc = 1;
//        while (opc != 0) {
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
//                System.out.println("Digite 0 para opc do programa e 1 para continuar comprando: ");
//                opc = leitura.nextInt();
//            } else {
//                System.out.println("Saldo insuficiente!");
//                opc = 0;
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
