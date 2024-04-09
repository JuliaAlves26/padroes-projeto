package padroescriacao.builder.Celular;

import java.util.Date;

public class Celular {

    private int id;
    private String modelo;
    private String marca;
    private String cor;
    private String conectividade;
    private String sensores;
    private String tecnologiasEspecificas;
    private String resolucaoCamera;
    private int numerodeCameras;
    private int capacidadeBateria;
    private double tamanhoTela;

    public Celular() {
        this.id = 0;
        this.modelo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getConectividade() {
        return conectividade;
    }

    public void setConectividade(String conectividade) {
        this.conectividade = conectividade;
    }

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    public String getTecnologiasEspecificas() {
        return tecnologiasEspecificas;
    }

    public void setTecnologiasEspecificas(String tecnologiasEspecificas) {
        this.tecnologiasEspecificas = tecnologiasEspecificas;
    }

    public String getResolucaoCamera() {
        return resolucaoCamera;
    }

    public void setResolucaoCamera(String resolucaoCamera) {
        this.resolucaoCamera = resolucaoCamera;
    }

    public int getNumerodeCameras() {
        return numerodeCameras;
    }

    public void setNumerodeCameras(int numerodeCameras) {
        this.numerodeCameras = numerodeCameras;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}


