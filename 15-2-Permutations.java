import java.util.*;
public class driver {
	
	/**
	 * Driver class for the Permutations project
	 * 
	 *@author 
	 *@created March 2014
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		int pSize = 10;
    	PermutationGenerator permutation = new PermutationGenerator(pSize);

    	System.out.println("Random Permutation List Generator");
    	System.out.println();

	    for (int lNum = 1; lNum <= pSize; lNum++)
	    {
	      ArrayList <Integer>permutedList = permutation.nextPermutation();
	
	      System.out.println("List " + lNum + ": ");
	
	      for (int item = 0; item < permutedList.size(); item++)
	      {
	        System.out.print(permutedList.get(item) + " ");
	      }
	      //System.out.print((Integer)permutedList.get(item) + " ");
	
	      System.out.println();
	    }
	}	
}


import java.util.*;


/**
 *  Produces random permutations of the numbers 1 to N
 * 
 *
 * @author     Rocky Lombardo
 * @created    March 2014
 */
class PermutationGenerator{
  ArrayList <Integer> intList;
  ArrayList <Integer> randPermutation;
  Random randSelection;
  int listSize;

  /**
   *  Constructor for the PermutationGenerator object
   *
   * @param  lSize  Number of integers in the permutation list
   */
  public PermutationGenerator(int lSize){
    randSelection = new Random();
    listSize = lSize;
  }

  /**
   *  Constructor for the PermutationGenerator object. Sets default
   *  permutation list size to 10
   */
  public PermutationGenerator(){
    this(10);
  }

  /**
   *  Generates a random permutation. Fills an ArrayList with the
   *  numbers 1 to listSize so that no two entries of the array have
   *  the same contents. Makes a second ArrayList and fills it with
   *  the numbers 1 to listSize. Then picks one of those at random
   *  (using Random.nextInt(int), removes it, and appends it to the
   *  permutation ArrayList. This operation is repeated listSize times.
   *
   * @return    Random permutation ArrayList
   */
  ArrayList<Integer> nextPermutation(){
    //Complete this method
  }
}
