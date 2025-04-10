import java.util.ArrayList;
//import java.util.InputMismatchException;

	// Código-fonte para o To-Do-List simples: https://onlinegdb.com/xYLOGirLk

import java.util.Scanner;
//import TratamentoDeExcecoesJava.ErroValidacao;

public class TodoListJava extends itemTodoList {
    
    private ArrayList<TodoListJava> todos = new ArrayList<>();
    
	 public TodoListJava(String todoName, int todoID, String todoCompleted) {
	        super(todoName, todoID, todoCompleted);  
	   }
		
		public void addItemTodo(TodoListJava itemTodo_user){
		    this.todos.add(itemTodo_user);
		}
	
	    public void MudarEstadoDaTarefa(String status, int num_tarefa){
		    this.todos.get(num_tarefa).setterStatus_completed(status);
		}
		
	    public void ExcluirItemTodo(int todos_id){
	         this.todos.remove(this.todos.get(todos_id).getterTodo_ID());
	    }
	
    	public void AlterarItemTodo(String nomeItemTodo, int todo_id, TodoListJava itemTodo_user){

    	     String tarefaAntiga = this.todos.get(todo_id).getterName();
    	     int tarefaAntiga_id = tarefaAntiga.indexOf(nomeItemTodo);
    	     
    	     System.out.println("ÍNDICE: " + tarefaAntiga_id);
    	     
    	     if(this.todos.get(todo_id).getterName() == nomeItemTodo) {
    	      
    	        this.todos.get(todo_id).setterName(itemTodo_user.getterName());
    	        this.todos.get(todo_id).setterTodo_ID(itemTodo_user.getterTodo_ID());
    	        this.todos.get(todo_id).setterStatus_completed(itemTodo_user.getterStatus_completed());
    	     
    	         System.out.println("Tarefa alterada com sucesso: [Índice: " + tarefaAntiga_id + ", Nome: " + tarefaAntiga + "].");
    	     }
				return;
    	}
	
	    public void Listar_todos(){
	        	// Itarar o Array depois da remoção de um Elemento
	        	
				System.out.println("Os elementos no ArrayList são: ");
				
				for (int i = 0; i < todos.size(); i++) {
				 System.out.println("Tarefa["+i+"] (Nome) = " + todos.get(i).getterName());
				 System.out.println("Tarefa["+i+"] (ID) = " + todos.get(i).getterTodo_ID());
				 System.out.println("Tarefa["+i+"] (Está concluída) = " + todos.get(i).getterStatus_completed() + "\n");
				}
	    }
	    
	    public String VerificarSeTarefaExiste(int num_tarefa){
	       String results = this.todos.contains(todos.get(num_tarefa)) ? "Verdadeiro" : "False";
	       return results;
	    }
	    
	    public String BuscaPorArrayList(int num_tarefa) {
	        try {
	            return this.todos.get(num_tarefa).getterName();
	        }
	        catch (IndexOutOfBoundsException e) {
					System.out.println("ERROR: Índece da lista todos não encontrada!");
					System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
		            System.out.println ( e.getMessage() ); 
		            
		            System.out.println("Causado por: " + e.getCause());
				}
				return null;
	    }
	    
	     public String BuscaPorArrayList_completed(int num_tarefa) {
	        try {
	             this.todos.get(num_tarefa).getterStatus_completed();
	             System.out.println("Status: " + this.todos.get(num_tarefa).getterStatus_completed());
	        }
	        catch (IndexOutOfBoundsException e) {
					System.out.println("ERROR: Índece da lista todos não encontrada!");
					System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
		            System.out.println ( e.getMessage() ); 
		            
		            System.out.println("Causado por: " + e.getCause());
				}
				return null;
	    }
	    
	     public int BuscaPorArrayList_indice(int ID_ItemTodo) {
	        try {

	            return this.todos.get(ID_ItemTodo).getterTodo_ID();
	        }
	        catch (IndexOutOfBoundsException e) {
					System.out.println("ERROR: Índece da lista todos não encontrada!");
					System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
		            System.out.println ( e.getMessage() ); 
		            
		            System.out.println("Causado por: " + e.getCause());
				}
				return 0;
	    }
	    
	     public void Apagar_todos(){
	        	// Remoção de todos os Elementos de um ArrayList

				for (int i = 0; i < todos.size(); i++) {
				 this.todos.clear();
				}
				
				// Verificar se o ArrayList está vazio.
				
				String eh_vazio_ArrayList = this.todos.isEmpty() ? "Verdadeiro" : "Falso";
				 
				System.out.println("Os elementos no ArrayList foram excluídos com sucesso.");
				System.out.println("ArrayList todos está vazio: " + eh_vazio_ArrayList);
	    }
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String controle = "s";
		
		String deletarTarefa = "NÃO";
		
		int num_tarefa = 0;
		
		String ConfirmarSelecaoDelecao = "NÃO";
		
		String alterarTarefa = "NÃO";
		
