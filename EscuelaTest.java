import java.util.ArrayList;

public class EscuelaTest {

    @Test 
    public void testPromedioEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getPromedioAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getPromedioAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2); 
        assertEquals(6.6, escuela.getPromedioEscuela());
    }

    @Test 
    public void testPromedioInvalidoEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getPromedioAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getPromedioAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2); 
        assertNotEquals(1.0, escuela.getPromedioEscuela());
    }

    @Test 
    public void testGetMejorNotaEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getMejorNotaAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getMejorNotaAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2); 
        assertEquals(9.0, escuela.getMejorNotaEscuela());
    }

    @Test 
    public void testGetMejorNotaInvalidaEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getMejorNotaAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getMejorNotaAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2); 
        assertNotEquals(6.0, escuela.getMejorNotaEscuela());
    }

    @Test 
    public void testGetPeorNotaEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getPeorNotaAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getPeorNotaAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        assertEquals(4.0, escuela.getPeorNotaEscuela());
    }

    @Test 
    public void testGetPeorNotaInvalidaEscuela() {
        Alumno alumno = new Alumno("Luis Esquivel", "3334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(8.0);
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(4.0);
        alumno.getPeorNotaAlumno();
        Alumno alumno2 = new Alumno("Victoria Baral", "3333");
        alumno2.guardarNotas(9.0);
        alumno2.guardarNotas(6.0);
        alumno2.guardarNotas(6.0);
        alumno2.getPeorNotaAlumno();
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        assertNotEquals(7.0, escuela.getPeorNotaEscuela());
    }
    
}
