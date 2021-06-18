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

        if(nombre != null && nombre != "") {
            this.nombre = nombre;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {

        if(matricula != null && matricula != "") {
            this.matricula = matricula;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota1(double nota1) {
        if (nota1 > 0) {
            this.nota1 = nota1;
        }    
    } 

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        if(nota2 > 0) {
            this.nota2 = nota2;
        }
        
    } 

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota3) {
        if(nota3 > 0) {
            this.nota3 = nota3;
        }
        
    } 

    public double getNota3() {
        return nota3;
    }

    public double getPromedioAlumno() {

        return getNota1() + getNota2() + getNota3() / 3;
    }

    public double getMejorNotaAlumno() {

        return Math.max(Math.max(getNota1(), getNota2()), getNota3());
    }

    public double getPeorNotaAlumno() {
        
        return Math.min(Math.min(getNota1(), getNota2()), getNota3());
    }
    
}
