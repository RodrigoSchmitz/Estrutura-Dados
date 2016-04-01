
public class SuperStack {
	
	private int[] stack;
	private int top;
	
	public SuperStack(int size){
		this.stack  = new int[size];
		this.top = 0;
	}
		
	public void push(int value) throws Exception{
		if(top < stack.length){
			this.stack[top] = value;
			top++;
		} else{
			throw new Exception("A pilha está cheia!");
		}
	}
	
	public int pop() throws Exception{
		if(top > 0){
			top--;
			return stack[top];
		}
		throw new Exception("A pilha está vazia!");
	}

}
