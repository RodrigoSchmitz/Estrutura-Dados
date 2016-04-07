
public class SupertList {
	private int[] list;
	private int[] nextPosition;
	private int firstPosition;
	private int lastPosition;
	private int counterSizeArray;
	private int size;
	
	public SupertList(int size){
		this.list = new int[size];
		this.nextPosition = new int[size];
		this.firstPosition = 0;
		this.lastPosition = 0;
		this.counterSizeArray = 0;
		this.size = size;
	}
	
	public void putInTheEnd(int value) throws Exception{
		if(this.size >= this.counterSizeArray){
			if(this.counterSizeArray == 0)
				this.list[this.counterSizeArray] = value;
			else{
				this.list[this.counterSizeArray] = value;
				this.nextPosition[this.lastPosition] = this.counterSizeArray;
			}
			this.lastPosition = this.counterSizeArray;
			this.nextPosition[this.counterSizeArray] = -1;
			this.counterSizeArray++;
		}else{
			throw new Exception("A lista está cheia!");
		}
	}
	
	public void putInTheBegin(int value) throws Exception{
		if(this.size >= this.counterSizeArray){
			if(this.counterSizeArray == 0){
				this.list[this.counterSizeArray] = value;
				this.lastPosition = this.counterSizeArray;
			}else{
				this.list[this.counterSizeArray] = value;
				this.nextPosition[this.counterSizeArray] = this.firstPosition;
				this.firstPosition = this.counterSizeArray;
			}
			this.counterSizeArray++;
		}
	}
}
