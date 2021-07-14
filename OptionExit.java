public class OptionExit implements Option{
    
    @Override
    String name() 
    {
        return "Salir";
    }

    @Override
    void action(School school)
    {
        System.exit(0);
    }

    }

