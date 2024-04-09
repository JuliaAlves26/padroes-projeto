package padroescriacao.prototype;

public class Arma implements Cloneable {

    private String nomeArma;
    private String municao;


    public Arma(String nomeArma, String municao) {
        super();
        this.nomeArma = nomeArma;
        this.municao = municao;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public Arma setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
        return this;
    }

    public String getMunicao() {
        return municao;
    }

    public Arma setMunicao(String municao) {
        this.municao = municao;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nomeArma='" + nomeArma + '\'' +
                ", municao=" + municao +
                '}';
    }
}
