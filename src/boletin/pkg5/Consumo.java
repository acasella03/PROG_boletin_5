package boletin.pkg5;

public class Consumo {

    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {
    }

    public Consumo(float kilometros, float litros, float mediaVeloc, float precioGas) {
        km = kilometros;
        this.litros = litros;
        vMed = mediaVeloc;
        pGas = precioGas;
    }

    public float calcularTiempo() {
        float tiempo = km / vMed;
        return tiempo;
    }

    public float consumoMedio() {
        float consumoMedio = (litros / km) * 100;
        return consumoMedio;
    }

    public float consumoEuros() {
        float consumoEuros = consumoMedio() * pGas;
        return consumoEuros;
    }

    public void setKms(float kilometros) {
        km = kilometros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getVmed() {
        return vMed;
    }

    public void setVmed(float mediaVelocidad) {
        vMed = mediaVelocidad;
    }

    public void setPgas(float precioGas) {
        pGas = precioGas;
    }
}
