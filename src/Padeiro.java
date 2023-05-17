import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Padeiro extends Funcionario {

    private Estoque estoque = new Estoque();


    public Padeiro(String nome, String cargo, int cargaHoraria) {
        super(nome, cargo, cargaHoraria);
    }

    public Estoque getEstoque() {
        return estoque;
    }


    public void administraEstoque() {

        Scanner leitura = new Scanner(System.in);
        System.out.println("========== Administrando o estoque ==========");

        int opcao = 1;
        while (opcao != 3) {

            System.out.println("1 - Adicionar produtos ao estoque");
            System.out.println("2 - Listar produtos no estoque");
            System.out.println("3 - Sair do estoque");
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1) {
                System.out.println("========== Adicionando produtos ==========");
                System.out.print("Produto: ");
                String prod = leitura.nextLine();

                System.out.print("\nValor do produto: ");
                double valor = leitura.nextDouble();

                System.out.println("\nQuantidade disponível: ");
                int qtd = leitura.nextInt();

                Produtos produtos = new Produtos(prod, valor, qtd);
                getEstoque().adicionarEstoque(produtos);
                System.out.println(qtd + " Unidade(s) de '" + prod + "' Adicionado(s) ao estoque!");

            } else if (opcao == 2) {
                if (getEstoque().tamanhoEstoque() == 0) {
                    System.out.println("Estoque vazio! adicione um produto antes de listar");
                } else {
                    System.out.println(this.estoque);
                }
            } else if (opcao == 3) {
                System.out.println("========== Saindo do estoque ==========");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    @Override
    public double getSalario() {
        return (getCargaHoraria() * 4) * 7.5;
    }


}