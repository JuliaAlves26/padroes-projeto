package padroescriacao.abstractfactory.Medico;

public class FabricaEnfermeiro implements FabricaAbstrata {

    @Override
    public CertidaoColacaoGrau createCertidaoColacaoGrau() {
        return new CertidaoColacaoGrauEnfermeiro();
    }

    @Override
    public Diploma createDiploma() {
        return new DiplomaEnfermeiro();
    }
}
