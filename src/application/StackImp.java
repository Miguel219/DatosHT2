package application;

import java.util.Vector;

public class StackImp implements Stack<String>{
	
	/**
	 * Vector que almacena los operandos y operaciones
	 */
	private Vector<String> vector;
	
	/**
	 * Constructor
	 */
	public StackImp() {
		// TODO Auto-generated constructor stub
		vector = new Vector<String>();
	}

	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		vector.add(item);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(!vector.isEmpty()) {
			String lastElement = vector.lastElement();
			vector.remove(vector.size()-1);
			return lastElement;
		}else {			
			return null;
		}
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if(!vector.isEmpty()) {
			String lastElement = vector.lastElement();
			return lastElement;
		}else {			
			return null;
		}
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if(vector.isEmpty()) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

}
