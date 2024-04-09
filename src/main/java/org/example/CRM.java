package org.example;

public class CRM {

    private CRM() {};
    private static CRM instance = new CRM();
    public static CRM getInstance() {
        return instance;
    }

    private String numeroCRM;
    private String especialidade;

    public String getNumeroCRM() {
        return numeroCRM;
    }

    public void setNumeroCRM(String numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
