package myown;
import org.junit.Test;
import org.junit.Assert;
import junit.framework.TestCase;
public class CustomTest extends TestCase {
	@Test
	public void intiate() {
		Custom<Integer> myList=new Custom<Integer>();
		Assert.assertEquals(0,myList.size(),0); 
	}
	@Test
	public void testGet() {
		Custom<Integer> myList=new Custom<Integer>();
		myList.add(21);
		int t=myList.get(0);
		Assert.assertEquals(21,t); 
	}
	@Test
	public void testSize() {
		Custom<Integer> myList=new Custom<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		Assert.assertEquals(3,myList.size());
	}
	
	@Test
	public void testRemove() {
		Custom<Integer> myList=new Custom<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		myList.remove(1);
		Assert.assertEquals(2,myList.size());
	}
	
	@Test
	public void testEnsureCapacity() {
		Custom<Integer> myList=new Custom<Integer>();
		myList.add(21);
		myList.add(22);
		myList.add(23);
		myList.add(24);
		myList.add(25);
		myList.add(26);
		myList.add(27);
		myList.add(28);
		myList.add(29);
		myList.add(30);
		myList.add(31);
		myList.add(32);
		int removedVal=myList.remove(1);
		Assert.assertEquals(11,myList.size());
	}
	
	
	@Test
	public void testRemoveException() {
		Custom<Integer> myList=new Custom<Integer>();
	  boolean thrown = false;

	  try {
		  int removedVal=myList.remove(90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	@Test
	public void testRemoveExceptionZero() {
		Custom<Integer> myList=new Custom<Integer>();
	  boolean thrown = false;

	  try {
	    myList.remove(-23);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	@Test
	public void testGetException() {
		Custom<Integer> myList=new Custom<Integer>();
	  boolean thrown = false;
	  try {
	    myList.get(90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	@Test
	public void testGetExceptionZero() {
		Custom<Integer> myList=new Custom<Integer>();
	  boolean thrown = false;

	  try {
	    myList.get(-90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}	
}
