import java.util.ArrayList;
import java.util.List;

public class Calificaciones {

    private List<Alumno> alumno; 

    public Calificaciones() {
        this.alumno= new ArrayList<Alumno>();
    }

    public double getPromedio() {
        double pro = 0.0;

        for(int i = 0; i<alumno.size(); i++) {
            pro = pro + alumno.get(i).getNotas();
        }
        return pro / alumno.size();
    }

    public double getMejorNota() {
        double mejor = 0.0;

        for (int i = 0; i<alumno.size(); i++) {
            if(alumno.get(i).getNotas() > mejor) {
                mejor = alumno.get(i).getNotas();
            }
        }
        return mejor;
    }

    public double getPeorNota() {
        double peor = 0.0;

        for (int i = 0; i<alumno.size(); i ++) {
            if(alumno.get(i).getNotas() < peor) {
                peor = alumno.get(i).getNotas();
            }
        }
        return peor;

    }
    
}
