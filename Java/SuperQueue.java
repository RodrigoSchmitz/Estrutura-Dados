public class SuperQueue {
	
	private int[] queue;
	private int firstPositionVirtual;
	private int firstPositionReal;
	private int nextPosition;
	private int sizeQueue;
	private boolean isNewQueue;
	
	public SuperQueue(int size, int firstPosition){
		this.queue = new int[size];
		this.sizeQueue = size;
		this.firstPositionVirtual = firstPosition;
		this.firstPositionReal = 0;
		this.nextPosition = 0;
		this.isNewQueue = true;
	}
	
	public void push(int value) throws Exception{
		if(this.isNewQueue){
			this.queue[this.nextPosition] = value;
			this.isNewQueue = false;
			this.nextPosition++;
		} else{
			if(this.nextPosition != this.firstPositionReal){
				this.queue[this.nextPosition] = value;
				if(this.nextPosition == (this.sizeQueue - 1)){
					this.nextPosition = 0;
				} else{
					this.nextPosition++;
				}
			} else{
				throw new Exception("A Fila está cheia!");
			}
		}
	}
	
	public int pop() throws Exception{
		int value;
		if(this.isNewQueue){
			throw new Exception("A fila está vazia!");
		}else{
			value = this.queue[this.firstPositionReal];
			if(this.firstPositionReal == (this.sizeQueue - 1)){
				this.firstPositionReal = 0;
			} else{
				this.firstPositionReal++;
			}
		} 
		return value;
	}
}
