package padroescriacao.abstractfactory;

import padroescriacao.abstractfactory.Parecer;

public class ParecerPJ implements Parecer {
    public String emitir() {
        return "Parecer para pessoa jurídica emitido";
    }
}
