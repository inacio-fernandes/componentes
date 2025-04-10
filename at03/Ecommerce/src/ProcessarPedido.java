

// Update the ProcessarPedido class to implement the interface
public class ProcessarPedido implements IRProcessarPedido {
    private int quantidadeSolicitada;

    public ProcessarPedido(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    @Override
    public void connect(IValidadorEstoque componente) {
        componente.update(quantidadeSolicitada);
    }
}