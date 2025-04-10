public class CalculadoraJuros implements IRCalculadoraJuros {
    private double valorInicial;
    private double taxaJuros;
    private int periodo;

    public CalculadoraJuros(double valorInicial, double taxaJuros, int periodo) {
        this.valorInicial = valorInicial;
        this.taxaJuros = taxaJuros;
        this.periodo = periodo;
    }

    public double calcularValorFinal() {
        return this.valorInicial * Math.pow(1 + this.taxaJuros, this.periodo);
    }

    public void connect(IPlanoAmortizacao componente) {
        componente.update(this.calcularValorFinal(), this.taxaJuros, this.periodo);
    }

}
