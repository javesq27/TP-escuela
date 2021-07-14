public class PrinterTester implements Printer{

    @Override
    public void print(String printerest) 
    {
        lastMessage = printerest;
    }

    String lastMessage()
    {
        return lastMessage;
    }

    private String lastMessage;

    
}
