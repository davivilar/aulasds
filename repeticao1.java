/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao;
import java.util.Scanner;
/**
 *
 * @author Lab08-MicroProf
 */
public class repeticao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Numero: ");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++) 
        {
            System.out.println("O seu número é: " + i);
        }
        
            
    }
    
}
