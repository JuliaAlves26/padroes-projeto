package padroescriacao.abstractfactory;

public class Advogado {

    private Contrato contrato;
    private Parecer parecer;

    public Advogado(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.parecer = fabrica.createParecer();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirParecer() {
        return this.parecer.emitir();
    }
}

