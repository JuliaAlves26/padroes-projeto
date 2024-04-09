package padroescriacao.prototype;

public class Inimigo implements Cloneable {

    private String nome;
    private String forca;
    private Arma arma;

    public Inimigo(String nome, String forca, Arma arma) {
        this.nome = nome;
        this.forca = forca;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public Inimigo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getForca() {
        return forca;
    }

    public Inimigo setForca(String forca) {
        this.forca = forca;
        return this;
    }

    public Arma getArma() {
        return arma;
    }

    public Inimigo setArma(Arma arma) {
        this.arma = arma;
        return this;
    }

    @Override
    public Inimigo clone() throws CloneNotSupportedException {
        Inimigo inimigoClone = (Inimigo) super.clone();
        inimigoClone.arma = (Arma) inimigoClone.arma.clone();
        return inimigoClone;
    }

    @Override
    public String toString() {
        return "Inimigo{" +
                "nome='" + nome + '\'' +
                ", forca=" + forca +
                ", arma=" + arma +
                '}';
    }
}

