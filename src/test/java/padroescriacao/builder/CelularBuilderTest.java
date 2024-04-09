package padroescriacao.builder.Celular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CelularBuilderTest {

    @Test
    void deveRetornarExcecaoParaCelularSemId() {
        try {
            CelularBuilder celularBuilder = new CelularBuilder();
            Celular celular = celularBuilder
                    .setModelo("galaxy s23")
                    .setMarca("samsung ")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCelularSemNome() {
        try {
            CelularBuilder celularBuilder = new CelularBuilder();
            Celular celular = celularBuilder
                    .setId(1)
                    .setCor("preto")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        CelularBuilder celularBuilder = new CelularBuilder();
        Celular celular = celularBuilder
                .setId(1)
                .setModelo("galaxy s23")
                .setCor("preto")
                .build();

        assertNotNull(celular);
    }
}

