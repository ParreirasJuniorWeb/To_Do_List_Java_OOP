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

public class Atividade_5 

{
	public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);
    
    int i, k; // Variáveis de controle dos laços For.
   
    // Variáveis do sistema - uma para lidar com a iteração de linhas e outra, colunas em uma matriz java.

    int [] vetorInt = new int[3]; // Vetor inteiro de 3 elementos

    int [][] matrixInt = new int[3][3]; // Matrix 3x3 - Matriz quadrática de ordem 3. Matriz 3 por 3.

    try {
        
        for(i = 0; i < vetorInt.length; i++){
            
            System.out.println("[Vetor] Entre com um nome número inteiro:");
            vetorInt[i] = leia.nextInt(); // Entrada de dados do tipo int
        }
        
        for(i = 0; i < matrixInt.length; i++) {
            for(k = 0; k < matrixInt.length; k++){
                System.out.println("\n[Matrix] Entre com um nome número inteiro:");
                matrixInt[i][k] = leia.nextInt(); // Entrada de dados do tipo int
            }
        }
        
       for(int l = 0; l < matrixInt.length; l++) { // imprimir as linhas da matriz
            for(k = 0; k < matrixInt[l].length; k++) { // imprimir as colunas da matriz
                
                System.out.println();
                System.out.println("Número: [Linha: "+l+"][coluna: "+ k +"] " + matrixInt[l][k]); // imprimir os valores de cada conjunto de linha/coluna da matriz 3x3.
                
                System.out.println();
                
                for(i= 0; i < vetorInt.length; i++) {
                    
                    int resultadoMultiplica = vetorInt[i] * k;
                    
                    System.out.println("multiplicação: " + vetorInt[i] + " x " + k + " = " + resultadoMultiplica);
                        // imprimir, conforme a atividade solicita, a multiplicação do vetor pelas colunas da matriz.
                }
            }
        }
	}catch(Exception InputMismatchException){
	    System.out.println("Entre com um número inteiro!");
	    }
	    
	    leia.close();
        System.exit(0);
	}
}