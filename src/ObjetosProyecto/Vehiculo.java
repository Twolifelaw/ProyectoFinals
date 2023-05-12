package ObjetosProyecto;

public abstract class Vehiculo {
    public enum TipoCombustible {
        GASOLINA, DISEL, ELECTRICOS, HIBRIDOS
    };

    TipoCombustible tipoCombustible;

    public enum TipoTrasmision {
        AUTOMATICA, MANUAL
    };

    TipoTrasmision tipoTrasmision;

    private int motor;
    private String marca;
    private boolean esNuevo;
    private String modelo;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;

    public Vehiculo(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, int motor, String marca,
            boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje) {
        this.tipoCombustible = tipoCombustible;
        this.tipoTrasmision = tipoTrasmision;
        this.motor = motor;
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoTrasmision getTipoTrasmision() {
        return tipoTrasmision;
    }

    public void setTipoTrasmision(TipoTrasmision tipoTrasmision) {
        this.tipoTrasmision = tipoTrasmision;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}
