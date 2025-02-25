import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Curso> cursos;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
    public String getNombre() {
    return nombre;
    }
    public List<Curso> getCursos(){
        return cursos;
    }
}