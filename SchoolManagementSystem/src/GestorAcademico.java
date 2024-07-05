import Exceptions.CursoYaExistente;
import Exceptions.EstudianteNoInscritoEnCursoException;
import Exceptions.EstudianteYaInscritoException;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI {
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

    //Constructor vacío
    public GestorAcademico() {
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.estudiantesPorCurso = new HashMap<>();
    }

    //Método MatricularEstudiante
    @Override
    public void matricularEstudiante(Estudiante estudiante) throws EstudianteYaInscritoException {
        //Si el estudiante aún no esta matriculado...
        if(!listaEstudiantes.contains(estudiante)) {
            listaEstudiantes.add(estudiante);
            System.out.println("El estudiante fue matriculado exitosamente");

            //Si el estudiante ya esta matriculado...
        } else {
            throw new EstudianteYaInscritoException("El estudiante ya está matriculado");
        }
    }

    @Override
    public void agregarCurso(Curso curso) throws CursoYaExistente{
        //Si el curso aún no existe...
        if(!listaCursos.contains(curso)) {
            listaCursos.add(curso);
            System.out.println("El curso fue agregado exitosamente");

            //Si el curso ya existe...
        } else {
            throw new CursoYaExistente("El curso ya existe");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException{
        //Verificar si ya existe una lista para el curso deseado
        if (estudiantesPorCurso.containsKey(idCurso)){
            //Utilizar la lista ya existente
            ArrayList<Integer> estudiantesYaInscritos = estudiantesPorCurso.get(idCurso);
            //Verificar si el estudiante ya esta asignado al curso
            if (estudiantesYaInscritos.contains(estudiante.getId())){
                throw new EstudianteYaInscritoException("El estudiante ya está inscrito en este curso");
            }
        } else {
            //Crear una nueva lista
            estudiantesPorCurso.put(idCurso, new ArrayList<>());
        }
        //Inscribir al estudiante al curso deseado
        estudiantesPorCurso.get(idCurso).add(estudiante.getId());

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        //Si no se especifico el id del curso...
        if (!estudiantesPorCurso.containsKey(idCurso)){
            throw new EstudianteNoInscritoEnCursoException("El curso especificado no existe");

            //Si se especifico el id del curso...
        } else {
            //Crear un ArrayList que contenga a los estudiantes ya inscritos
            ArrayList<Integer> estudiantesYaInscritos = estudiantesPorCurso.get(idCurso);
            //Verificar si el estudiante ya esta asignado al curso
            if (!estudiantesYaInscritos.contains(idEstudiante)) {
                throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en el curso especificado");
            }

            //Desinscribir al estudiante del curso
            estudiantesYaInscritos.remove(Integer.valueOf(idEstudiante));

            //Si no hay estudiantes se eliminará el ArrayList del curso
            if (estudiantesYaInscritos.isEmpty()){
                estudiantesPorCurso.remove(idCurso);
            }
        }
    }

    public void mostrarListaEstudiantes(){
        //Mostrar título
        System.out.println("--- Lista de Estudiantes ---");
        for(Estudiante estudiante : listaEstudiantes){
            //Mostrar los estudiantes ya matriculados
            System.out.println("* " + estudiante.getNombre());
        }
        System.out.println();
    }

    public void mostrarListaCursos(){
        //Mostrar título
        System.out.println("--- Lista de Cursos ---");
        for(Curso curso : listaCursos){
            //Mostrar el nombre de los cursos disponibles
            System.out.println("* " + curso.getNombre());
        }
        System.out.println();
    }

    public void mostrarListaEstudiantesInscritos(){
        //Mostrar título
        System.out.println("--- Lista de Estudiantes Inscritos ---");
        for (Curso curso : listaCursos){
            //Mostrar nombre del curso
            System.out.println("< " + curso.getNombre() + " >");
            //Crear un ArrayList que contenga el id de los estudiantes
            ArrayList<Integer> idEstudiantes = estudiantesPorCurso.get(curso.getId());
            if(idEstudiantes != null){
                for (Integer idEstudiante : idEstudiantes){
                    for (Estudiante estudiante : listaEstudiantes){
                        if(estudiante.id == idEstudiante){
                            //Mostrar a todos los estudiantes inscritos en el curso correspondiente
                            System.out.println("* " + estudiante.getNombre());
                        }
                    }
                }
            }
            //Salto de línea
            System.out.println();
        }
    }
}
