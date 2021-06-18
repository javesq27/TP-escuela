public class Alumno {
    private String nombre;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    
    public Alumno(String nombre, String matricula, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    } 

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    } 

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    } 

    public double getNota3() {
        return nota3;
    }
    
}
