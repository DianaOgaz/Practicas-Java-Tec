
public class Dato {

    private String Nombre;
    private String Apellido;
    private int edad;

//constructor
    public Dato() {

    }

    public Dato(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
