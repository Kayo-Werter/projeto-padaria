package poo.padaria.menu;

import poo.padaria.produtos.Estoque;
import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Estoque estoque;
    private Gerente gerente;
    private Padaria padaria;

    public Menu() {
        padaria = new Padaria();
        padaria.inicializar();
    }

    public void menuInicial () {
         System.out.println("");


         Scanner leitura = new Scanner(System.in);
         int escolha = 999;

         System.out.println("========== Bem vindo ao JannyPaes ==========\n");
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
                 menuFuncionarios();
             }
         }
     }

     public void menuFuncionarios(){
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
                 this.menuPadeiro();
             }
         }
     }

     public void menuGerente() {
         int escolha = 999;

         while (escolha != 0) {
             Scanner leitura = new Scanner(System.in);
             System.out.println("========== Bem vindo ao JannyPaes ==========\n");
             System.out.println("Olá gerente ");
             System.out.println("Escolha uma opção para iniciar");
             System.out.println("1 - Adicionar novo funcionário");
             System.out.println("2 - Verificar salario");
             System.out.println("0 - sair");
             escolha = leitura.nextInt();

             if (escolha == 0) {
                 System.out.println("========== Saindo do programa.... ==========");
                 break;
             } else if (escolha == 1) {
                 System.out.println("Nome do funcionário: ");
                 String nome = leitura.nextLine();
                 System.out.println("Cargo do funcionário: ");
                 String cargo = leitura.nextLine();
                 System.out.println("Carga Horária diária: ");
                 int ch = leitura.nextInt();
                 this.padeiro = new Padeiro(nome, cargo, ch);
             } else if (escolha == 2) {
             System.out.println(padaria.getGerente().getSalario());
         }
         }
     }


     public void menuPadeiro(){

         int escolha = 999;

         while (escolha != 0) {
             Scanner leitura = new Scanner(System.in);

             System.out.println("========== Bem vindo ao Menu do Padeiro ==========\n");
             System.out.println("Escolha uma opção:");
             System.out.println("1 - Administrar Estoque");
             System.out.println("2 - Verificar salário");
             System.out.println("0 - sair do Menu");
             escolha = leitura.nextInt();

             if (escolha == 0) {
                     System.out.println("========== Saindo do programa.... ==========");
                     break;
             } else if (escolha == 1) {
                 padeiro.administraEstoque();
             } else if (escolha == 2) {
                 System.out.println(padaria.getPadeiro().getSalario());
             }
         }
     }

     public void menuCliente() {
         int escolha = 999;
         Estoque estoque = new Estoque();

         while (escolha != 0) {
             Scanner leitura = new Scanner(System.in);

             System.out.println("========== Bem vindo ao JannyPaes ==========\n");
             System.out.println("Escolha uma opção:");
             System.out.println("1 - Vizualizar lista"); //adicionar ao carrinho e remorer
             System.out.println("2 - Ver carrinho");// finalizar compra com desconto ou sair
             System.out.println("0 - sair");
             escolha = leitura.nextInt();

             if (escolha == 0) {
                 System.out.println("========== Saindo do programa.... ==========");
                 break;
             } else if (escolha == 1) {
                 System.out.println("Deseja adicionar um desses produtos ? ");
                 System.out.println("5 - Sim e 6 - Não");
                 System.out.println(estoque.getListaProdutos());

             } else if (escolha == 2) {
                 System.out.println("carrinho");
             }
         }
     }

}
  