package poo.padaria.usuarios;

import poo.padaria.produtos.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private int telefone;
    private List<Produtos> Carrinho;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCarrinho(List<Produtos> carrinho) {
        Carrinho = carrinho;
    }


    public Cliente(String nome) {
        this.nome = nome;
        this.Carrinho = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }


    public List<Produtos> getCarrinho() {
        return Carrinho;
    }

    public void adicionarProduto(Produtos produtos) {
        getCarrinho().add(produtos);
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.cpf;

    }
}