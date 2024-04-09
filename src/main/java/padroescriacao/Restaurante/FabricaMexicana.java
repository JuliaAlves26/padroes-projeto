package padroescriacao.Restaurante;

public class FabricaMexicana implements FabricaAbstrata{

    @Override
    public Pedido criarPedido() {
        return new Pedido();
    }

    @Override
    public Fatura criarFatura() {
        return new Fatura();
    }
}
