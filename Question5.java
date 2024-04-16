import java.util.Scanner;
import java.util.ArrayList;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int times = in.nextInt();
    ArrayList<Integer> numlist = new ArrayList<>();
    int mode = 0;
    for(int i = 0; i<times; i++){
      System.out.print("");
      int num = in.nextInt();
      numlist.add(num);
    }

    // check the numbers if it is the same increase count by one (keep track of number of times the nunmber appears)
    // Add the counts for a number that keeps appearing, Set the mode as that number until the count exceeds prev count
    // < elem (iterate the elements before)
    int max = 0;
    for (int elem = 0; elem<numlist.size(); elem++){
      int count = 1;
      int currentelement = numlist.get(elem);
      for (int j = 0; j < elem; j++){
        int prevelement = numlist.get(j);// j is index before current index
        if(currentelement == prevelement){
          count ++;
          // Add an occurence to the same element

        }

      }
      // finding the new mode 
      if(count > max){
        mode = currentelement;
        max = count; 
      }
      
      
    }
    

    System.out.print(mode);
    
    
  }
}
