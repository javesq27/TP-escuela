public class Menu {

    public Menu(Printer printer) 
    {
        this.printer = printer;
    }
    
    public void show(){
        for(Option o: options)
        {
            System.out.println("" + i " - " + o.name());
            i++;
        }
    }

    public String readOption()
    {
        Scanner s = new Scanner(System.in);
        return s.next();
    }

    public void run(School school)
    {
        while(true)
        {
            show();
            String userOption = readOption();
            int optionNumber = Integer.parse(userOption);
            options.get(optionNumber).action(school);
        }
    }
    private ArrayList<Option> options = new ArrayList<>();
}