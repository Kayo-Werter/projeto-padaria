package poo.padaria.usuarios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Cliente> clientes;
    private String cliente;
    private String cpf;
    private String nascimento;

    public Cliente(String cliente, String cpf, String nascimento) {
        clientes = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void adicionarCliente(String cliente, String cpf, String nascimento) {
        ClienteInfo novoCliente = new ClienteInfo(cliente, cpf, nascimento);
        clientes.add(novoCliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<ClienteInfo> getClientes() {
        return clientes;
    }

    // Adicionar clientes ao ArrayList
        cliente.adicionarCliente("Cliente 1", "12345678901", "01/01/2000");
        cliente.adicionarCliente("Cliente 2", "98765432109", "02/02/1995");
        cliente.adicionarCliente("Cliente 3", "45678912345", "03/03/1985");