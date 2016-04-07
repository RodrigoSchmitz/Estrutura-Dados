#include <stdlib.h>
#include <stdio.h>
#include <stdexcept>

class SuperStack{
	private:
		int stack[];
		int top;
		int size;
	
	public:
		SuperStack(int size){
			this->stack[size];
			this->top = 0;
			this->size = size;
		}
	
		void push(int value) {
		
			if(top < size){
				this->stack[size] = value;
				this->top++;
			} else{
				
			}
		}
		
		int pop() {
			
			if(top > 0){
				
				this->top--;
				return this->stack[top];
			} else{
				return -1;
			}
		}

};

int main(){
	
	SuperStack * st = new SuperStack(5);
	
	st->push(10);
	printf("%i\n", st->pop());
	
	return 0;
}
