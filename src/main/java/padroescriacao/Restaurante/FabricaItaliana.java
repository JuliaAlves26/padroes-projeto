package padroescriacao.Restaurante;

public class FabricaItaliana implements FabricaAbstrata {

    @Override
    public Pedido criarPedido() {
        return new Pedido();
    }


    @Override
    public Fatura criarFatura() {
        return new Fatura();
    }
}
