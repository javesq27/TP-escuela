public class OptionShowStudents  implements Option{
    @Override
    String name() 
    {
        return "Mostrar notas de los alumnos";
    }

    @Override
    void action(School school)
    for (Student s : school.student())
    {
        System.out.println("");
    }
    
}
