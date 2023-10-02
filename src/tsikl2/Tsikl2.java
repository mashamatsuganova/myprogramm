
package tsikl2;

import java.util.Scanner;

/**
 *
 * @author N7172
 */
public class Tsikl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("введите число");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int m;
        if (N==2)
            System.out.println("число простое");
            
      for( m=2 ; m< N ; m++)
      {
          
        if (N% m==0){
            System.out.println("число не простое");
            break;
        } else if(m==N-1){
             System.out.println("число простое");
             break;
      }
    }
      //change
      //change 2
    }
}