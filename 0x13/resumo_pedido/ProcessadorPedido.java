import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {

    ProvedorFrete provedorFrete;

    public ProcessadorPedido() {
    }

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }


    public void processar(Pedido pedido) {
        double peso = pedido.getPeso();
        double valorFrete = pedido.getTotal();
        Frete frete = provedorFrete.calcularFrete(peso, valorFrete);
        pedido.setFrete(frete);
    }
}