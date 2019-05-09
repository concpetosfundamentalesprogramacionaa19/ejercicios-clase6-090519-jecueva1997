/*
    Desarrollar una aplicacion que me permita ingresar placas de carros, 
    se asume que las placas ingresadas pertenecen a la region Costa del Ecuador 
    en base a la placa nuestro programa determinara y presentara con la placa a 
    la Provincia a la que pertenece
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        String nombre = "";
        System.out.println("Por favor ingrese su placa");
        nombre = entrada.nextLine();
        
        char valor = nombre.charAt(0);
        
        
                
        switch(valor){
            case 'e':
            case'E':
                System.out.printf("La provincia es: Esmeraldas %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'j':
            case'J':
                System.out.printf("La provincia es:Santo Domingo de los "
                        + "Tsáchilas %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'm':
            case'M':
                System.out.printf("La provincia es:Manabí %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'r':
            case'R':
                System.out.printf("La provincia es:Los Ríos %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            
            case 'g':
            case'G':
                System.out.printf("La provincia es:Guayas %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'y':
            case'Y':
                System.out.printf("La provincia es:Santa Elena %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
            case 'o':
            case'O':
                System.out.printf("La provincia es:El Oro %s de %s\n", 
                        valor, nombre.toUpperCase());
                break;
         
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
