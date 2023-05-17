import java.util.List;

public class Pedidos {
    private String data;
    private List<Produtos> listaProdutos;
    private double valorTotal;
    private Cliente cliente;

    public Pedidos(String data, List<Produtos> listaProdutos, double valorTotal, Cliente cliente) {
        this.data = data;
        this.listaProdutos = listaProdutos;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }
}
