import java.util.Scanner;

public class Menu {
    private int opcao;
    private Padeiro padeiro;
    private Estoque estoque;
    private Gerente gerente;



    public void menuInicial (Gerente g1, Padeiro p1, Cliente c1) {
        System.out.println("");

        Estoque estoque = new Estoque();
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
                menuGerente(g1);
            } else if (escolha == 2) {
                this.menuPadeiro(p1);
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
                p1.administraEstoque();
            } else if (escolha == 2) {
                System.out.println(p1.getSalario());
            }
        }
    }

    public void menuCliente(Cliente c1) {
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
                System.out.println(this.estoque);

            } else if (escolha == 2) {
                System.out.println("carrinho");
            }
        }
    }

}

