/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forme;
 import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Forme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Laços de Repetição
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Numero: ");
        int contador = entrada.nextInt();
        
        for (int inicio = 0 ; inicio<=10;inicio++)
        {
            int resultado = contador * inicio;
            System.out.println("Tabuada "+contador+" X "+inicio+" = "+resultado);
                   
        }
            
                
        
        
    }
    
}
