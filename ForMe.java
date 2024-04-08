/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forme;

import java.util.Scanner;
/**
 *
 * @author Lab08-MicroProf
 */
public class ForMe {

    /**
     * @ForMeparam args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um Numero: ");
        int cont = entrada.nextInt();
        
        for (int inicio = 0 ;inicio<=cont;inicio++)
        {
                System.out.println("Numero : "+inicio);
        }
                
        System.out.println("Imprima Cont: "+cont);
    }
    
}
