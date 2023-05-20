package poo.padaria.usuarios;

import poo.padaria.menu.Padaria;
import poo.padaria.produtos.Produtos;

import java.util.Scanner;

public class Padeiro extends Funcionario {

    private Padaria padaria = new Padaria();


    public Padeiro(String nome, String cargo, int cargaHoraria) {
        super(nome, cargo, cargaHoraria);
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
                padaria.adicionarEstoque(produtos);
                System.out.println(qtd + " Unidade(s) de '" + prod + "' Adicionado(s) ao estoque!");

            } else if (opcao == 2) {
                System.out.println(padaria.getEstoquePadaria());
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