package poo.padaria.menu;

import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Gerente gerente;
    private Padaria padaria;

    public Menu(Padaria padaria) {
        this.padaria = padaria;
        padaria.produtosEstoque();
    }


    public void menuInicial (Padeiro p1) {


        Scanner leitura = new Scanner(System.in);
        int escolha = 999;

        System.out.println("========== Bem vindo ao JannyPaes ==========\n");
        System.out.println("");
        System.out.println("1 - Sou cliente");
        System.out.println("2 - Desejo ser cliente");
        System.out.println("3 - Sou funcionário");
        System.out.println("0 - sair");
        escolha = leitura.nextInt();

        while (escolha != 0) {

            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
                break;
            } else if (escolha == 1) {
                menuCliente();
            } else if (escolha == 2) {
                // Falta construir função para criar um novo cliente
                break;
            } else if (escolha == 3) {
                menuFuncionarios(p1);
            }
        }
    }

    public void menuFuncionarios(Padeiro p1){
        Scanner leitura = new Scanner(System.in);
        int escolha = 999;

        System.out.println("========== Bem vindo ao JannyPaes ==========\n");
        System.out.println("Digite: ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Padeiro");
        System.out.println("0 - sair");
        escolha = leitura.nextInt();

        while (escolha != 0) {
            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
                break;
            } else if (escolha == 1) {
                menuGerente();
            } else if (escolha == 2) {
                this.menuPadeiro(p1);
            }
        }
    }

    public void menuGerente() {
        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("========== Bem vindo ao JannyPaes ==========\n");
            System.out.println("Olá gerente! ");
            System.out.println("Escolha uma opção para iniciar");
            System.out.println("1 - Adicionar novo funcionário");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - sair");
            escolha = leitura.nextInt();

            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
            } else if (escolha == 1) {
                System.out.println("Nome do funcionário: ");
                String nome = leitura.nextLine();

                System.out.println("Cargo do funcionário: ");
                String cargo = leitura.nextLine();

                System.out.println("Carga Horária diária: ");
                int ch = leitura.nextInt();

                padeiro = new Padeiro(nome, cargo, ch);
                padaria.adicionarFuncionario(padeiro);
                System.out.println("Adicionado com sucesso! ");
            }
        }
    }


    public void menuPadeiro(Padeiro p1){

        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("========== Bem vindo ao poo.padaria.menu.Menu do poo.padaria.funcionarios.Padeiro ==========\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Administrar poo.padaria.produtos.Estoque");
            System.out.println("2 - Verificar salário");
            System.out.println("0 - sair do poo.padaria.menu.Menu");
            escolha = leitura.nextInt();

            if (escolha == 0) {
                    System.out.println("========== Saindo do programa.... ==========");
                    break;
            } else if (escolha == 1) {
                p1.administraEstoque();
            } else if (escolha == 2) {
                System.out.println(p1.getSalario());
            }
        }
    }

    public void menuCliente() {
        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("========== Bem vindo ao JannyPaes ==========\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Vizualizar produtos");
            System.out.println("2 - Ver carrinho");
            System.out.println("0 - sair");
            escolha = leitura.nextInt();

            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
            } else if (escolha == 1) {
                System.out.println(padaria.getEstoquePadaria());

            } else if (escolha == 2) {
                System.out.println("carrinho");
            }
        }
    }

}

