package poo.padaria.usuarios;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int cargaHoraria;
    public double valorHora;

    public Funcionario(String nome, String cargo, int cargaHoraria) {
        this.nome = nome;
        this.cargo = cargo;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = cargaHoraria * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
<<<<<<< Updated upstream:src/poo/padaria/usuarios/Funcionario.java

    public static class Gerente extends Funcionario {


        public Gerente(String nome, String cargo, int cargaHoraria) {
            super(nome, cargo, cargaHoraria);
        }




        @Override
        public double getSalario(){
            return getCargaHoraria() * 10;
        }
    }

    @Override
    public String toString() {
        return "\nFuncionario: " + nome +
                ", cargo: " + cargo;
    }
}
=======
}
>>>>>>> Stashed changes:src/Funcionario.java
