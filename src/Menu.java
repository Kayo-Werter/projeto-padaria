import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Estoque estoque;
    private Gerente gerente;
<<<<<<< HEAD
    

    public void menuInicial(Padeiro p1, Gerente g1, Cliente c1) {
=======


    public void menuInicial (Padeiro p1, Gerente g1, Cliente c1) {
>>>>>>> parent of 9b852c4 (corrigir erro)
        Scanner leitura = new Scanner(System.in);
        int escolha = 999;

        String menu = """
                ========== Bem vindo ao JannyPaes ==========\n
                1 - Sou cliente
                2 - Desejo ser cliente
                3 - Sou funcionário
                0 - sair
                """;
        System.out.println(menu);
        escolha = leitura.nextInt();

        while (escolha != 0) {
            if (escolha == 1) {
            menuCliente(c1);
            } else if (escolha == 2) {
                // Falta construir função para criar um novo cliente
                break;
            } else if (escolha == 3) {
                menuFuncionarios(g1, p1);
            }
        }
    }

    public void menuFuncionarios(Gerente g1, Padeiro p1){
        Scanner leitura = new Scanner(System.in);
        int escolha = 999;

        String menu = """
                ========== Bem vindo ao JannyPaes ==========\n
                Digite: 1 - Gerente
                        2 - Padeiro
                        0 - sair
                
                """;
        System.out.println(menu);
        escolha = leitura.nextInt();

        while (escolha != 0) {
            if (escolha == 1) {
                menuGerente(g1);
            } else if (escolha == 2) {
<<<<<<< Updated upstream
            this.menuPadeiro(p1);
        }
=======
                this.menuPadeiro(p1);

            }
>>>>>>> Stashed changes
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

    public void menuCliente(Cliente c1) {
        // O cliente poderá visualizar os produtos, colocar produtos no carrinho, finalizar a compra e
        // e vizualizar o desconto disponivel

    }




}
