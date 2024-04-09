package padroescriacao.abstractfactory.Medico;

public class Documentos {

    private CertidaoColacaoGrau certidaoColacaoGrau;
    private Diploma diploma;

    public Documentos(FabricaAbstrata fabrica) {
        this.certidaoColacaoGrau = fabrica.createCertidaoColacaoGrau();
        this.diploma = fabrica.createDiploma();
    }

    public String emitirCertidaoColacaoGrau() {
        return this.certidaoColacaoGrau.emitir();
    }

    public String emitirDiploma() {
        return this.diploma.emitir();
    }
}
