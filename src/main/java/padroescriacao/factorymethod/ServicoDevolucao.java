package padroescriacao.factorymethod;

public class ServicoDevolucao implements IServico {
        public String executar() {
            return "Devolução realizada com sucesso.";
        }

        public String cancelar() {
            return "Devolução cancelada.";
        }
    }

