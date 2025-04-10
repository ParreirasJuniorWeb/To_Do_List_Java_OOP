/******************************************************************************

                    ATIVIDADE SUPERVISIONADA 01 DE PROGRAMAÇÃO 
                        ORIENTADA A OBJETOS COM JAVA 
                        
Aluno: João Victor Parreiras Soares 
Data de entrega: 02/09/2024
Valor: 1,0 (pe)
Curso: Análise e Desenvolvimento de Sistemas 
Professor: Helder Rodrigues da Costa

*******************************************************************************/
public class Atividade_1
{
	public static void main(String[] args) {
	    
	// Preencher um vetor de números inteiros ímpares, de 1 até 20, e mostrar na tela.    
    
    int quant = 20, i; // Por padrão quant será 20 - pois é o que a atividade pede.
		
		int[] vetorInt = new int[quant];
		
		for(i = 0; i < quant; i++) {
		    
		    vetorInt[i] = i;
		    
		    if(vetorInt[i] % 2 == 0){
		        continue;
		        
		    }else {
		        System.out.println();
		        System.out.println("Valores no Array int: " + vetorInt[i]);
		    }
		}
	}
}