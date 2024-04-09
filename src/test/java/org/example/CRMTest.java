package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CRMTest {

    @Test
    public void deveRetornarNumeroCRM() {
        CRM.getInstance().setNumeroCRM("12391");
        assertEquals("12391", CRM.getInstance().getNumeroCRM());
    }

    @Test
    public void deveRetornarEspecialidade() {
        CRM.getInstance().setEspecialidade("Cardiologia");
        assertEquals("Cardiologia", CRM.getInstance().getEspecialidade());
    }
}