		int TarefaAlterar = 0;
		
		String TarefaDesejada_alterar = "";
		
		String findTarefa = "NÃO";
		
		int TarefaEncontrada = 0;
		
		String limpar_array = "NÃO";

		TodoListJava item_todo = new TodoListJava("", 0, "False"); 
		
		//Inserindo elementos Tarefas no ArrayList todos:
		
		do {
			//leia.nextLine();
			int todoID = 0;
			try {

			System.out.println("Insira uma tarefa nova: ");
			String tarefa1 = leia.nextLine();
			int todo_id_1 = todoID++;
			
			System.out.println("Insira uma tarefa nova: ");
			String tarefa2 = leia.nextLine();
			int todo_id_2 = todoID++;
				
			System.out.println("Insira uma tarefa nova: ");
			String tarefa3 = leia.nextLine();
			int todo_id_3 = todoID++;
				
			System.out.println("Insira uma tarefa nova: ");
			String tarefa4 = leia.nextLine();
			int todo_id_4 = todoID++;
				
			System.out.println("Insira uma tarefa nova: ");
			String tarefa5 = leia.nextLine();
			int todo_id_5 = todoID++;
			
			try {
				TodoListJava item_todo_1 = new TodoListJava(tarefa1, todo_id_1, "False");
				TodoListJava item_todo_2 = new TodoListJava(tarefa2, todo_id_2, "False");
				TodoListJava item_todo_3 = new TodoListJava(tarefa3, todo_id_3, "False");
				TodoListJava item_todo_4 = new TodoListJava(tarefa4, todo_id_4, "False");
				TodoListJava item_todo_5 = new TodoListJava(tarefa5, todo_id_5, "False");
				
				item_todo.addItemTodo(item_todo_1);
				item_todo.addItemTodo(item_todo_2);
				item_todo.addItemTodo(item_todo_3);
				item_todo.addItemTodo(item_todo_4);
				item_todo.addItemTodo(item_todo_5);
				
			}catch(NullPointerException e) {
				System.out.println ( "Ponteiro para objeto nulo!" ); 
	            System.out.println ( e.getMessage() ); 
	            
	            System.out.println("Causado por: " + e.getCause());
			    }
			}
			catch(Exception InputMismatchException) {
				System.out.println("ERRO: Tipo de entrada não é um acaractere do tipo String!");
			}
			
		// Acesso aos elementos no ArrayList
		
		item_todo.Listar_todos();
		
		// Mudar o status da Tarefa
		
		System.out.println("Deseja concluir a tarefa? SIM ou NÃO");
		String mudarStatusDaTarefa = leia.next().toString();
		
		if(mudarStatusDaTarefa.equals("SIM")) {
			
			System.out.println("Qual é o número (índice) da tarefa?");
			int mudarStatusTarefa_user = leia.nextInt(); //índice!
			
			if(item_todo.VerificarSeTarefaExiste(mudarStatusTarefa_user) == "Verdadeiro"){
			    
			    System.out.println("Deseja concluir a tarefa? True (para ser concluída) ou False (para ser tarefa em andamento)");
			    String status_tarefa_a_mudar = leia.next().toString();
			    
			    item_todo.setterStatus_completed(status_tarefa_a_mudar);
			    item_todo.MudarEstadoDaTarefa(status_tarefa_a_mudar, mudarStatusTarefa_user);
			    
			    String qual_a_tarefa_mudar_status = item_todo.BuscaPorArrayList(mudarStatusTarefa_user);
			    System.out.println("A tarefa " + qual_a_tarefa_mudar_status + " está concluída: " + item_todo.getterStatus_completed() +".");
			}
		}
		
 		// Remover um elemento de uma posição do ArrayList todos:
		
		System.out.println("Deseja deletar alguma Tarefa? SIM ou NÃO");
		deletarTarefa = leia.next().toString();
		
		if(deletarTarefa.equals("SIM")) {
			
			System.out.println("Qual é o número (índice) da tarefa?");
			
			try {
				num_tarefa = leia.nextInt();
			}
			catch (Exception InputMismatchException) {
	
				System.out.println("Entre com um número inteiro!");
			}
                if(item_todo.VerificarSeTarefaExiste(num_tarefa) == "Verdadeiro"){
                
				System.out.println("A Tarefa " + item_todo.BuscaPorArrayList(num_tarefa) + " de número " + num_tarefa +" foi selecionada para a deleção? Confirmação: SIM ou NÃO");
				ConfirmarSelecaoDelecao = leia.next().toString();
				
				if(ConfirmarSelecaoDelecao.equals("SIM") && item_todo.BuscaPorArrayList_completed(num_tarefa) == "True") {
					
					item_todo.ExcluirItemTodo(num_tarefa); //Remove o elemento da posição 3 do ArrayList todos.
					System.out.println("A Tarefa de número " + num_tarefa +" foi removida com sucesso.");
					// Iterar na lista através do laço for-each:
		
		            item_todo.Listar_todos();
	
                }else {
                    System.out.println("Esta tarefa NÃO está concluída ainda. Escolha outra!");
		
                    // Itarar o Array depois da remoção de um Elemento!
                    	System.out.println("Tarefas que consta no ArrayList:");
				        item_todo.Listar_todos();
                }
		}else {
		    System.out.println("ID não consta no ArrayList.");
		}
		}else {
		    System.out.println("Nenhuma tarefa deletada.");
		}
		
		// Alterar um elemento no ArrayList:
		
		System.out.println("Deseja Alterar alguma Tarefa? SIM ou NÃO");
		alterarTarefa = leia.next().toString();
		
		if (alterarTarefa.equals("SIM")) {
                
                try {
                    System.out.println("Qual é o número (índice) da tarefa que quer alterar?");
				try {
					TarefaAlterar = leia.nextInt();
				}
				catch(Exception TypeError) {
					System.out.println("ERRO: Tipo de entrada não é um caractere do tipo inteiro!");
				}
				}catch(IndexOutOfBoundsException e) {
        					System.out.println("\nERROR: Índece da lista todos não encontrada!");
        					System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
        		            System.out.println ( e.getMessage() ); 
        		            
        		            System.out.println("Causado por: " + e.getCause() + "\n");
        				}
				
				if(item_todo.VerificarSeTarefaExiste(TarefaAlterar) == "Verdadeiro"){
			
        				System.out.println("Tarefa: " + item_todo.BuscaPorArrayList(TarefaAlterar));
        				
        				String nomeItemTodo_alter = item_todo.BuscaPorArrayList(TarefaAlterar);
        				
        				int indiceArrayTermFound = item_todo.BuscaPorArrayList_indice(TarefaAlterar);
        				
        				System.out.println("ID da tarefa = " + indiceArrayTermFound);
        				
        				System.out.println("Qual tarefa deseja colocar no lugar de " + nomeItemTodo_alter + "?");
        				TarefaDesejada_alterar = leia.next().toString();
        			
            			int todo_id_6 = todoID++;
            				
            			TodoListJava tarefa_user_alter = new TodoListJava(TarefaDesejada_alterar, todo_id_6, "False");
            			
            			try {
            			    
            			    item_todo.AlterarItemTodo(nomeItemTodo_alter, indiceArrayTermFound, tarefa_user_alter);
            			    
            			} catch (IndexOutOfBoundsException e) {
        					System.out.println("\nERROR: Índece da lista todos não encontrada!");
        					System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
        		            System.out.println ( e.getMessage() ); 
        		            
        		            System.out.println("Causado por: " + e.getCause() + "\n");
        				}
            			
        			System.out.println("Tarefa foi alterada para " +  TarefaDesejada_alterar + " com o índice " + item_todo.BuscaPorArrayList_indice(todo_id_6) + " com sucesso!");
				
        				// Manipulação do Objeto via ArrayList - Object TodoListJava!
			} else {
				System.out.println("ERROR: Tarefa não encontrada. Status = " +item_todo.VerificarSeTarefaExiste(TarefaAlterar)+ "!");
				}
			
		} else {
			System.out.println("Nenhuma tarefa foi alterada.");
		}
		
		// Iterar na lista através do laço for-each:
		
		item_todo.Listar_todos();
		
		// Buscar por Tarefa no ArrayList
		
		System.out.println("Deseja encontrar alguma Tarefa? SIM ou NÃO");
		findTarefa = leia.next().toString();
		
		if(findTarefa.equals("SIM")) {
			
			System.out.println("Qual é o número (índice) da tarefa OU entre com o nome da tarefa?");
			
			try {
				TarefaEncontrada = leia.nextInt();
			}
			catch (Exception InputMismatchException) {
	
				System.out.println("Entre com o ID da tarefa OU Nome da tarefa solicitada.");
			}
			try {
				String TarefaEncontrada_Nome = leia.next().toString();
			}
			catch (Exception InputMismatchException) {
	
				System.out.println("Entre com o Nome da tarefa (opcional).");
			}
                if(item_todo.VerificarSeTarefaExiste(TarefaEncontrada) == "Verdadeiro"){
                    
                    String tarefaAchada = item_todo.BuscaPorArrayList(TarefaEncontrada);
                    
                    System.out.println("A tarefa " + tarefaAchada + " foi encontrada no ArrayList todos!");
                }
		}
		
		// Limpar o ArrayList todos de todas as Tarefas - elementos:
		
		System.out.println("Deseja limpar o ArrayList todos e apagar TODAS as tarefa? SIM ou NÃO");
		limpar_array = leia.next().toString();
		
		if(limpar_array.equals("SIM")) {
		    
		    item_todo.Apagar_todos();
		}

        System.out.println("Repetir? SIM ou NÃO");
		controle = leia.next().toString();
		
		} while (!controle.equals("NÃO"));
		leia.close();
		System.exit(0);
	}
}
