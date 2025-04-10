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

public class Atividade_2 

//Preencher um vetor inteiro de 8 posições com elementos int, mostrar qual deles e quantos é maior do que 20
// e somá-los e mostrar na tela para o usuário. 

{
	public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);
    
    int quant = 8, i, num, quant_maior_20 = 0, soma = 0, somatorio = 0; 
    // Variáveis do sistema
    // Por padrão a variável quant recebe o valor numérico de 8 - por definição na atividade.
    
    // somatorio (variável) é a SOMA DE TODOS OS NÚMEROS DO ARRAY vetorInt!
    // soma (variável) é a SOMA APENAS DOS VALORES QUE SÃO MAIORES DO QUE 20!
    
    int [] vetorInt = new int[quant]; // vetor int
    
    try {
        for(i = 0; i < quant; i++) {

            System.out.println("Entre com o valor numérico inteiro:");
            num = leia.nextInt();
        
            vetorInt[i] = num;
        }
        
        for(i = 0; i < quant; i++) {
            
            System.out.println();
            System.out.println("Valores no Array:");
            System.out.println(vetorInt[i]);
            
            somatorio += vetorInt[i];
        }
        
        System.out.println("\nSoma de valores no Array, todos os valores: " + somatorio);
        
        for(i = 0; i < quant; i++) {
            
            if(vetorInt[i] > 20) { // Por definição a atividade solicita que seja o número 20 para exibir números maiores do que este.
                
                System.out.println();
                System.out.println("Valores no Array que são maiores do que 20:");
                
                quant_maior_20++; // variável incrementável
                
                System.out.println(vetorInt[i]);
                
                soma += vetorInt[i]; // variável responsável pela soma dos números condicionais em cada laço For.
            }
        }
        System.out.println();
        System.out.println("Quantidade de valores maiores do que 20: " + quant_maior_20);
        System.out.println("Soma de valores maiores do que 20: " + soma);
        
    }catch(Exception InputMismatchException){
            System.out.println("Entre com um número inteiro!");
        }
        
        leia.close();
        System.exit(0);
	}
}