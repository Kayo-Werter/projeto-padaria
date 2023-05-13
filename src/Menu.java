import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;

    public void menu(){

        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Listar Funcionários");
            System.out.println("0 - sair");
            escolha = leitura.nextInt();

            switch (escolha) {
                case 1: {
                    this.padeiro = new Padeiro("Kayo", "Padeiro", 4);
                    this.padeiro.administraEstoque();
                }

                case 2: {
                    System.out.println("Ok");
                }
                case 0: {
                    System.out.println("Saindo...");
                    break;
                }

            }
        }
    }
}
