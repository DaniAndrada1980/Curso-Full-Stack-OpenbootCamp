public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Daniel");
        System.out.println("Hola mi nombre es " + persona.getNombre());
        persona.setEdad(41);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(35718748);
        System.out.println("Mi telefono es " + persona.getTelefono());
        persona.setNacionalidad("Argentina");
        System.out.println("Y soy de " + persona.getNacionalidad());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    private String nacionalidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
