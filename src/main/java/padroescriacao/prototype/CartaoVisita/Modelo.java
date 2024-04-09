package padroescriacao.prototype.CartaoVisita;

public class Modelo implements Cloneable {

    private String nomeModelo;
    private String CartaoPadrao;
    private String CartaoExecutivo;

    public Modelo(String CartaoPadrao, String CartaoExecutivo) {
        this.CartaoPadrao = CartaoPadrao;
        this.CartaoExecutivo = CartaoExecutivo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public Modelo setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
        return this;
    }

    public String getCartaoPadrao() {
        return CartaoPadrao;
    }

    public Modelo setCartaoPadrao(String cartaoPadrao) {
        CartaoPadrao = cartaoPadrao;
        return this;
    }

    public String getCartaoExecutivo() {
        return CartaoExecutivo;
    }

    public Modelo setCartaoExecutivo(String cartaoExecutivo) {
        CartaoExecutivo = cartaoExecutivo;
        return this;
    }

    @Override
    public Modelo clone() throws CloneNotSupportedException {
        return (Modelo) super.clone();
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "CartaoPadrao='" + CartaoPadrao + '\'' +
                ", CartaoExecutivo='" + CartaoExecutivo + '\'' +
                '}';
    }
}

