package poo.padaria.produtos;

public class Desconto {
    private double valorOriginal;
    private double percentualDesconto;

    public Desconto(double valorOriginal, double percentualDesconto) {
        this.valorOriginal = valorOriginal;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularDesconto() {
        double desconto = valorOriginal * (percentualDesconto / 100);
        return desconto;
    }

    public double calcularValorComDesconto() {
        double valorComDesconto = valorOriginal - calcularDesconto();
        return valorComDesconto;
    }

    // Getters e Setters

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}