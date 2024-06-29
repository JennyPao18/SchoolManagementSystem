public class Curso {
    //Variables de la clase
    int id;
    String nombre;
    String descripcion;
    int noCreditos;
    String version;

    //Constructor con parámetros
    public Curso(int id, String nombre, String descripcion, int noCreditos, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.noCreditos = noCreditos;
        this.version = version;
    }

    //Getter's y Setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNoCreditos() {
        return noCreditos;
    }

    public void setNoCreditos(int noCreditos) {
        this.noCreditos = noCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
