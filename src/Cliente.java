import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;
    private List<Produtos> historicoCompras;
    private double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.historicoCompras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public List<Produtos> getHistoricoDeCompras() {
        return historicoCompras;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean lancaCompra(Produtos produtos){
        if (this.saldo >= produtos.getValor()) {
            this.saldo -= produtos.getValor();
            this.historicoCompras.add(produtos);
            return true;
        }
        return false;
    }

}
