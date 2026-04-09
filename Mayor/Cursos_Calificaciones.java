package Mayor;

public class Cursos_Calificaciones {

    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Cursos_Calificaciones(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;

        if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
        }

        if (nota2 >= 0 && nota2 <= 100) {
            this.nota2 = nota2;
        }

        if (nota3 >= 0 && nota3 <= 100) {
            this.nota3 = nota3;
        }
    }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
