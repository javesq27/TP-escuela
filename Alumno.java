import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String matricula;
    private ArrayList<Double> notas;

    
    public Alumno(String nombre, String matricula, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.notas = new ArrayList<Double>();
        
    }

    public void setNombre(String nombre) {

        if(nombre != null && nombre.length() > 0 && nombre.length() < 25 ) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "Anonimo";
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {

        if(matricula != null && matricula.length() > 0 && matricula.length() < 6) {
            this.matricula = matricula;
        }
        else {
            this.nombre = "Sin_matricula";
        }
    }

    public String getMatricula() {
        return matricula;
    }

   

    public double getPromedioAlumno() {
        Double promedio = 0.0;
        
        for(int i = 0; i<notas.size(); i++) {
            if(notas.get(i) > 0.9 && notas.get(i) < 10.1) {
                promedio = promedio + notas.get(i);
            }
           
        }
        return promedio / notas.size();
    }


    public double getMejorNotaAlumno() {
        Double mejor = 0.0;
        
        for(int i = 0; i<notas.size(); i++) {
            if(notas.get(i) > 0.9 && notas.get(i) < 10.1 && notas.get(i) > mejor) {
                mejor = notas.get(i);
            }
        }
        return mejor;
        
    }


    public double getPeorNotaAlumno() {
        Double peor = 10.1;

        for(int i = 0; i<notas.size(); i++) {
            if(notas.get(i) > 0.9 && notas.get(i) < 10.1 && notas.get(i) < peor) {
                peor = notas.get(i);
            }
        }
        return peor;    
        
    }
    
}
