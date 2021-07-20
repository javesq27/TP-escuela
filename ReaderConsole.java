import java.util.Scanner;

public class ReaderConsole implements Reader {

    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public String readOption() {
        return scanner.next();
        
    }
    
}
