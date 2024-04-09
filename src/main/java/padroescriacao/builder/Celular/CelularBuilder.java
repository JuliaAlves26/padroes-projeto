package padroescriacao.builder.Celular;

public class CelularBuilder {

    private Celular celular;

    public CelularBuilder() {
        celular = new Celular();
    }

    public Celular build() {
        if (celular.getId() == 0) {
            throw new IllegalArgumentException("Id inválido");
        }
        if (celular.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return celular;
    }

    public CelularBuilder setId(int id) {
        celular.setId(id);
        return this;
    }

    public CelularBuilder setModelo(String modelo) {
        celular.setModelo(modelo);
        return this;
    }

    public CelularBuilder setMarca(String marca) {
        celular.setMarca(marca);
        return this;
    }

    public CelularBuilder setCor(String cor) {
        celular.setCor(cor);
        return this;
    }

    public CelularBuilder setConectividade(String conectividade) {
        celular.setConectividade(conectividade);
        return this;
    }

    public CelularBuilder setSensores(String sensores) {
        celular.setSensores(sensores);
        return this;
    }

    public CelularBuilder setTecnologiasEspecificas(String tecnologiasEspecificas) {
        celular.setTecnologiasEspecificas(tecnologiasEspecificas);
        return this;
    }

    public CelularBuilder setResolucaoCamera(String resolucaoCamera) {
        celular.setResolucaoCamera(resolucaoCamera);
        return this;
    }

    public CelularBuilder setNumerodeCameras(int numerodeCameras) {
        celular.setNumerodeCameras(numerodeCameras);
        return this;
    }

    public CelularBuilder setCapacidadeBateria(int capacidadeBateria) {
        celular.setCapacidadeBateria(capacidadeBateria);
        return this;
    }

    public CelularBuilder setTamanhoTela(double tamanhoTela) {
        celular.setTamanhoTela(tamanhoTela);
        return this;
    }
}

