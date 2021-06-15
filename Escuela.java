import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Calificaciones> calificaciones;

    public Escuela() {
        this.calificaciones = new ArrayList<Calificaciones>();
    }

    public double getPromedioEscuela() {
        double prom = 0.0;
        for (int i = 0; i<calificaciones.size(); i++) {
            prom = prom + calificaciones.get(i).getPromedio();
        }
        return prom / calificaciones.size(); 

    }

    public double getMejorNotaEscuela() {
        double mejor = 0.0;
        for(int i = 0; i<calificaciones.size(); i ++) {
            if(calificaciones.get(i).getMejorNota() > mejor) {
                mejor = calificaciones.get(i).getMejorNota();
            }
        }
        return mejor;
    }

    public double getPeorNotaEscuela() {
        double peor = 0.0;
        for(int i = 0; i<calificaciones.size(); i++) {
            if(calificaciones.get(i).getPeorNota() < peor) {
                peor = calificaciones.get(i).getPeorNota();
            }
        }
        return peor;
    }
    
}
