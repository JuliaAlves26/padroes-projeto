package padroescriacao.prototype.CartaoVisita;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartaodeVisitaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        CartaodeVisita cartaodeVisita = new CartaodeVisita("Ana Original", "Desenvolvedor", new Modelo("020", "012"));

        CartaodeVisita cartaodeVisitaClone = cartaodeVisita.clone();
        cartaodeVisitaClone.setNome("Ana Clonado");
        cartaodeVisitaClone.setCargo("Desenvolvedor");
        cartaodeVisitaClone.getModelo().setNomeModelo("Padrão");

        assertEquals("CartaodeVisita{nome='Ana Original', cargo=Desenvolvedor, modelo=Modelo{CartaoPadrao='020', CartaoExecutivo='012'}}", cartaodeVisita.toString());
        assertEquals("CartaodeVisita{nome='Ana Clonado', cargo=Desenvolvedor, modelo=Modelo{CartaoPadrao='020', CartaoExecutivo='012'}}", cartaodeVisitaClone.toString());
    }
}

