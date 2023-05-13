public class Produtos implements Comparable<Produtos>{
    private String nome;
    private double valor;
    private int quantidade;

    public Produtos(String descricao, double valor, int quantidade) {
        this.nome = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }




    @Override
    public String toString() {
        return "\nproduto = " + nome +
                "\nvalor = " + valor +
                "\nQuantidade = " + quantidade + "\n";
    }

    @Override
    public int compareTo(Produtos outroProduto) {
        return Double.compare(this.valor, outroProduto.valor);
    }
}
