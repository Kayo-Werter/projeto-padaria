import java.util.ArrayList;
import java.util.List;

public class Padaria {
  // private List<Funcionario> funcionarios = new ArrayList();
  // private List<Clientes> clientes = new ArrayList();
  private Estoque produtosEstoque = new Estoque();;


  
  
  public void visualizaEstoque() {
      System.out.println("========== Produtos Disponíveis ==========");
      this.produtosEstoque.registraEstoque();
      System.out.println(this.produtosEstoque.getListaProdutos());
  }

  
  
    
}
