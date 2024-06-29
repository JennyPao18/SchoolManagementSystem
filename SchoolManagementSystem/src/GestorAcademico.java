import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    //Declaración de ArrayList's y Hashmap
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;
    private HashMap<Integer, ArrayList<Integer>> estudiantesPorCurso;

    //Constructor con parámetros
    public GestorAcademico(ArrayList<Estudiante> listaEstudiantes, ArrayList<Curso> listaCursos, HashMap<Integer, ArrayList<Integer>> estudiantesPorCurso) {
        this.listaEstudiantes = listaEstudiantes;
        this.listaCursos = listaCursos;
        this.estudiantesPorCurso = estudiantesPorCurso;
    }
}
