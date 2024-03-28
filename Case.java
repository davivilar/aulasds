/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacase;

/**
 *
 * @author pc
 */
public class EstruturaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entendendo a estrutura CASE
        
        int Numerododia = 8;
        
        switch (Numerododia){
            
            case 1 :
                System.out.println("Hoje é Domingo");
                break;
            case 2 : 
                System.out.println("Hoje é Segunda-Feira");
                break;
            case 3 :
                System.out.println("Hoje é Terça-Feira");
                break;
            case 4 :
                System.out.println("Hoje é Quarta-Feira");
                break;
            case 5 :
                System.out.println("Hoje é Quinta-Feira");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 7:
                System.out.println("Hoje é Sábado-Feira");
                break;
            default :
                System.out.println("Você não está Bem! Não existe o dia da semana digitado");
            
        }
        
        
    }
    
}
