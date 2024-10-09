/**
 * 
 */
package mystack;

/**
 * @author StephenYearwood
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null)
		{
			return null;
		}
		T val = theStack.val;
		theStack = theStack.next;
		return val;
	}

	public void push(T v) {
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> Stack = new MyStack<>();
		// Push 1 and 2
		Stack.push(1);
		Stack.push(2);
		// Pop
		Stack.pop();
		// Push 5
		Stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> People = new MyStack<>();
		Person person1 = new Person("Stephen", "Yearwood");
		Person person2 = new Person("Christelle", "Scharff");
		// Push a person p1 with your name
		People.push(person1);
		// Push a person p2 with my name
		People.push(person2);
	}

}
