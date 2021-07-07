import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu implements OpcionMenu {

    private ArrayList<String> names;
    private ArrayList<Double> califications;
    
    public Menu(){
        this.names = new ArrayList<String>();
        this.califications = new ArrayList<Double>();
    }

    public static void main(String[] args){
        Menu nl = new Menu();
        nl.names = new ArrayList<String>(); //Instacio ambos ArrayList.
        nl.califications = new ArrayList<Double>();
        nl.opciones();
    }
    public void opciones(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;

        while(!exit){
            System.out.println("*****BIENVENIDOS*****");
            System.out.println("1.Agregar alumnos");
            System.out.println("2.Visualizar lista Alumnos");
            System.out.println("3.Agregar nota alumnos");
            System.out.println("4.Ver lista Escuela");
            System.out.println("5.Salir");

            try{

                System.out.println("Introduce una opción: ");
                option = scanner.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Agregar Alumnos");
                        
                        break;
                    case 2:
                        System.out.println("Lista Alumnos");
                        break;
                    case 3:
                        System.out.println("Agregar nota a Alumno");
                        break;
                    case 4:
                        System.out.println("Ver lista Escuela");
                        break;
                    case 5:
                        exit=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 al 4");
                }
            }catch(InputMismatchException e){
                System.out.println("Debes elegir una opción");
                scanner.next();
        }
        }
    }
    @Override
    public void AddName() {
        System.out.println("Registrar alumno");
        Scanner keyboard = new Scanner(System.in);
        String valor = null;
        System.out.print("Ingresar Alumno: ");
        valor = keyboard.nextString();
        names.add(valor);
    }

    @Override
    public void searchstudent() {
        System.out.println("Buscar Alumno");
        Scanner keyboard = new Scanner(System.in);
        String valor;
        int indice;
        System.out.print("Ingresar nombre de Alumno:");
        valor = keyboard.nextString();
        indice = names.indexOf(valor);
        if (indice != -1){
            System.out.println("Nombre encontrado en la posición: " + indice);
        }else{
            System.out.println("Nombre no registrado");
        }
    }

    @Override
    public void AddNotas() {
        System.out.println("Registrar Notas");
        Scanner keyboard = new Scanner(System.in);
        Double valor2 = 0;
        System.out.print("Ingresar Nota: ");
        valor2 = keyboard.nextDouble();
        califications.add(valor2);

    }
    @Override
    public void showSchools() {
        if (!names.isEmpty() && !califications.isEmpty()){
            System.out.println("Lista Escuela");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        }else{
            System.out.println("No hay nadie registrado en la Escuela");
        }
        
    }
    @Override
    public void closeapp() {

    }
}