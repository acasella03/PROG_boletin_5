package boletin.pkg5;

public class Boletin5 {

    public static void main(String[] args) {
        Consumo obj1 = new Consumo();
        obj1.setLitros(50f);
        obj1.setPgas(1.57f);
        
        Consumo obj2 = new Consumo(100f, 5.5f, 90f, 1.57f);
        System.out.println("El consumo medio es: " + obj2.consumoMedio()+" litros");

        obj2.setLitros(10f);

        System.out.println("La velocidad media es: " + obj2.getVmed()+" km");
    }

}
