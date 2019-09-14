/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guangjian.bao
 */
import java.util.Scanner;
public class AdderOfTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int x=0;
        //int x;        
    int y=0;
        //int y;
    int sum;
        //int sum;
        System.out.println("Type your first number:\n");
    x = input.nextInt();
     System.out.println("Type your second number:\n");
    y = input.nextInt();
    //sum = x+y;
        //x =7;
        //y =8;
        sum=x+y;   
        System.out.println("The toall number is:\n"); 
        System.out.print(sum);
    }
}
