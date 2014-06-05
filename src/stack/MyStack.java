package stack;

import java.util.EmptyStackException;

/**
 *
 * @author Andrii_Rodionov
 */

public class MyStack {
	
    private Integer[] arr;    
    private int size;
    private final int MAX_STACK_SIZE;
    
    public MyStack(){
       this(10);
    }
    
    public MyStack(int stack_size){
        MAX_STACK_SIZE = stack_size;
        arr = new Integer[MAX_STACK_SIZE];
        size = 0;//edit
    }
    
    public void push(Integer item){
        if(size == MAX_STACK_SIZE){
            throw new IndexOutOfBoundsException();
        }
        arr[size] = item;//edit
        size++;//edit
    }  
    
    public Integer peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        else{
        return arr[size-1];//edit
        }
    }
    
    public Integer pop(){
    	int buffer;//edit
        if(empty()){
            throw new EmptyStackException();
        }
        else{
        	buffer = arr[size-1];//edit 
        	arr[size-1] = 0;//edit
            size--;//edit
        return buffer;//edit
        }
    }
    
    public boolean empty(){
        return (size == 0);
    }
}