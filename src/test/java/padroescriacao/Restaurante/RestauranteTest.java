package padroescriacao.Restaurante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void deveGerarPedidoRestauranteItaliano() {
        FabricaAbstrata factory = new FabricaItaliana();
        Pedido pedido = factory.criarPedido();
        assertEquals("Pedido gerado", pedido.emitir());
    }

    @Test
    void deveGerarFaturaRestauranteItaliano() {
        FabricaAbstrata factory = new FabricaItaliana();
        Fatura fatura = factory.criarFatura();
        assertEquals("Fatura gerada", fatura.emitir());
    }

    @Test
    void deveGerarPedidoRestauranteMexicana() {
        FabricaAbstrata factory = new FabricaMexicana();
        Pedido pedido = factory.criarPedido();
        assertEquals("Pedido gerado", pedido.emitir());
    }

    @Test
    void deveGerarFaturaRestauranteMexicana() {
        FabricaAbstrata factory = new FabricaMexicana();
        Fatura fatura = factory.criarFatura();
        assertEquals("Fatura gerada", fatura.emitir());
    }
}








