public class Estudiante extends Persona{
    //Variables de la clase
    public int id;
    public String estado;

    //Constructor con parámetros
    public Estudiante(int id, String nombre, String apellido, String fechaNacimiento, String estado) {
        super(nombre, apellido, fechaNacimiento);
        this.id = id;
        this.estado = estado;
    }

    //Getter's y Setter's de Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter's y Setter's de Estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
