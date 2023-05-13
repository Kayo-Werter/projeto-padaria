import java.util.List;

public class Estoque {

    private List<Produtos> listaProdutos;
    private int tamanho;

    public Estoque(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public int tamanho(List<Produtos> listaProdutos) {
        return this.tamanho = listaProdutos.size() ;
    }

    @Override
    public String toString() {
        return " *************************** " +
                "Estoque" +
                " ***************************" +
                "\nProdutos em estoque: " + listaProdutos + "\n" +
                " ***************************";
    }
}
