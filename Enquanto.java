/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeticao;
import java.util.Scanner;
/**
 *
 * @author Lab08-MicroProf
 */
public class Enquanto 
    {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite um Numero: ");
    int numero = teclado.nextInt();
    
    while (numero <=10)
            {
                System.out.println("O numero é:"+numero++);
            }
    }
    
    
    
}
