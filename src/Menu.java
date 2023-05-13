import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Estoque estoque;
    private Gerente gerente;

    public void menuGeral(Gerente g1, Padeiro p1){
        Scanner leitura = new Scanner(System.in);
        int escolha = 999;

        System.out.println("========== Bem vindo ao JannyPaes ==========\n");
        System.out.println("Para iniciarmos me diga qual o seu cargo");
        System.out.println("1 - Gerente");
        System.out.println("2 - Padeiro");
        System.out.println("0 - sair");
        escolha = leitura.nextInt();


        while (escolha != 0) {
            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
                break;
            } else if (escolha == 1) {
                menuGerente(g1);
            } else if (escolha == 2) {
            menuPadeiro(p1);
        }
        }
    }

    public void menuGerente(Gerente g1) {
        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("========== Bem vindo ao JannyPaes ==========\n");
            System.out.println("Olá gerente " + g1.getNome());
            System.out.println("Escolha uma opção para iniciar");
            System.out.println("1 - Adicionar novo funcionário");
            System.out.println("2 - Listar produtos");
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
            }
        }
    }



    public void menuPadeiro(Padeiro p1){

        int escolha = 999;

        while (escolha != 0) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("========== Bem vindo ao JannyPaes ==========\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar novo funcionário");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - sair");
            escolha = leitura.nextInt();

            if (escolha == 0) {
                System.out.println("========== Saindo do programa.... ==========");
                break;
            } else if (escolha == 1) {
                this.padeiro.administraEstoque();
            } else if (escolha == 2) {
                System.out.println(padeiro.getEstoque());
            }

        }
    }
}
