<<<<<<< Updated upstream:src/poo/padaria/produtos/HistoricoDeCompras.java
package poo.padaria.produtos;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> Stashed changes:src/HistoricoDeCompras.java

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
