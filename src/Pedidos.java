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


    //Criar Metodo de desconto (> 50 = 10%)
    public static double calcularDesconto(double valorTotal) {
        if (valorTotal <= 50) {
            return valorTotal;
        } else {
            double desconto = valorTotal * 0.1;
            double valorComDesconto = valorTotal - desconto;
            return valorComDesconto;

        }
    }
}
