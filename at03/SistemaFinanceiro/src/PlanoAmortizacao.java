public class PlanoAmortizacao implements IPlanoAmortizacao {
    public void update(double valorFinal, double taxa, int periodo) {
        double parcela = valorFinal / periodo;
        System.out.println("Montante: " + valorFinal);

        for (int i = periodo; i > 0; i--) {
            double desconto = parcela / Math.pow(1 + taxa, i);
            System.out.println("-");
            System.out.println("Antecipação da parcela " + i);
            System.out.printf("Valor com desconto: %.2f\n", desconto);
            System.out.printf("Economia: %.2f\n", parcela - desconto);
            System.out.println("-");
        }
    }
}