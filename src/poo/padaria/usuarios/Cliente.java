package poo.padaria.usuarios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String nascimento;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCliente() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }


    @Override
    public String toString() {
        return "\nCliente: " + nome +
                ", cpf: " + cpf;
    }
}
