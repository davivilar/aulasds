/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repitacao;
import java.util.Scanner;

/**
 *
 * @author Lab08-MicroProf
 */
public class Repitacao 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Seu nome é: "+nome);
        System.out.println("Vamos contar?");
        
        System.out.println("Digite Primeiro Numero do Intervalo: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o Segundo Numero do Intervalo: ");
        int numero2 = entrada.nextInt();
        
        for (int contador =numero1; contador <= numero2; contador++)
                                {
                                    System.out.println(contador);
                                }        
        
        while (numero1 >= numero2)
                {
                    System.out.println("O numero1 não ser Maior que o Numero 2");
                    System.out.println("Digite Primeiro Numero do Intervalo: ");
                    numero1 = entrada.nextInt();
                    System.out.println("Digite o Segundo Numero do Intervalo: ");
                    numero2 = entrada.nextInt();
                        {
                            for (int contador =numero1; contador <= numero2; contador++)
                                {
                                    System.out.println(contador);
                                }
                        }
                }
       
    }
    
}
