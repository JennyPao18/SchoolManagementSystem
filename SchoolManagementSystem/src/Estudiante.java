public class Estudiante{
    //Variables de la clase
    public int id;
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    public String estado;

    //Constructor con parámetros
    public Estudiante(int id, String nombre, String apellido, String fechaNacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    //Getter's y Setter's de Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter's y Setter's de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter's y Setter's de Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Getter's y Setter's de Fecha de Nacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    //Getter's y Setter's de Estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
