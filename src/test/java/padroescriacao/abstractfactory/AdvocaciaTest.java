package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvocaciaTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Advogado advogado = new Advogado(fabrica);
        assertEquals("Contrato para pessoa física redigido", advogado.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Advogado advogado = new Advogado(fabrica);
        assertEquals("Contrato para pessoa jurídica redigido", advogado.emitirContrato());
    }

    @Test
    void deveEmitirParecerPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Advogado advogado = new Advogado(fabrica);
        assertEquals("Parecer para pessoa física emitido", advogado.emitirParecer());
    }

    @Test
    void deveEmitirParecerPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Advogado advogado = new Advogado(fabrica);
        assertEquals("Parecer para pessoa jurídica emitido", advogado.emitirParecer());
    }

}




