
public class ValidadorEstoque implements IValidadorEstoque {
    int quantidadeDisponivel;

    public ValidadorEstoque(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public boolean validar(int quantidadeSolicitada) {
        return quantidadeDisponivel >= quantidadeSolicitada;
    }

    public void update(int quantidadeSolicitada) {
        if (validar(quantidadeSolicitada)) {
            System.out.println("Processado");
        } else {
            System.out.println(" Erro");
        }
    }
}