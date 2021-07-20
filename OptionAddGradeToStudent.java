
public class OptionAddGradeToStudent implements Option
{
    private Printer printer;
    private Reader reader;

    public OptionAddGradeToStudent(Printer printer, Reader reader)
    {
        this.printer = printer;
        this.reader = reader;
    }

    @Override
    public String name()
    {
        return "Agregar nota a Alumno";
    }

    @Override
    public void action(Escuela escuela)
    {
        printer.print("Ingrese matricula del alumno");
        String matricula = reader.readOption();
        Alumno alumno = escuela.getAlumnoPorMatricula(matricula);
        printer.print("Ingrese la nota");
        Double nota = Double.parseDouble(reader.readOption());
        alumno.guardarNotas(nota);
    }
}
