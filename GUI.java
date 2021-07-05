import java.util.InputMismatchException;
import java.util.Scanner;

public class GUI {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;
        int option;

        while(!exit){
            System.out.println("*****BIENVENIDOS*****");
            System.out.println("1.Ver lista Alumnos");
            System.out.println("2.Agregar alumnos");
            System.out.println("3.Agregar nota alumnos");
            System.out.println("4.Salir");

            try{

                System.out.println("Introduce una opción: ");
                option = scanner.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Lista Alumnos");
                        break;
                    case 2:
                        System.out.println("Agregar Alumnos");
                        break;
                    case 3:
                        System.out.println("Agregar nota a Alumno");
                        break;
                    case 4:
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
}