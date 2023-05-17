public class Gerente extends Funcionario{

    private Padaria padaria;
    public Gerente(String nome, String cargo, int cargaHoraria) {
        super(nome, cargo, cargaHoraria);
    }


    public Padaria getPadaria() {
        return padaria;
    }

    public void setPadaria(Padaria padaria) {
        this.padaria = padaria;
    }

    @Override
    public double getSalario(){
        return getCargaHoraria() * 10;
    }

    public void adicionarProduto(String nome, double valor, int quantidade) {
        
        Produto produto = new produto(nome, valor, quantidade);
        padaria.getListaCarrinho().addProduto;
    }

}
