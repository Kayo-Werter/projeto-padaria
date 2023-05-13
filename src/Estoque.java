import java.util.List;

public class Estoque {

    private List<Produtos> listaProdutos;


    public Estoque(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }


    @Override
    public String toString() {
        return " *************************** " +
                "Estoque" +
                " ***************************" +
                "\nProdutos: " + listaProdutos + "\n" +
                " ***************************";
    }
}
