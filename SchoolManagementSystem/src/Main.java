import Exceptions.CursoYaExistente;
import Exceptions.EstudianteNoInscritoEnCursoException;
import Exceptions.EstudianteYaInscritoException;

public class Main {
    public static void main(String[] args) throws CursoYaExistente, EstudianteYaInscritoException {
        //Crear estudiantes
        Estudiante estudiante1 = new Estudiante(1, "Jenny", "Pirir", "2006-07-18", "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Angel", "Navas", "2005-12-20", "matriculado");
        Estudiante estudiante3 = new Estudiante(3, "Allison", "Juarez", "2005-12-13", "matriculado");
        Estudiante estudiante4 = new Estudiante(4, "Iván", "Santizo", "2006-07-22", "matriculado");

        //Crear cursos
        Curso curso1 = new Curso(1, "Programación Estructurada", "Programación en diversos lenguajes", 5, "1.0");
        Curso curso2 = new Curso(2, "Estructura de Datos", "Aprendizaje de bases de datos", 4, "2.0");
        Curso curso3 = new Curso(3, "Redes de la Información", "Conexión de redes físicas", 3, "3.0");

        //Instancias la clase GestorAcadémico
        GestorAcademico gestor = new GestorAcademico();

        //Matricular a los estudiantes creados anteriormente
        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);
        gestor.matricularEstudiante(estudiante3);
        //gestor.matricularEstudiante(estudiante4);

        //Agregar los cursos creados anteriormente
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);
        gestor.agregarCurso(curso3);

        //Inscribir estudiantes matriculados a los cursos deseados
        gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
        gestor.inscribirEstudianteCurso(estudiante2, curso1.getId());
        gestor.inscribirEstudianteCurso(estudiante3, curso2.getId());
        gestor.inscribirEstudianteCurso(estudiante4, curso2.getId());


        //Metodo Desinscribir Estudiante Curso
        try {
            //Desinscribir al estudiante1 del curso1
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }

        //Saltos de línea
        System.out.println();
        System.out.println();

        //Mostrar el listado de estudiantes matriculados
        gestor.mostrarListaEstudiantes();
        //Mostrar el listado de cursos disponibles
        gestor.mostrarListaCursos();
        //Mostrar los listados de los estudiantes que hay por cada curso
        gestor.mostrarListaEstudiantesInscritos();
    }
}