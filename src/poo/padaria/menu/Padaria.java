package poo.padaria.menu;

import poo.padaria.produtos.Produtos;
import poo.padaria.usuarios.Cliente;
import poo.padaria.usuarios.Funcionario;
import poo.padaria.usuarios.Gerente;
import poo.padaria.usuarios.Padeiro;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Produtos> estoquePadaria = new ArrayList<>();
    private List<Funcionario> funcionariosPadaria = new ArrayList<>();



    public String getListaClientes() {
        return "=============== Clientes Cadastrados ===============" +
                listaClientes +
                "\n===================================================";
    }

    public void clientesCadastrados(){
        Cliente cliente1 = new Cliente("malena", "12312332132");
        Cliente cliente2 = new Cliente("pablo", "12312343434");
        Cliente cliente3 = new Cliente("Sormany", "8798798123");
        Cliente cliente4 = new Cliente("Angelica", "8780913213");
        Cliente cliente5 = new Cliente("Camila", "08739162378623");

        this.listaClientes.add(cliente1);
        this.listaClientes.add(cliente2);
        this.listaClientes.add(cliente3);
        this.listaClientes.add(cliente4);
        this.listaClientes.add(cliente5);

    }

    public void adicionarClientes(Cliente cliente){
        this.listaClientes.add(cliente);
    }

    public String getEstoquePadaria() {
        return "==========" +
                " Produto Disponíveis no estoque " +
                "==========" +
                estoquePadaria;
    }

    public void produtosEstoque() {
        Produtos pao = new Produtos("Pão", 1.75, 10);
        Produtos boloLeite = new Produtos("bolo de leite", 18, 4);
        Produtos boloFofo = new Produtos("bolo fofo", 15, 7);
        Produtos presunto = new Produtos("presunto", 5.90, 30);
        Produtos mussarela = new Produtos("mussarela", 8.70, 30);

        this.estoquePadaria.add(pao);
        this.estoquePadaria.add(boloLeite);
        this.estoquePadaria.add(boloFofo);
        this.estoquePadaria.add(presunto);
        this.estoquePadaria.add(mussarela);
    }

    public void adicionarEstoque(Produtos produtos) {
        this.estoquePadaria.add(produtos);
    }


    public void funcionariosCadastrados() {
        Padeiro padeiro1 = new Padeiro("Chines", "Padeiro", 44);
        Padeiro padeiro2 = new Padeiro("Kayo", "Padeiro", 44);
        Gerente gerente1 = new Gerente("Janny", "Gerente", 20);

        this.funcionariosPadaria.add(padeiro1);
        this.funcionariosPadaria.add(padeiro2);
        this.funcionariosPadaria.add(gerente1);

    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionariosPadaria.add(funcionario);
    }


    public String getFuncionariosCadastrados() {
        return "=============== Funcionarios Cadastrados ===============\n" +
                funcionariosPadaria +
                "\n===================================================";
    }


}
