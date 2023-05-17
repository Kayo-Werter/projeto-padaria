import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;
    private List<Produtos> Carrinho;

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
}