package padroescriacao.abstractfactory.Medico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {

    @Test
    void deveEmitirDiplomaMedico() {
        FabricaAbstrata fabrica = new FabricaMedico();
        Documentos documentos = new Documentos(fabrica);
        assertEquals("Diploma para médico emitido", documentos.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaEnfermeiro() {
        FabricaAbstrata fabrica = new FabricaEnfermeiro();
        Documentos documentos = new Documentos(fabrica);
        assertEquals("Diploma para Enfermeiro emitido", documentos.emitirDiploma());
    }

    @Test
    void deveEmitirCertidaoColacaoGrauMedico() {
        FabricaAbstrata fabrica = new FabricaMedico();
        Documentos documentos = new Documentos(fabrica);
        assertEquals("Certidão de Colação de Grau para médico redigido", documentos.emitirCertidaoColacaoGrau());
    }

    @Test
    void deveEmitirCertidaoColacaoGrauEnfermeiro() {
        FabricaAbstrata fabrica = new FabricaEnfermeiro();
        Documentos documentos = new Documentos(fabrica);
        assertEquals("Certidão de Colação de Grau para enfermeiro redigido", documentos.emitirCertidaoColacaoGrau());
    }
}
