/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulads;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Loop_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exemplo de Estrutura While
        
        int numero=0;
        int comparar;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Numero: ");
        comparar = entrada.nextInt();
                   
            while (numero <= comparar) 
            {
                System.out.println("Contagem Progressiva: "+numero);
                numero++;
            }
    }                   
    }
