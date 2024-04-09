package padroescriacao.abstractfactory;

public class FabricaPF implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Parecer createParecer() {
        return new ParecerPF();
    }
}

