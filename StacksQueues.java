package com.APCS;

public class stacksAndQueues {

	public static void main (String[] args) throws java.lang.Exception
	{
		int[] myStack = createStack();
		   
	    for(int i=10; i>0; i--)    
	      push(myStack,i);
	   
	    System.out.println("You should print [10,9,8,7,6,5,4,3,2,1]");
	    System.out.println(prettyPrintStack(myStack));
	    System.out.println("This should print 1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
	    for(int i=10; i>0; i--)   
	      System.out.println(pop(myStack));
	    System.out.println("If you add too many elements into the stack, you should print out an error.");
	    for(int i=0; i<110; i++)   
	     push(myStack, i);
	   
	    System.out.println("First, Sunny puts his name on the list. Then, kabir gets jealous and also puts his name. However, the first number that will be called is Kabir, even though Sunny signed up first. In a stack, this first in last out system works just like this, so it shouldn't be used in a scenario like this."); 
	    int[] restroomList = createStack();
	    push(restroomList, 987654);
	    push(restroomList, 123456);
	    System.out.println("As planned, Sunny's ID goes up first(987654), then Kabir's does(123456)");
	    
	    System.out.println("Logically, Sunny's ID pops off, but actually the thing that pops off is" +  pop(restroomList) + ". YOOOOO, Mr.Kim, you can't let that happen, right? So, this shouldn't be used in this scenario.");
	    
	    int[] myQueue = createQueue();
	   
	    for(int i=10; i>0; i--)    
	      enqueue(myQueue,i);
	   
	    System.out.println("You should print [10,9,8,7,6,5,4,3,2,1]");
	    System.out.println(prettyPrintD(myQueue));
	    System.out.println("This should print 10\n9\n8\n7\n6\n5\n4\n3\n2\n1");
	    
	    for(int i=10; i>0; i--)   
	      System.out.println(dequeue(myQueue));
	    System.out.println("If you add too many elements into the stack, you should print out an error.");
	    
	    int[] parkingLot = createQueue();
	    enqueue(parkingLot, 1);
	    enqueue(parkingLot,2);
	    System.out.println("Shaun pulls up to the parking lot, because he can't wait to get to APCS, with a Lamborghini(Car#1). Pranav, because he hates Comp Sci, will park with his 1989 mini cooper(Car#2).");
	    
	    int NEW_DATA = dequeue(parkingLot);
	    System.out.println("Remember, there is only one availible slot left for the two of them. Since Shaun has gone in first, he has to be the first to back off. In case of a queue, due to it being a First in First out poilicy, Car# " + NEW_DATA + " will move first."); 
	    
	    int[] firstResponders = createStack();
	    push(firstResponders,1);
	    push(firstResponders,5);
	    push(firstResponders,10);
	    push(firstResponders,20);
	    push(firstResponders,30);
	    pop(firstResponders);
	    pop(firstResponders);
	    pop(firstResponders);
	    push(firstResponders,30);
	    System.out.println("The way how first responders are dispatched to save a person's life represents a stack. First, the AED models 1, 5, 10, etc are piled on eachother, so that 1 is on the bottom and 30 is on the top. Then, 3 emergenies happened, so they had to remove an AED unit one at a time, starting from the top. The concept of first in last out will apply to this scenario as a stack case.");
	    
	    int[] PSAT = createQueue();
	    enqueue(PSAT, 1320);
	    enqueue(PSAT, 1100);
	    enqueue(PSAT, 1000);
	    enqueue(PSAT, 1450);
	    enqueue(PSAT, 1520);
	    enqueue(PSAT, 100); //yikes
	    enqueue(PSAT, 1243);
	    
	    System.out.println("Students have completed their mock PSAT exam, and are now waiting to be scored. The person who finished first walks up to the teacher, has the PSAT graded, and then gets to walk away. The people who finish after have to wait in a line behind the person(s) who finished faster than themselves. In this case, since the person who stood in line first was graded first, it is an example of First in First Out. So, a queue is perfect to represnt this occasion.");
}
	
	public static String pp(int[] a){
       String rV = "{";
       if (a == null|| a.length == 0)                            
           return "null";
       for (int i=0; i<a.length; i++) {
           rV += a[i];
           if (i!=a.length-1)
               rV+=",";
       }
       rV+="}";
       return rV;
   }

	public static int[] createStack(){
		int[] stack = new int[101];
		stack[0] = stack.length;
		return stack;
	}
	public static void push(int[]stack, int data){
		stack[stack[0]+1] = data;
	    stack[0]++;
	  }
	public static int pop(int[] stack){
		int popped = stack[stack.length-1];
		stack[stack[stack[0]]]--;
		return popped;
    }
	public static String prettyPrintStack(int[] stack){
		if(stack == null) {
			return "null";
		}
		String returnValue = "{";
		for(int i = 1; i <= stack[0]-1; i++){
			returnValue = returnValue + stack[i];
			if(i != stack.length) {
				returnValue = returnValue + ",";
			}
		}
		returnValue = returnValue + " }";
		return returnValue;
	}
	public static String dumpStack(int[] stack) {
		if(stack == null) {
			return "null";
		}
		String returnValue = "{";
		for(int i = 1; i <= stack[0]-1; i++){
			returnValue = returnValue + stack[i];
			if(i != stack.length) {
				returnValue = returnValue + ",";
			}
		}
		returnValue = returnValue + " }";
		return returnValue;
	}
	public static int[] createQueue() {
		int [] queue = new int[100];
		queue[0] = 0;
		return queue;
	}
	public static void enqueue(int[] queue, int data) {
		queue[queue[0]+1] = data;
	    queue[0]++;
	}
	public static int dequeue(int[] queue){
	    int returnValue = 0; 
	    
	    for(int i =1;i<queue[0];i++)
	    {
	      queue[i] = queue[i+1];
	    }
	    returnValue =queue[queue[queue.length-queue[0]]];
	    queue[0]--;
	    return returnValue;
	  }
	  public static String prettyPrintD(int[]array){
	        String returnValue ="[";
	        
	        for (int i =1;i<array[0]; i++){
	            returnValue += array[i] +",";
	        }
	        returnValue = returnValue +"]";
	        return returnValue;
	  }
	  public static String dumpQueue(int[]array){
	    String returnValue ="{";
	        
	        for (int i =0;i<array[0]; i++){
	            returnValue += array[i] +",";
	        }
	        returnValue = returnValue +"}";
	        return returnValue;
	  }
	 
	
}

