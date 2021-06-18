import java.util.ArrayList;
import java.util.List;

public class Calificaciones {

    private List<Alumno> alumno; 

    public Calificaciones() {
        this.alumno= new ArrayList<Alumno>();
    }

    public double getPromedioAlumno() {
        double pro = 0.0;

        if(!alumno.isEmpty()) {
            for(int i = 0; i<alumno.size(); i++) {
                pro = alumno.get(i).getNota1() + alumno.get(i).getNota2() + alumno.get(i).getNota3();
            }
        }
       
        return pro / 3;
    }

    public double getMejorNotaAlumno() {
        double mejor = 0.0;

        if(!alumno.isEmpty()) {
            for (int i = 0; i<alumno.size(); i++) {
                mejor = Math.max(Math.max(alumno.get(i).getNota1(), alumno.get(i).getNota2()), alumno.get(i).getNota3());
                }
            }
        return mejor;
        }  
    

    public double getPeorNotaAlumno() {
        double peor = 11.0;

        if(!alumno.isEmpty()) {
            for (int i = 0; i<alumno.size(); i ++) {
                peor = Math.min(Math.min(alumno.get(i).getNota1(), alumno.get(i).getNota2()), alumno.get(i).getNota3());
            }
        }
        return peor;

    }
    
}
