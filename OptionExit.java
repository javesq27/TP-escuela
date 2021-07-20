public class OptionExit implements Option{
    
    @Override
    public String name()
    {
        return "Salir";
    }

    @Override
    public void action(Escuela school) 
    {
        System.exit(0);
    }

}

