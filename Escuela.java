import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Calificaciones> calificaciones;

    public Escuela() {
        this.calificaciones = new ArrayList<Calificaciones>();
    }

    public double getPromedioEscuela() {
        double prom = 0.0;

        if(!calificaciones.isEmpty()) {
            for (int i = 0; i<calificaciones.size(); i++) {
                prom = prom + calificaciones.get(i).getPromedioAlumno();
            }
        } 
        return prom / calificaciones.size(); 
    }

    public double getMejorNotaEscuela() {
        double mejor = 0.0;

        if(!calificaciones.isEmpty()) {
            for(int i = 0; i<calificaciones.size(); i ++) {
                if(calificaciones.get(i).getMejorNotaAlumno() > mejor) {
                    mejor = calificaciones.get(i).getMejorNotaAlumno();
                }
            }
        }
        
        return mejor;
    }

    public double getPeorNotaEscuela() {
        double peor = 11.0;

        if(!calificaciones.isEmpty()) {
            for(int i = 0; i<calificaciones.size(); i++) {
                if(calificaciones.get(i).getPeorNotaAlumno() < peor) {
                    peor = calificaciones.get(i).getPeorNotaAlumno();
                }
            }
        }
       
        return peor;
    }
    
}
