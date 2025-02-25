public class GestionEscuela {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("María", 40, "Matemáticas");
        Estudiante est1 = new Estudiante("Carlos", 16, 101);
        Estudiante est2 = new Estudiante("Ana", 17, 102);

        Curso cursoMat = new Curso("Matemáticas", prof1);
        cursoMat.agregarEstudiante(est1);
        cursoMat.agregarEstudiante(est2);

        Escuela escuela = new Escuela("Colegio Nacional");
        escuela.agregarCurso(cursoMat);

        // 🔹 Imprimir resultados en la consola
        System.out.println("Escuela: " + escuela.getNombre());
        for (Curso curso : escuela.getCursos()) {
            System.out.println("Curso: " + curso.getNombre());
            System.out.println("Profesor: " + curso.getProfesor().getNombre());
            System.out.println("Estudiantes:");
            for (Estudiante est : curso.getEstudiantes()) {
                System.out.println(" - " + est.getNombre() + " (ID: " + est.getIdEstudiante() + ")");
            }
        }
    }
}
