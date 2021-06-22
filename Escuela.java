import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Alumno> alumno;

    public Escuela() {
        this.alumno = new ArrayList<Alumno>();
    }

    public double getPromedioEscuela() {
        double prom = 0.0;
        
        for (int i = 0; i<alumno.size(); i++) {
            
            prom = prom + alumno.get(i).getPromedioAlumno();    
                
        }
        
        return prom / alumno.size(); 
    }

    public double getMejorNotaEscuela() {
        double mejor = 0.0;
        
        for(int i = 0; i<alumno.size(); i ++) {
            
            if(alumno.get(i).getMejorNotaAlumno() > mejor) {
                
                mejor = alumno.get(i).getMejorNotaAlumno();
                }    
                
        }
        
        return mejor;
    }

    
    public double getPeorNotaEscuela() {
        double peor = 10.0;
        
        for(int i = 0; i<alumno.size(); i++) {
            
            if(alumno.get(i).getPeorNotaAlumno() < peor) {
                
                peor = alumno.get(i).getPeorNotaAlumno();
            }     
                
        }
        
        return peor;
    }
    
}
