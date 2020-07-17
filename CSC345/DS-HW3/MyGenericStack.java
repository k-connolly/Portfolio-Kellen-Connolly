
public class MyGenericStack<E> 
{
	//char[] array=new char[10];
			@SuppressWarnings("unchecked")
			E[] array = (E[])new Object[10];
			int size = 0;
			boolean empty = true;
			
			public void push(E element) 
			{
				if(size == array.length - 1) 
				{
					//System.out.println("The array is full");
					@SuppressWarnings("unchecked")
					E[] newArray = (E[])new Object[array.length+5];
			
					for (int i=0; i<array.length;i++) 
					{
						newArray[i]=array[i];
					}
					
					array=newArray;
				}
				
				array[size]=element;
				empty=false;
				size++;
			}
			
			public void pop()
			{
				if(empty==false) 
				{
					array[size] = null;
					size--;
				}
				else 
				{
					System.out.println("Can't pop an empty stack");
				}
				
				if(size==0) 
				{
					empty = true;
				}
			}
			
			//Peek method//
			public E peek() 
			{
				E element = array[size-1];
				return element;
			}
			
			//Returns the size of the stack//
			public int size() 
			{
				return size;
			}
			
			//Tests if the stack is empty
			public boolean isEmpty() 
			{
				return empty;
			}
			
}
