package padroescriacao.abstractfactory;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Parecer createParecer() {
        return new ParecerPJ();
    }
}
