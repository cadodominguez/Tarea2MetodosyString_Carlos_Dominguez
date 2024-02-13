
package tarea2_metodosystring_carlosdominguez;
import java.util.Scanner;
public class Tarea2_MetodosyString_CarlosDominguez {
    
    static Scanner brazil = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        boolean out = true;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Replace");
            System.out.println("2.Factorial");
            System.out.println("3.Mensajes");
            System.out.println("4.Promedios");
            System.out.println("5.Aprobado");
            System.out.println("6.Contains");
            System.out.println("7.Salir");
            int opcion = brazil.nextInt();
            switch (opcion) {
                case 1:
                    brazil.nextLine();
                    System.out.println("Ingrese una cadena:");
                    String original = brazil.nextLine();
                    System.out.println("Ingrese la subcadena que desea remplazar:");
                    String remplazo = brazil.nextLine();
                    System.out.println("Ingrese con que la desea remplazar:");
                    String remplazada = brazil.nextLine();
                    String termina = miMetodoDeReemplazo (original,remplazo,remplazada);
                    System.out.println("Resultado del remplazo :");
                    System.out.println(termina);
                    System.out.println("");
                    break;
                case 2:
                    texto();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                   break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    out = false;
                    break;    
                default:
                    System.out.println("La opcion no es valida");
                    System.out.println("");
                    break;
            } 
        } while (out);
    }
    
    public static String miMetodoDeReemplazo (String x,String y, String j){
        String cambiada;
        cambiada = x.replace(y, j);
        return cambiada;
    }
    
    public static void texto (){
        brazil.nextLine();
        System.out.println("Ingrese una cadena :");
        String mensaje = brazil.nextLine();
        System.out.println("");
        System.out.println(mensaje);
        System.out.println("");
    }
    
}
