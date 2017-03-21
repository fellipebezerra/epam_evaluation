package pl.wiktordolecki;

/**
 * Fibonnaci sequence is given by recursive relation
 *
 * F[n+2] = F[n+1] + F[n]
 * with
 * F[0] = 0
 * F[1] = 1
 *
 * Implement function returning n-th element of Fibonnaci Sequence.
 *
 * 1. Implementation working in O(n) memory and time
 *
 * 2. Bonus task - Can you make it to have performance should be in O(log n) memory and time?
 */
/**
 * @author Felipe Bezerra
 */
public class Excercise03 {

    public static int fibonnaci(int n) {
    	
    	 int F = 0;     
         int ant = 0;   
  
         for (int i = 1; i <= n; i++) {
  
             if (i == 1) {
                 F = 1;
                 ant = 0;
             } else {
                 F += ant;
                 ant = F - ant;
             }
  
         }
    	
        return F;
    }
    
    public static void main(String[] args) {
    	 
            for (int i = 0; i < 30; i++) {
                System.out.print("(" + i + "):" + Excercise03.fibonnaci(i) + "\t");
            }
     
        }
}
