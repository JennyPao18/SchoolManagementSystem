public class Curso {
    //Variables de la clase
    public int id;
    public String nombre;
    public String descripcion;
    public int noCreditos;
    public String version;

    //Constructor con parámetros
    public Curso(int id, String nombre, String descripcion, int noCreditos, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.noCreditos = noCreditos;
        this.version = version;
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

    //Getter's y Setter's de Descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Getter's y Setter's de Créditos
    public int getNoCreditos() {
        return noCreditos;
    }

    public void setNoCreditos(int noCreditos) {
        this.noCreditos = noCreditos;
    }

    //Getter's y Setter's de Versión
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
