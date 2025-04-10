public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println("Ecommerce Application is running...");
		IValidadorEstoque validador = new ValidadorEstoque(20);
		ProcessarPedido pedido = new ProcessarPedido(50);//é para dar erro

		pedido.connect(validador);
	}

}