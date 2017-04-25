import java.util.*;

public class simpleCoinSet implements simpleCoinSetInt {
	
	Set<Integer> mySet;
	
	public simpleCoinSet(int capacity) {
		mySet = new HashSet<Integer>(capacity);
	}
	
   // Test whether the set is empty
   public boolean isEmpty() {
	   return mySet.isEmpty();
   }

   // Add a @value to the set
   public void add(int value) {
	   mySet.add(value);
   }

   // Remove a @value from the set
   public void remove(int value){
	   mySet.remove(value);
   }

   // Return the number of elements in the set
   public int getCount() {
		return mySet.size();
   }

   // Return a representation of this set as an array
   public int[] toArray() {
		int[] a = new int[mySet.size()];
		int i = 0;
		
		for(Integer val : mySet)
			a[i++] = val;
		
		return a;	   
   }
   
   /**
    * Return a string representation of the set
    * The empty set is represented as {}
    */
   public String toString() {
	   return mySet.toString();
   }
   
   //Return the intersection of this set and another
   public simpleCoinSet intersect(simpleCoinSet other) {
	   mySet.retainAll(other.mySet);
	   return this;		
   }
	
   //Return the union of this set and another
   public simpleCoinSet union(simpleCoinSet other) {
	   mySet.addAll(other.mySet);
	   return this;			
   }
}
