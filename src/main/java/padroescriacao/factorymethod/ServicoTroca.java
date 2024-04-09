package padroescriacao.factorymethod;

public class ServicoTroca implements IServico {
        public String executar() {
            return "Serviço de troca realizado com sucesso.";
        }

        public String cancelar() {
            return "Troca cancelada.";
        }
    }

