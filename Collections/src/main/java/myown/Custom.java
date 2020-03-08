package myown;
import java.util.Arrays;
public class Custom<A> {
	    private int size = 0;
	    private static final int c = 10;
	    private Object elements[];
	    public Custom() {
	        elements = new Object[c];
	    }
	    private void validCap() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
	    public void add(A element) {
	        if (size == elements.length) {
	            validCap();
	        }
	        elements[size++] = element;
	    }
	    public A get(int index) {
	        if (index >= size || index < 0) {
	            throw new IndexOutOfBoundsException();
	        }
	        return (A) elements[index];
	    } 
	    public A remove(int index) {
	        if (index >= size || index < 0) {
	            throw new IndexOutOfBoundsException();
	        }
	        Object item = elements[index];
	        int numElts = elements.length - ( index + 1 ) ;
	        System.arraycopy( elements, index + 1, elements, index, numElts ) ;
	        size--;
	        return (A) item;
	    }
	    public int size(){
	        return size;
	    } 
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	        	 sb.append(elements[i].toString());
	             if(i<size-1){
	            	 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	}