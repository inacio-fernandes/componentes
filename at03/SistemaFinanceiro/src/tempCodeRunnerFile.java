public class Main {
    public static void main(String[] args) {
        IRCalculadoraJuros calculadora = new CalculadoraJuros(2000, 0.1, 12);
        IPlanoAmortizacao gerador = new PlanoAmortizacao();
        calculadora.connect(gerador);
    }
}



