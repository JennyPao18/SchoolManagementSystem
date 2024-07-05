import Exceptions.CursoYaExistente;
import Exceptions.EstudianteNoInscritoEnCursoException;
import Exceptions.EstudianteYaInscritoException;

public interface ServiciosAcademicosI {
    //Declaración de métodos del sistema
    void matricularEstudiante(Estudiante estudiante) throws EstudianteYaInscritoException;
    void agregarCurso(Curso curso) throws CursoYaExistente;
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;
}
