public class EscuelaApp {
    public static void main(String[] args)
    {
        Printer printer = new PrinterConsole();
        Reader reader = new ReaderConsole();
        Escuela escuela = new Escuela();
        Menu menu = new Menu(printer, reader);
        menu.run(escuela);
    }
}
