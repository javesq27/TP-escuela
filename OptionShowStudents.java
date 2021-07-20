public class OptionShowStudents  implements Option{

    private Printer printer;

    public OptionShowStudents(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String name() 
    {
        return "Mostrar listado de alumnos";
    }

    @Override
    public void action(Escuela school) {
        for (Alumno alumno: school.getAlumnos()) {
            printer.print(alumno.toString());
        }
   }
}
