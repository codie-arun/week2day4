package week2day4lab;


public class Stack {
	 int size;
	 int arr[];
	 int top;
	 
	 Stack(int size) {
		 this.size = size;
		 this.arr = new int[size];
		 this.top = -1;
	 }
	 
	 public void push(int x) {
		 if (!isFull()) {
			 top++;
			 arr[top] = x;
			 System.out.println(x);
		 } 
		 else 
		 {
			 System.out.println("Stack is full !");
		 }
	 }
	 
	 public int pop() {
		 if (!isEmpty()) {
			 int i = top;
			 top--;
			 System.out.println("Popped "+arr[i]);
			 return arr[i];
		 } 
		 else 
		 {
			 System.out.println("Stack empty");
			 return -1;
		 }
	 }
	 
	 public int peek() {
		 if(!this.isEmpty())
			 return arr[top];
	     else
	     {
	         System.out.println("Empty Stack");
	         return -1;
	     }
	 }
	
	 public boolean isEmpty() {
	 return (top == -1);
	 }
	 
	 public boolean isFull() {
	 return (size - 1 == top);
	 }
	 
	 public static void main(String[] args) {
	 Stack s = new Stack(10);
	 s.pop();
	 s.push(1);
	 s.push(2);
	 s.push(3);
	 s.push(4);
	 s.push(10);
	 s.pop();
	 s.pop();
	 s.pop();
	 s.pop();
	 s.pop();
	 s.pop();
	 }
	}