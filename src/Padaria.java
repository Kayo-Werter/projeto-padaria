import javax.management.openmbean.ArrayType;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private Estoque estoque;

    ArrayList<Pedidos> listaCarrinho = new ArrayList<>();

    public ArrayList<Pedidos> getListaCarrinho() {
        return listaCarrinho;
    }

    public void setListaCarrinho(ArrayList<Pedidos> listaCarrinho) {
        this.listaCarrinho = listaCarrinho;
    }
}















//    ArrayList<Produtos> listaProdutos = new ArrayList<>();
//
//    ArrayList<Cliente> listaClientes = new ArrayList<>();
//
//    ArrayList<Padeiro> listaFuncionarios = new ArrayList<>();
//
//    //Setts e Gets
//    public ArrayList<Produtos> getListaProdutos() {
//        return listaProdutos;
//    }
//
//    public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
//        this.listaProdutos = listaProdutos;
//    }
//
//    public ArrayList<Cliente> getListaClientes() {
//        return listaClientes;
//    }
//
//    public void setListaClientes(ArrayList<Cliente> listaClientes) {
//        this.listaClientes = listaClientes;
//    }
//
//    public ArrayList<Padeiro> getListaFuncionarios() {
//        return listaFuncionarios;
//    }
//
//    public void setListaFuncionarios(ArrayList<Padeiro> listaFuncionarios) {
//        this.listaFuncionarios = listaFuncionarios;
//    }
//
//
//}
