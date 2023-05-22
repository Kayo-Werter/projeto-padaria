package poo.padaria.produtos;

import poo.padaria.usuarios.Cliente;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDeCompras {
    private String data;
    private Cliente cliente;
    private List<Produtos> listaProdutos = new ArrayList<>();
    private double valorTotal = 1;

    public HistoricoDeCompras(String data, Cliente cliente, List<Produtos> listaProdutos) {
        this.data = data;
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;

    }


    @Override
    public String toString() {
        return "==========" +
                " Vendas realizadas " +
                "==========" +
                "\nData: " + this.data +
                "\nCliente: " + this.cliente +
                "\nProdutos: " + listaProdutos;
    }



}