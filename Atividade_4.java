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

public class Atividade_4 

{
	public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);
    
    int i, k; // Variáveis de controle dos laços For.
   
    // Variáveis do sistema - uma para lidar com a iteração de linhas e outra, colunas em uma matrix java.

    int [][] matrixInt = { {10, 20, 30 }, {40, 50, 60 }, {70, 80, 90 } }; // Matrix 3x3 - Matrix quadrática de ordem 3. Matrix 3 por 3.
        
    for(i = 0; i < matrixInt.length; i++) { // imprimir as linhas da matrix
        for(k = 0; k < matrixInt[i].length; k++) { // imprimir as colunas da matrix
                
            System.out.println();
            System.out.println("Número: [Linha: "+i+"][coluna: "+ k +"] " + matrixInt[i][k]); // imprimir os valores de cada conjunto de linha/coluna da matrix 3x3.
                
            System.out.println();
            System.out.println("   Tabuada do 5 [Linha: "+i+"][coluna: "+ k +"] " + " Operação: " + matrixInt[i][k] + " x " + 5 + " = " + matrixInt[i][k] * 5);
                // imprimir, conforme a atividade solicita, a multiplicação por 5 dos números contiddos nos valores da matrix numérica.
            }
        }

	    leia.close();
        System.exit(0);
	}
}