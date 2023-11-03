/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_josealvarez;
import java.util.Scanner;
public class Lab4P1_JoseAlvarez {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        Scanner leercad = new Scanner (System.in);
        System.out.println("1. Inversion especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        
        
        while (opcion < 4 && opcion > 0){   
            switch (opcion){
                   
                case 1:
                    System.out.println("Ingrese la cadena: ");
                    String entrada = leercad.nextLine();
                    String entradainvertida = "";
                    String palabra = "";

                    for (int i = 0; i < entrada.length(); i++) {
                    char caracter = entrada.charAt(i);
    
                    if (caracter != ' ') {
                      palabra = caracter + palabra;
                    } else {
                    entradainvertida += palabra + ' ';
                    palabra = "";
                    }
                    }

                    entradainvertida += palabra;

                    System.out.println("Cadena invertida: " + entradainvertida);
                        
                        break;
                        
                case 2:
                    System.out.println("Ingrese la primera cadena: ");
                    String cad1 = leercad.nextLine();
                    
                    System.out.println("Ingrese la segunda cadena: ");
                    String cad2 = leercad.nextLine();
                    
                    System.out.println("Ingrese la tercera cadena: ");
                    String cad3 = leercad.nextLine();

                    int sumacad1 = 0;
                    int sumacad2 = 0;
                    int sumacad3 = 0;
                   
                for (int i = 0; i < cad1.length(); i++) {
                sumacad1 += cad1.charAt(i);
                }

                for (int i = 0; i < cad2.length(); i++) {
                sumacad2 += cad2.charAt(i);
                }

                for (int i = 0; i < cad3.length(); i++) {
                sumacad3 += cad3.charAt(i);
                }

                System.out.println("Peso cadena 1: " + sumacad1);
                System.out.println("Peso cadena 2: " + sumacad2);
                System.out.println("Peso cadena 3: " + sumacad3);

                if (sumacad1 > sumacad2 && sumacad1 > sumacad3) {
                System.out.println("La cadena 1 es mas pesada");
                } else if (sumacad2 > sumacad1 && sumacad2 > sumacad3) {
                System.out.println("La cadena 2 es mas pesada");
                } else if (sumacad3 > sumacad1 && sumacad3 > sumacad2) {
                System.out.println("La cadena 3 es mas pesada");
                } else {
                System.out.println("Todas las cadenas son iguales");
                }
                    break;
                    
                    
                case 3: 
                    
                    System.out.print("Ingrese el mensaje a cifrar: ");
                    String mensajeOriginal = leercad.nextLine();

                    String mensajeCifrado = "";
                    break;

                    
                    
                
                
                    
                    
                    
                    
                        
                    
                    
                    
               
                    
                    
                
            }
            
            
        System.out.println("1. Inversion especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        opcion = leer.nextInt();
        
        }
        
        
    }
    
}
