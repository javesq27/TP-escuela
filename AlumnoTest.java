import java.util.ArrayList;


public class AlumnoTest {

    @Test
    public void testNombreEstudianteValido() {
        Alumno alumno = new Alumno("Luis Esquivel", "3447");
        assertEquals("Luis Esquivel", alumno.getNombre());
    }

    @Test
    public void testEstudianteConNombreNull() {
        Alumno alumno = new Alumno(null, "3447");
        assertEquals("Anonimo", alumno.getNombre());

    }

    @Test 
    public void testEstudianteConNombreStringVacio() {
        Alumno alumno = new Alumno("", "3447");
        assertEquals("Anonimo", alumno.getNombre());
    }

    @Test 
    public void testEstudianteConNombreMuyLargo() {
        Alumno alumno = new Alumno("pepeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" , "3447");
        assertEquals("Anonimo", alumno.getNombre());

    }

    @Test 
    public void testMatriculaEstudianteValida() {
        Alumno alumno = new Alumno("Victoria Baral", "88668");
        assertEquals("88668", alumno.getMatricula());
    }

    @Test 
    public void testEstudianteConMatriculaNull() {
        Alumno alumno = new Alumno("Victoria Baral", null);
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test 
    public void testEstudianteConMatriculaStringVacio() {
        Alumno alumno = new Alumno("Luis Esquivel", "");
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test
    public void testEstudianteConMatriculaMuylarga() {
        Alumno alumno = new Alumno("Luis Esquivel", "9999999999");
        assertEquals("Sin_matricula", alumno.getMatricula());
    }

    @Test 
    public void testAgregarNotasValidasEstudiante() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(7.0);
        assertEquals(1, notas.size());
        alumno.guardarNotas(5.0);
        assertEquals(2, notas.size());

    }

    @Test 
    public void testAgregarNotaInvalidaMayorADiez() {
        Alumno alumno = new Alumno("Luis Esquivel", "44445");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(30.0);
        assertEquals(0, notas.size());
    }

    @Test 
    public void testAgregarNotaInvalidaMenorAUno() {
        Alumno alumno = new Alumno("Luis Esquivel", "44445");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(-60.5);
        assertEquals(0, notas.size());
    }

    @Test 
    public void testNotaPromedioAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(8.5);
        alumno.guardarNotas(6.5);
        alumno.guardarNotas(4.0); 
        assertEquals(6.5, alumno.getPromedioAlumno());

    }

    @Test 
    public void testNotaPromedioAlumnoNoValida() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(8.5);
        alumno.guardarNotas(6.5);
        alumno.guardarNotas(4.0); 
        assertNotEquals(2.0, alumno.getPromedioAlumno());

    }

    @Test 
    public void testNotasInvalidasMayoresADiezPromedioAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        ArrayList<Double>notas = new ArrayList<Double>();
        alumno.guardarNotas(15.0);
        alumno.guardarNotas(40.6);
        alumno.guardarNotas(100.5);
        alumno.guardarNotas(300.0);
        assertEquals(0.0, alumno.getPromedioAlumno());
    }

    @Test 
    public void testMejorNotaAlumno() {
        Alumno alumno = new Alumno("Luis Esquivel", "33434");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(4.5);
        alumno.guardarNotas(9.0);
        alumno.guardarNotas(7.0);    
        assertEquals(9.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testMejorNotaAlumnoNoValida() {
        Alumno alumno = new Alumno("Luis Esquivel", "33434");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(4.5);
        alumno.guardarNotas(9.0);
        alumno.guardarNotas(7.0);    
        assertNotEquals(6.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testNotasInvalidasMenorAUnoMejorNotaAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(-89.5);
        alumno.guardarNotas(-40.9);
        alumno.guardarNotas(-130.7);
        alumno.guardarNotas(-300.0);
        assertEquals(0.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testPeorNotaAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(9.5);
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(3.0);
        alumno.guardarNotas(7.0);
        assertEquals(3.0, alumno.getPeorNotaAlumno());
        
    }

    @Test 
    public void testPeorNotaAlumnoNoValida() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(9.5);
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(3.0);
        alumno.guardarNotas(7.0);
        assertNotEquals(7.0, alumno.getPeorNotaAlumno());
        
    }

    @Test 
    public void testNotasInvalidasMayoresADiezPeorNotaAlumno() {
        Alumno alumno = new Alumno("Luis Esquivel", "33334");
        ArrayList<Double> notas = new ArrayList<Double>();
        alumno.guardarNotas(89.5);
        alumno.guardarNotas(40.9);
        alumno.guardarNotas(130.7);
        alumno.guardarNotas(300.0);  
        assertEquals(0.0, alumno.getPeorNotaAlumno());
    }




    
}
