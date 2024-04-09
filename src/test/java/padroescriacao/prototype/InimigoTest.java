package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InimigoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Inimigo inimigo = new Inimigo("Mr.Kenderley Original", "600", new Arma("AK47", "762"));

        Inimigo inimigoClone = inimigo.clone();
        inimigoClone.setNome("Mr.Kenderley Clonado");
        inimigoClone.setForca("100");
        inimigoClone.getArma().setNomeArma("M4A4");

        assertEquals("Inimigo{nome='Mr.Kenderley Original', forca=600, arma=Arma{nomeArma='AK47', municao=762}}", inimigo.toString());
        assertEquals("Inimigo{nome='Mr.Kenderley Clonado', forca=100, arma=Arma{nomeArma='M4A4', municao=762}}", inimigoClone.toString());

    }
}