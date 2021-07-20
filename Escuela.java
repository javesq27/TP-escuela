import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private List<Alumno> alumnos;

    public Escuela() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void guardarAlumnos(Alumno a) {
        alumnos.add(a);

    }

    public double getPromedioEscuela() {
        double prom = 0.0;
        
        for (int i = 0; i<alumnos.size(); i++) {
            
            prom = prom + alumnos.get(i).getPromedioAlumno();    
                
        }
        
        return prom / alumnos.size(); 
    }

    public double getMejorNotaEscuela() {
        double mejor = 0.0;
        
        for(int i = 0; i<alumnos.size(); i ++) {
            
            if(alumnos.get(i).getMejorNotaAlumno() > mejor) {
                
                mejor = alumnos.get(i).getMejorNotaAlumno();
                }    
                
        }
        
        return mejor;
    }

    
    public double getPeorNotaEscuela() {
        double peor = 10.0;
        
        for(int i = 0; i<alumnos.size(); i++) {
            
            if(alumnos.get(i).getPeorNotaAlumno() < peor) {
                
                peor = alumnos.get(i).getPeorNotaAlumno();
            }     
                
        }
        
        return peor;
    }

    public Alumno getAlumnoPorMatricula(String matricula) {
        Alumno alumnoEncontrado = null;
        for(Alumno alumno: alumnos) {
            if (matricula.equalsIgnoreCase(alumno.getMatricula())) {
                alumnoEncontrado = alumno;
            }
        }
        return alumnoEncontrado;
    }
    
}
