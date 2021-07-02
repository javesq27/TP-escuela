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
        alumno.guardarNotas(7.0);
        assertEquals(7.0, alumno.getNotas().get(0));
        alumno.guardarNotas(6.0);
        assertEquals(6.0, alumno.getNotas().get(1));

    }

    @Test 
    public void testAgregarNotaInvalidaMayorADiez() {
        Alumno alumno = new Alumno("Luis Esquivel", "44445");
        alumno.guardarNotas(30.0);
        assertEquals(0, alumno.getNotas().size());
    }

    @Test 
    public void testAgregarNotaInvalidaMenorAUno() {
        Alumno alumno = new Alumno("Luis Esquivel", "44445");
        alumno.guardarNotas(-60.5);
        assertEquals(0, alumno.getNotas().size());
    }

    @Test 
    public void testNotaPromedioAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        alumno.guardarNotas(7.0);
        alumno.guardarNotas(8.5);
        alumno.guardarNotas(6.5);
        alumno.guardarNotas(4.0); 
        assertEquals(6.5, alumno.getPromedioAlumno());

    }

    @Test 
    public void testNotasInvalidasPromedioAlumnoMenoresAUno() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        alumno.guardarNotas(-7.0);
        alumno.guardarNotas(-8.5);
        alumno.guardarNotas(-6.5);
        alumno.guardarNotas(-4.0); 
        assertEquals(0.0, alumno.getPromedioAlumno());

    }

    @Test 
    public void testNotasInvalidasMayoresADiezPromedioAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "44444");
        alumno.guardarNotas(15.0);
        alumno.guardarNotas(40.6);
        alumno.guardarNotas(100.5);
        alumno.guardarNotas(300.0);
        assertEquals(0.0, alumno.getPromedioAlumno());
    }

    @Test 
    public void testMejorNotaAlumno() {
        Alumno alumno = new Alumno("Luis Esquivel", "33434");
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(4.5);
        alumno.guardarNotas(9.0);
        alumno.guardarNotas(7.0);    
        assertEquals(9.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testNotasInvalidasMayorADiezMejorNotaAlumno() {
        Alumno alumno = new Alumno("Luis Esquivel", "33434");
        alumno.guardarNotas(36.0);
        alumno.guardarNotas(54.5);
        alumno.guardarNotas(889.0);
        alumno.guardarNotas(67.0);    
        assertEquals(0.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testNotasInvalidasMenorAUnoMejorNotaAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        alumno.guardarNotas(-89.5);
        alumno.guardarNotas(-40.9);
        alumno.guardarNotas(-130.7);
        alumno.guardarNotas(-300.0);
        assertEquals(0.0, alumno.getMejorNotaAlumno());
    }

    @Test 
    public void testPeorNotaAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        alumno.guardarNotas(9.5);
        alumno.guardarNotas(6.0);
        alumno.guardarNotas(3.0);
        alumno.guardarNotas(7.0);
        assertEquals(3.0, alumno.getPeorNotaAlumno());
        
    }

    @Test 
    public void testNotasInvalidasMenoresAUnoPeorNotaAlumno() {
        Alumno alumno = new Alumno("Victoria Baral", "33333");
        alumno.guardarNotas(-19.5);
        alumno.guardarNotas(-46.0);
        alumno.guardarNotas(-53.0);
        alumno.guardarNotas(-37.0);
        assertEquals(0.0, alumno.getPeorNotaAlumno());
        
    }

    @Test 
    public void testNotasInvalidasMayoresADiezPeorNotaAlumno() {
        Alumno alumno = new Alumno("Luis Esquivel", "33334");
        alumno.guardarNotas(89.5);
        alumno.guardarNotas(40.9);
        alumno.guardarNotas(130.7);
        alumno.guardarNotas(300.0);  
        assertEquals(0.0, alumno.getPeorNotaAlumno());
    }




    
}
