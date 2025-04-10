/******************************************************************************

                    ATIVIDADE SUPERVISIONADA 01 DE PROGRAMAÇÃO 
                        ORIENTADA A OBJETOS COM JAVA 
                        
Aluno: João Victor Parreiras Soares 
Data de entrega: 02/09/2024
Valor: 1,0 (pe)
Curso: Análise e Desenvolvimento de Sistemas 
Professor: Helder Rodrigues da Costa

*******************************************************************************/
import java.util.Scanner;

public class Atividade_3 

//Preencher um vetor String com 3 nomes com 20 letras no máximo cada. Imprimir os nomes.

{
	public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);
    
    int quant_laco = 3, i;
    
    // Variáveis do sistema
    // Por padrão a variável quant_laco recebe o valor numérico de 3 por definição na atividade.
    // Por padrão a variável quant_char_vetor receberá o valor numérico de 20 por definição na atividade.
    
    String [] nome = new String [quant_laco]; // Vetor String para armazenar 3 nomes

    try {
        for(i = 0; i < quant_laco; i++) { // Preencher o vetor com 3 nomes inseridos pelos usuários
    
            System.out.println("Entre com um nome (máximo 20 letras):");
            nome[i] = leia.nextLine();
    
            while (nome[i].length() > 20) { // no máximo 20 letras! Validação dos nomes
                
                System.out.println("Nome Maior do que 20 letras! Digite novamente (máximo 20 letras):");
                nome[i] = leia.nextLine();
            }
        }
        
        for (String n : nome){ // Imprimindo todos os nomes que estão armazenados e foram aceitos no Array String nome
        
            System.out.println("\nNome: "+ n);  // Captura um carácter por vez (em vários laços For)
        }
        
    }catch(Exception InputMismatchException) {
        System.out.println("Entre com um letras apenas!");
    }
    
     leia.close();
     System.exit(0);
	}
}