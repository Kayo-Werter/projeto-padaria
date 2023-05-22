import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Padaria {

    private List<Produtos> listaProdutos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    private List<HistoricoDeCompras> historicoDeVendas = new ArrayList<>();

    private Gerente gerente;


    public void cadastroCliente(String nome, String cpf) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = leitura.nextLine();

        System.out.println("CPF: ");
        cpf = leitura.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        this.listaClientes.add(cliente);
    }



    public void registrarPedidos(HistoricoDeCompras historicoDeCompras) {
        this.historicoDeVendas.add(historicoDeCompras);
    }


    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public List<HistoricoDeCompras> visualizacao(){
        return historicoDeVendas;
    }




    public void dadosPadaria() {
        Cliente malena = new Cliente("malena", "12312332132");
        Cliente pablo = new Cliente("pablo", "12312343434");
        Cliente sormany = new Cliente("Sormany", "8798798123");
        Cliente angelica = new Cliente("Angelica", "8780913213");
        Cliente camila = new Cliente("Camila", "08739162378623");

        this.listaClientes.add(malena);
        this.listaClientes.add(pablo);
        this.listaClientes.add(sormany);
        this.listaClientes.add(angelica);
        this.listaClientes.add(camila);

        Produtos pao = new Produtos("Pão", 1.75, 10);
        Produtos boloLeite = new Produtos("bolo de leite", 18, 4);
        Produtos boloFofo = new Produtos("bolo fofo", 15, 7);
        Produtos presunto = new Produtos("presunto", 5.90, 30);
        Produtos mussarela = new Produtos("mussarela", 8.70, 30);

        this.listaProdutos.add(pao);
        this.listaProdutos.add(boloLeite);
        this.listaProdutos.add(boloFofo);
        this.listaProdutos.add(presunto);
        this.listaProdutos.add(mussarela);

        Padeiro chines = new Padeiro("Chines", "Padeiro", 44);
        Padeiro kayo = new Padeiro("Kayo", "Padeiro", 44);
        Gerente janny = new Gerente("Janny", "Gerente", 20);

        this.listaFuncionarios.add(chines);
        this.listaFuncionarios.add(kayo);
        this.listaFuncionarios.add(janny);
    }



}