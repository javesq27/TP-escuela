
public class OptionAddStudent implements Option
{
    private Printer printer;
    private Reader reader;

    public OptionAddStudent(Printer printer, Reader reader)
    {
        this.printer = printer;
        this.reader = reader;
    }

    @Override
    public String name()
    {
        return "Agregar Alumno";
    }

    @Override
    public void action(Escuela escuela)
    {
        printer.print("Ingrese Nombre");
        String nombreAlumno = reader.readOption();
        printer.print("Ingrese Matricula");
        String matriculaAlumno = reader.readOption();
        escuela.guardarAlumnos(new Alumno(nombreAlumno, matriculaAlumno));
    }

}
