package media;
import java.util.Scanner; //Nesta estapa estamos importando a ferramenta Scanner
        
public class Media 
{

        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in); // Nome dado a ferramenta Scanner, variavel
            float nota1,nota2,nota3,nota4;
            float media;
            
            System.out.println("Insira Primeira Nota: ");
            nota1 = entrada.nextFloat();
            
            System.out.println("Insira Segunda Nota: ");
            nota2 = entrada.nextFloat();
            
            System.out.println("Insira Terceira Nota: ");
            nota3 = entrada.nextFloat();

            System.out.println("Insira Quarta Nota: ");
            nota4 = entrada.nextFloat();

            media = (nota1+nota2+nota3+nota4)/4;
            
            if (media >=7)
                    {
                        System.out.println("Você foi Aprovado!!");
                    }
            if (media >=5 && media <7)
                    {
                        System.out.println("Você esta de Recuperação!!");
                    }        
                    
            if (media <5)
                    {
                        System.out.println("Você foi Reprovado!!");
                    }
            
            System.out.println("Sua Nota foi: "+media);
                 
        }
}
