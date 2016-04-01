
public class SuperStack {
	
	private int[] stack;
	private int top;
	private int tamanho;
	
	public SuperStack(int size){
		this.stack  = new int[size];
		this.top = 0;
		this.tamanho = size;
	}
		
	public void push(int value) throws Exception{
		if(top <= tamanho){
			this.stack[top] = value;
			top++;
		} else{
			throw new Exception("A pilha está cheia!");
		}
	}
	
	public int pop() throws Exception{
		if(top >= 0){
			top--;
			return stack[top];
		}
		throw new Exception("A pilha está vazia!");
	}

}
