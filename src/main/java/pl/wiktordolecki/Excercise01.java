

package pl.wiktordolecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a function that for an argument int n
 * returns a list of positive numbers lesser or equal to n which are divisible by 3 or 5.
 * List should be sorted in ascending order without repetitions.
 * For value 0 and all negative values of n return empty list.
 */
/**
 * @author Felipe Bezerra
 */
public class Excercise01
{
    /**
     * Your solution should be implemented in this method.
     * Corresponding test class contains few examples of correct input, output pairs.
     *
     * @param n Nonegative integer for inclusive upper bound of list contents
     * @return List object containing positive integers lesser or equal to n
     *         that are divisible by 3 or 5
     */
    public static List<Integer> divisibleBy3OR5(int n) {
    	
    	List<Integer> response = new ArrayList<Integer>();
    	
    	int num = n;
    	int control = 1;
    	
    	while(control <= num){
    		 if (control%3==0){
             	response.add(control);
              }
             if (control%5==0){
             	response.add(control);
             }
             control++;
    	}    	
        return response;
    }

    /**
     * BONUS: List of divisors can be passed as additional parameter.
     */
    public static List<Integer> divisibleBy(int n, List<Integer> divisors) {
        return Collections.emptyList();
    }
}
