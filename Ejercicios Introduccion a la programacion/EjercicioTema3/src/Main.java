public class Main {

        public static void main(String[] args) {
            suma(10, 30, 50);

            Coche miCoche = new Coche();

            miCoche.agregarPuerta();
            System.out.println("El coche tiene un total de: " + miCoche.cantidadDePuertas + " puertas");
        }
        public static void suma(int a, int b, int c){
            int resultado;
            resultado = a + b + c;
            System.out.println(resultado);
        }
    }
    class Coche {
        public int cantidadDePuertas = 4;
        public void agregarPuerta(){

            this.cantidadDePuertas++;
        }
    }


