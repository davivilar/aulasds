/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peso_ideal;

import java.util.Scanner;
/**
 *
 * @author Lab08-MicroProf
 */
public class Peso_ideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Entre com seu nome");
        String nome = entrada.nextLine();
        
        System.out.println("Entre com seu SEXO - M para Masculino F para Feminino");
        String sexo = entrada.nextLine();
        
        System.out.println("Entre com sua Altura");
        float altura = entrada.nextFloat();
        
        /**
         * a.	para sexo masculino: peso ideal = (72.7 * altura) - 58
           b.	para sexo feminino: peso ideal = (62.1 * altura) - 44.7
         */
                
        if (sexo.equalsIgnoreCase("M"))
        {
            double peso = (72.7*altura)-58.0;
            System.out.println("Querido "+nome+", seu peso Ideal deveria ser: "+peso);
        }
        else
            if (sexo.equalsIgnoreCase("F"))
                    {
                      double peso = (72.7*altura)-58.0;
                     System.out.println("Minha Querida "+nome+", seu peso Ideal deveria ser: "+peso);
                    }
    }
    
}
