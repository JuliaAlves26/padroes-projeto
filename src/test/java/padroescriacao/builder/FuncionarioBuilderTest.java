package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioBuilderTest {

    @Test
    void deveRetirnarExcesaoParaFuncionarioSemId() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Funcinario 1")
                    .setEmail("funcionario1@email.com")
                    .build();
            fail();
    } catch (IllegalArgumentException e) {
         assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setId(1)
                    .setEmail("funcionario1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComEmailInvalido() {
        try {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                    .setId(1)
                    .setNome("Funcinario 1")
                    .setEmail("funcionario1.com")
                    .build();

        fail();
    } catch (IllegalArgumentException e ) {
            assertEquals("Email inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido() {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setId(1)
                .setNome("Funcinario 001")
                .setEmail("funcionario1@email.com")
                .build();

        assertNotNull(funcionario);
    }
}