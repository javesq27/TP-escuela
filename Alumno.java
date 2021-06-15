public class Alumno {
    private String nombre;
    private String matricula;
    private double notas;

    
    public Alumno(String nombre, String matricula, double notas) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.notas = notas;
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

    public void setNotas(double notas) {
        this.notas = notas;
    } 

    public double getNotas() {
        return notas;
    }
    
}
