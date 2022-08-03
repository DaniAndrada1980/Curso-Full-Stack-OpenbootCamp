public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Daniel";
        cliente.edad = 41;
        cliente.telefono = 35718748;
        cliente.credito = 5000.250F;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi telefono es " + cliente.telefono
                + " y mi credito disponible es $" + cliente.credito + " (Monto expresado en Pesos Argentinos).");

        trabajador.nombre = "Lio Messi";
        trabajador.edad = 35;
        trabajador.telefono = 25457896;
        trabajador.salario = 2000000.320;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi telefono es " + trabajador.telefono
                + " y mi salario es de €" + trabajador.salario + " (Monto expresado en Euros).");

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    float credito;
}

class Trabajador extends Persona {
    double salario;
}
