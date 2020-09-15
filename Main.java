import java.util.Scanner;  

/**
 * calculate how much it would cost to purchase different quantities of computer parts
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner input for program 
    Scanner input = new Scanner(System.in);  

    // ask the user for how many chromebook chargers 
    System.out.println("How many chromebook chargers?");

    // number of how many chromebook chargers from the user 
    int Chrome_A = input.nextInt();

    // ask the user for how many replacement motherboards  
    System.out.println("How many motherboards?"); 

    // number of how many replacement motherboards from the user
    int Mother_B = input.nextInt(); 

    // ask the user for how many computer mice 
    System.out.println("How many Mice?"); 

    // number of how many replacement mice from the user 
    int Mice_C = input.nextInt();  

    // add the value of the computer parts 
    double value_A = 34.99*Chrome_A;

    double value_B = 127.50*Mother_B; 

    double value_C =  18.00*Mice_C; 

    // add the total value 

    double total_sub = value_A + value_B + value_C;

    // tell the user the Subtotal of the parts 
    System.out.println("Subtotal = " +  total_sub); 

    // calculate the tax and tell the user 
    double chrome_tax = value_A*0.13; 

    double mother_tax = value_B*0.13; 

    double mice_tax = value_C*0.13;  

    double total_tax= chrome_tax + mother_tax + mice_tax; 

    System.out.println("Taxes = " +  total_tax); 

    // calculate total 
    double Total_Price = total_sub + total_tax; 

    System.out.println("Total = " + Total_Price);



  }
}
