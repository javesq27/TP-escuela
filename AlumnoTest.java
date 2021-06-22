import java.util.ArrayList;


public class AlumnoTest {

    @Test
    public void testNombreEstudianteValido() {
        Alumno alumno = new Alumno("Luis Esquivel", "3447", new ArrayList<Double>());
        assertEquals("Luis Esquivel", alumno.getNombre());
    }

    @Test
    public void testEstudianteConNombreNull() {
        Alumno alumno = new Alumno(null, "3447", new ArrayList<Double>());
        assertEquals("Anonimo", alumno.getNombre());

    }

    @Test 
    public void testEstudianteConNombreStringVacio() {
        Alumno alumno = new Alumno("", "3447", new ArrayList<Double>());
        assertEquals("Anonimo", alumno.getNombre());
    }

    @Test 
    public void testEstudianteConNombreMuyLargo() {
        Alumno alumno = new Alumno("pepeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" , "3447", new ArrayList<Double>());
        assertEquals("Anonimo", alumno.getNombre());

    }

    @Test 
    public void testMatriculaEstudianteValida() {
        Alumno alumno = new Alumno("Victoria Baral", "88668", new ArrayList<Double>());
        assertEquals("88668", alumno.getMatricula());
    }

    @Test 
    public void testEstudianteConMatriculaNull() {
        Alumno alumno = new Alumno("Victoria Baral", null, new ArrayList<Double>());
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test 
    public void testEstudianteConMatriculaStringVacio() {
        Alumno alumno = new Alumno("Luis Esquivel", "", new ArrayList<Double>());
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test
    public void testEstudianteConMatriculaMuylarga() {
        Alumno alumno = new Alumno("Luis Esquivel", "9999999999", new ArrayList<Double>());
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test 
    public void testNotaPromedioAlumno() {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(6.5);
        notas.add(4.0);
        Alumno alumno = new Alumno("Victoria Baral", "44444", notas);
        assertEquals(6.5, alumno.getPromedioAlumno());

    }

    @Test 
    public void testNotasInvalidasPromedioAlumno() {
        ArrayList<Double>notas = new ArrayList<Double>();
        notas.add(15.0);
        notas.add(0.6);
        notas.add(-60.0);
        notas.add(300.0);
        Alumno alumno = new Alumno("Victoria Baral", "44444", notas);
        assertEquals(0.0, alumno.getPromedioAlumno());
    }

    @Test 
    public void testMejorNotaAlumno() {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(6.0);
        notas.add(4.5);
        notas.add(9.0);
        notas.add(7.0);
        Alumno alumno = new Alumno("Luis Esquivel", "33434", notas);
        assertEquals(9.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testNotasInvalidasMejorNotaAlumno() {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(89.5);
        notas.add(-40.9);
        notas.add(-130.7);
        notas.add(300.0);
        Alumno alumno = new Alumno("Victoria Baral", "33333", notas);
        assertEquals(0.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testPeorNotaAlumno() {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(9.5);
        notas.add(6.0);
        notas.add(3.0);
        notas.add(7.0);
        Alumno alumno = new Alumno("Victoria Baral", "33333", notas);
        assertEquals(3.0, alumno.getPeorNotaAlumno());
        
    }

    @Test 
    public void testNotasInvalidasPeorNotaAlumno() {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(89.5);
        notas.add(-40.9);
        notas.add(-130.7);
        notas.add(300.0);
        Alumno alumno = new Alumno("Luis Esquivel", "33334", notas);
        assertEquals(0.0, alumno.getPeorNotaAlumno());
    }




    
}
