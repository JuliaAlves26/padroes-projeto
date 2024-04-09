package padroescriacao.prototype.CartaoVisita;

public class CartaodeVisita implements Cloneable {

    private String nome;
    private String cargo;
    private Modelo modelo;

    public CartaodeVisita(String nome, String cargo, Modelo modelo) {
        this.nome = nome;
        this.cargo = cargo;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public CartaodeVisita setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public CartaodeVisita setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public CartaodeVisita setModelo(Modelo modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public CartaodeVisita clone() throws CloneNotSupportedException {
        CartaodeVisita cartaodeVisitaClone = (CartaodeVisita) super.clone();
        cartaodeVisitaClone.modelo = (Modelo) modelo.clone();
        return cartaodeVisitaClone;
    }

    @Override
    public String toString() {
        return "CartaodeVisita{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", modelo=" + modelo +
                '}';
    }
}
