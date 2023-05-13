import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Estoque estoque;

    public void menu(){

        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("========== Bem vindo ao JannyPaes ==========\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - sair");
            escolha = leitura.nextInt();

            switch (escolha) {

                case 0: {
                    System.out.println("========== Saindo do programa.... ==========");
                    break;
                }

                case 1: {
                    this.padeiro = new Padeiro("Kayo", "Padeiro", 4);
                    this.padeiro.administraEstoque();
                }

                case 2: {
                    System.out.println(padeiro.getEstoque());
                    System.out.println("aqui");
                }
            }
        }
    }
}
