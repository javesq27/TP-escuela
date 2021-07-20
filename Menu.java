import java.util.ArrayList;


public class Menu {

    public Menu(Printer printer, Reader reader) 
    {
        this.printer = printer;
        this.reader = reader;
        this.options.add(new OptionShowStudents(printer));
        this.options.add(new OptionExit());

    }
    
    public void show(){
        for (int i = 0; i < options.size(); i++) {
            Option o = options.get(i);
            printer.print(i + ". " + o.name());
        }
    }

    public String readOption()
    {
        return reader.readOption();
    }

    public void run(Escuela school)
    {
        while(true)
        {
            show();
            String userOption = readOption();
            int optionNumber = Integer.parseInt(userOption);
            options.get(optionNumber).action(school);
        }
    }

    private Reader reader;
    private Printer printer;
    private ArrayList<Option> options = new ArrayList<>();
}