
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
            System.out.println("5.Aprobado o Reprobado");
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
                    System.out.println("Ingrese el numero que desea ver el factorial :");
                    int numero = brazil.nextInt();
                    int factorial = factorial (numero);
                    System.out.println("El factorial de "+numero+" es " + factorial );
                    System.out.println("");
                    break;
                case 3:
                    texto();
                    break;
                case 4:
                    promedios();
                    break;
                case 5:
                    System.out.println("Ingrese una nota : ");
                    int nota = brazil.nextInt();
                    boolean aprueba = aprobadoOreprobado(nota);
                    if (aprueba == true){
                        System.out.println("El alumno esta aprobado");
                    }else{
                        System.out.println("El alumno esta reprobado");
                    }
                    System.out.println("");
                   break;
                case 6:
                    brazil.nextLine();
                    System.out.println("Ingrese la primera cadena :");
                    String cad1 = brazil.nextLine();
                    System.out.println("Ingrese la segunda cadena :");
                    String cad2 = brazil.nextLine();
                    boolean esta = estaadentro(cad1,cad2);
                    if (esta == true){
                        System.out.println("La segunda cadena esta en la primera cadena");
                    }else{
                        System.out.println("No esta en la cadena");
                    }
                    System.out.println("");
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
    
    public static int factorial (int n){
        int temporal=1;
        for (int i = 1; i <= n; i++) {
            temporal *= i;
        }
        return temporal;
    }
    
    public static void texto (){
        brazil.nextLine();
        System.out.println("Ingrese una cadena :");
        String mensaje = brazil.nextLine();
        System.out.println("");
        System.out.println(mensaje);
        System.out.println("");
    }
    
    public static void promedios (){
        int rep=4;
        int sumaN=0;
        int nota;
        for (int i = 0; i < rep; i++) {
            System.out.println("Ingrese la nota :");
            nota=brazil.nextInt();
            sumaN+=nota;
        }
        int promedio = sumaN/rep;
        System.out.println("El promedio es :");
        System.out.println(promedio);
    }
    
    public static boolean aprobadoOreprobado (int nota){
        boolean temporal=false;
            if (nota<=60){
                temporal = false;
            }else if (nota > 60){
                temporal = true;
            }
        return temporal;
    }
    
    public static boolean estaadentro (String Original, String Buscada){
        boolean temporal;
        temporal = Original.contains(Buscada);
        return temporal;
    }
    
}
