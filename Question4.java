import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

     // columns should be outer
     
    Scanner in = new Scanner(System.in);
    String chara = "*";
    String s = "";
    System.out.print("");
    int num = in.nextInt();

    for(int j = 0; j<num; j++){
      String empty = "";
      
      for(int i = num-j; i>0; i--){
        empty += chara;
        System.out.println(empty);
        
        
        
        
      }
      System.out.print(j);
      System.out.println(empty);
      
      
      // for each iteration of the inner loop i changes because the value of j in the outer loop changes
      // So when i = 5 (5-0) it will iterate five times sresulting in the concantenation of the character to the empty string five times
      // Process repeats as long i > 0
      
      
      
      
    }
    

      
    


    
  }
}
