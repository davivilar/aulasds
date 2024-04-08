/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Lab08-MicroProf
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Você é Lindo Maravilhoso? 1 - Sim ou 2 - Não");
        int resposta = entrada.nextInt();
        
        while (resposta == 1)
        {
            System.out.println("Não vc é Gatinho");
            System.out.println("");
            System.out.println("Você é Lindo Maravilhoso? ");
            resposta = entrada.nextInt();
            
        }
        
    }
    
}
