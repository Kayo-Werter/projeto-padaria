package poo.padaria.usuarios;

public class Gerente extends Funcionario{


    public Gerente(String nome, String cargo, int cargaHoraria) {
        super(nome, cargo, cargaHoraria);
    }




    @Override
    public double getSalario(){
        return getCargaHoraria() * 10;
    }
}
