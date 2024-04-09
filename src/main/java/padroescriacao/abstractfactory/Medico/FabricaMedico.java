package padroescriacao.abstractfactory.Medico;

public class FabricaMedico implements FabricaAbstrata{

    @Override
    public CertidaoColacaoGrau createCertidaoColacaoGrau() {
        return new CertidaoColacaoGrauMedico();
    }

    @Override
    public Diploma createDiploma() {
        return new DiplomaMedico();
    }
}
