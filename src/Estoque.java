import java.util.ArrayList;
import java.util.List;

public class Estoque {

  private List<Produtos> listaProdutos = new ArrayList();



  public List<Produtos> getListaProdutos() {
      return listaProdutos;
  }


  public void setListaProdutos(List<Produtos> listaProdutos) {
    this.listaProdutos = listaProdutos;
  }

  public void registraEstoque() {
    Produtos pao = new Produtos("Pão", 1.75, 10);
    Produtos boloLeite = new Produtos("bolo de leite", 18, 4);
    Produtos boloFofo = new Produtos("bolo fofo", 15, 7);
    Produtos presunto = new Produtos("presunto", 5.90, 30);
    Produtos mussarela = new Produtos("mussarela", 8.70, 30);

    this.listaProdutos.add(pao);
    this.listaProdutos.add(boloLeite);
    this.listaProdutos.add(boloFofo);
    this.listaProdutos.add(presunto);
    this.listaProdutos.add(mussarela);
  }

  
  
    @Override
    public String toString() {
        return "==========" +
                " Produto no estoque " +
                "==========" +
                listaProdutos;
    }
}
