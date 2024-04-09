package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoDevolucaoTest {
    @Test
    void deveExecutarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Devolução realizada com sucesso.", servico.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IServico servico = ServicoFactory.obterServico("Devolucao");
        assertEquals("Devolução cancelada.", servico.cancelar());
    }
}

