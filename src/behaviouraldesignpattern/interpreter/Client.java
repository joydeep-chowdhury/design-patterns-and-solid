package behaviouraldesignpattern.interpreter;

import java.util.Arrays;
import java.util.List;

public class Client {
	
	private final InterpreterEngine interpreterEngine;

	public Client(final InterpreterEngine interpreterEngine) {
		super();
		this.interpreterEngine = interpreterEngine;
	}
	
	public int interprete(String exp) {
		Expression expression = null;
		if(exp.contains("Multiple")) {
			expression = new MultiplyExpression(exp);
		}
		else if(exp.contains("Sum")) {
			expression = new AddExpression(exp);
		}
		
		return expression.interpret(interpreterEngine);
	}
	
	public static void main(String args[]) {
		List<String> expressionList = Arrays.asList("Multiple 23 and 45","Sum of 12 and 93");
		Client client=new Client(new InterpreterEngine());
		expressionList.forEach(expression -> System.out.println(client.interprete(expression)));
	    
	    
	}
	
	

}
