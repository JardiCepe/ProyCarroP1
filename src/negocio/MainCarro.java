package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();

        c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;

        System.out.println("La velocidad del primer carro es " + c1.velocidad);
        System.out.println("La velocidad del segundo carro es " + c2.velocidad);
        System.out.println("La velocidad del tercer carro es " + c3.velocidad);

        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c2.acelerar();
        c2.acelerar();
        c3.frenar();

        System.out.println("La velocidad del primer carro después de acelerar y frenar es " + c1.velocidad);
        System.out.println("La velocidad del segundo carro después de acelerar es " + c2.velocidad);
        System.out.println("La velocidad del tercer carro después de frenar es " + c3.velocidad);
    }
}
