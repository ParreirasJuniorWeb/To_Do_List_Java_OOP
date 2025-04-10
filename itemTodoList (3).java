/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.ArrayList;

public class itemTodoList {
	private String todoName = "";
	private int todoID = 0;
	private String todoCompleted = "False";
	
	public itemTodoList(String todoName, int todoID, String todoCompleted) {
		this.todoName = todoName;
		this.todoID = todoID;
		this.todoCompleted = todoCompleted;
	}
	
	protected void setterName(String todoName) {
		this.todoName = todoName;
	}
	
	protected void setterTodo_ID(int ID) {
		this.todoID = ID;
	}
	
	protected void setterStatus_completed(String completed) {
		this.todoCompleted = completed;
	}
	
	protected String getterName() {
		return this.todoName;
	}
	
	protected int getterTodo_ID() {
		return this.todoID;
	}
	
	protected String getterStatus_completed() {
		return this.todoCompleted;
	}
}