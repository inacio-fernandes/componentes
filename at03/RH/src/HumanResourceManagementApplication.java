public class HumanResourceManagementApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando aplicação de gerenciamento de recursos humanos...");

		IRCalculadoraFolhaPagamento calculadoraFolhaPagamento = new CalculadoraFolhaPagamento(10, 20, 8);
		ICalculadoraHorasTrabalhadas calculadoraHorasTrabalhadas = new CalculadoraHorasTrabalhadas();
		double salario = calculadoraFolhaPagamento.connect(calculadoraHorasTrabalhadas);

		System.out.println("Salário: " + salario);

	}

}