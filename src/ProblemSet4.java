/**
 * Problem Set 4.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();
        
        // comment out or uncomment as needed
        
        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
                
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     * 
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */
    
	public void sum() {
		
        int lower;
        int upper;
        int sum = 0;
	// values to determine the lower and upper bound
		
        System.out.print("\nLower bound: ");
        lower = in .nextInt();
        System.out.print("Upper bound: ");
        upper = in .nextInt();
	// allows the user to enter the numbers into the prompt
		
        while (lower > upper) {
            System.out.print("Lower bound: ");
            lower = in .nextInt();
            System.out.print("Upper bound: ");
            upper = in .nextInt();
        }
	// confirms whether or not the user enters the correct numbers in their correct prompt
		
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
	// computes the sum of all even intergers

        	String sumString = String.format("%,d", sum);
        	System.out.println("\n" + sumString + ".");
		
	}

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

	public void reverse() {
		
        int intergers;
        String separate = "";
        String digits = "";
		
        System.out.print("\nPositive interger: ");
        intergers = in .nextInt();
	// determines the values in order to place them in reverse
		
        while (intergers <= 0) {
            System.out.print("Positive interger: ");
            intergers = in .nextInt();
        }
	// confirms whether or not the value is positive

        String intString = String.format("%d", intergers);

        for (int i = intString.length(); i >= 0; i--) {
            if (i > 0 && i != 1) {
                digits = intString.substring(i - 1, i);
                separate = separate + digits + ", ";
            } else if (i == 0) {
                digits = intString.substring(i, i + 1);
                separate = separate + digits + ".";
            }
        }

        	System.out.println("\n" + separate);
	// prints the digits in reverse order
	}

    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */
    
    	public void digits() {
		
        int integer2;
        int digit2;
        int sum2 = 0;
		
        System.out.print("\nPositive integer: ");
        integer2 = in .nextInt();
	// deteremines the values of the prompt
		
        while (integer2 <= 0) {
            System.out.print("Positive integer: ");
            integer2 = in .nextInt();
        }
	// confirms whether or not the value is positive

        String intString2 = String.format("%d", integer2);
        char[] digitsArray = intString2.toCharArray();

        for (int i = 0; i < intString2.length(); i++) {
            if (digitsArray[i] % 2 == 1) {
                double digit = Character.getNumericValue(digitsArray[i]);
                sum2 += digit;
            }
        }
        	System.out.println("\n" + sum2 + ".\n");
	// prints the sum of all of the ood digits in the integer
    }


    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    	public void average() {
		
        System.out.print("\n");
        int number = 0;
        double sum3 = 0;
        int i = 0;
	//determines the values for the average values

        do{
           System.out.print("Non-negative integer: ");
           number = in.nextInt();
        	if(number>0){ 
          	   sum3 = sum3 + number;
          	   i++;
        	}
        }while(number>=0);
        	double average = sum3 / i;
        	System.out.printf("\n%,.2f.", average);
	//prints he average of te values entered
    }
    
    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

	public void prime() {
		
        int tested;
        boolean prime = true;
		
        System.out.print("\nNon-negative integer: ");
        tested = in .nextInt();
	// determines the values
		
        while (tested <= 0) {
            System.out.print("Non-negative integer: ");
            tested = in .nextInt();
        }
	// confrims that the values are non-negatvive
		
        for (int i = 2; i <= tested / 2; i++) {
            if (tested % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("\nPrime.");
        } else {
            System.out.println("\nNot prime.");
        }
		//prints whether or not th evalue is prime or not
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    	public void fibonacci() {
		
        int fibonacciNumber;
        System.out.print("\nPositive integer: ");
        fibonacciNumber = in .nextInt();
	// determines the values of fibonacci

        while (fibonacciNumber <= 0 || fibonacciNumber > 92) {
            System.out.print("Positive integer: ");
            fibonacciNumber = in .nextInt();
        } 
	// confirms whether or not the integer is positive or not
        long base1 = 0;
        long base2 = 1;
        long fibonacci = 0;
	// integers
		
        for (int i = 2; i <= fibonacciNumber; i++) {
            fibonacci = base1 + base2;
            base1 = base2;
            base2 = fibonacci;
        }
        System.out.println("\n" + base2 + ".");
	// prints the Fibonacci number
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    	public void factors() {
		
        System.out.print("\nPositive integer: ");
        int value = in .nextInt();
	//prompts to ask for the values
		
        while (value <= 0) {
            System.out.print("Positive integer: ");
            value = in .nextInt();
        }
	// confirms whether or not the values are positive
		
        System.out.print("\n");
		
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                if (i > value / i) {
                    System.out.print(".\n\n");
                    return;
                } else {
                    if (i == 1) {
                        System.out.print(i + ", " + (value / i));
                    } else {
                        if (i != (value / i)) {
                            System.out.print(", " + i + ", " + (value / i));
                        } else {
                            System.out.print(", " + i + ".\n\n");
                            return;
                        }
                    }
                }
            }
        }
	// prints th factors
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    	public void mario() {
		
        System.out.print("\nHeight: ");
        int height = in .nextInt();
	// prompts for the user to enter the value
		
        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in .nextInt();
        }
	// confirms whether or not the nummber is between 1 and 24 but not including 1 and 24
        System.out.print("\n");

        String output = "";
        int h = height;
        String s = " ";
        String t = "#";
	// values
		
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - (i + 1); j++) {
                output = output + s;
            }
            for (int k = 0; k < i + 2; k++) {
                output = output + t;
            }
            output = output + '\n';
        }
        System.out.print(output);
	// prints out the mario styled half-pyramid of the specified height
    }
    
    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    	public void luigi() {
		
        System.out.print("\nHeight: ");
        int height = in .nextInt();
	// prompts for the user to enter the value
		
        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in .nextInt();
        }
        System.out.print("\n");
	// confirms whether or not the nummber is between 1 and 24 but not including 1 and 24
		
        String output = "";
        int h = height;
        String s = " ";
        String t = "#";
	// values
		
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - (i + 1); j++) {
                output += s;
            }
            for (int j = 0; j <= i + 1; j++) {
                output += t;
            }
            output += s;
            output += s;
            for (int j = 0; j <= i + 1; j++) {
                output += t;
            }
            output += "\n";
        }

        System.out.print(output);
	// prints out the mario styled pyramid of the specified height
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    	public void credit() { 
		
	System.out.print("\nNumber: ");
        long card = in .nextLong();
		
        int length = String.valueOf(card).length();
        int array[] = new int[length];
        int odd[] = new int[(length / 2)];
        int even[] = new int[(length / 2) + 1];
		
        String twoDigits = (Long.toString(card)).substring(0, 2);
        String oneDigit = (Long.toString(card)).substring(0, 1);
	// prompts the user to enter integer
	
        for (int i = 0; i < length; i++) {
            array[i] = Integer.valueOf((Long.toString(card)).substring(i, i + 1));
        }
		
        int k = 0;
        if ((length % 2) != 0) {
            for (int j = 1; j < length; j += 2) {
                odd[k] = array[j];
                k++;
            }
        } else if ((length % 2) == 0) {
            for (int j = length - 2; j > -1; j -= 2) {
                odd[k] = array[j];
                k++;
            }
        }
	//make sure the credit card is valid according to Luhn's algorithm
		
        k = 0;
        if ((length % 2) != 0) {
            for (int j = 0; j < length; j += 2) {
                even[k] = array[j];
                k++;
            }
        } else if ((length % 2) == 0) {
            for (int j = 1; j < length; j += 2) {
                even[k] = array[j];
                k++;
            }
        }
	//make sure the credit card is valid according to Luhn's algorithm
		
        int multiply = 0;
        int working = 0;
	//values to mae sure that the credit card is working
        
	for (int l = 0; l < (length / 2); l++) {
            working = (2 * odd[l]) % 10;
            multiply += working;
            working = ((2 * odd[l]) / 10) % 10;
            multiply += working;
        }

        int sum4 = multiply;
        for (int m = 0; m < (length / 2) + 1; m++) {
            sum4 += even[m];
        }
	//response to mae sure that the credit card is vaild
		
        String lastDigit = (Integer.toString(sum4)).substring(1, 2);

        if ((lastDigit.equals("0") && (twoDigits.equals("34") || twoDigits.equals("37"))) && length == 15) {
            System.out.println("\nAmex.\n");
        } else if (((lastDigit.equals("0")) && (twoDigits.equals("51") || twoDigits.equals("52") || twoDigits.equals("53") || twoDigits.equals("54") || twoDigits.equals("55"))) && length == 16) {
            System.out.print("\nMastercard.\n");
        } else if (((lastDigit.equals("0")) && (oneDigit.equals("4")) && (length == 13 || length == 16))) {
            System.out.print("\nVisa.\n");
        } else {
            System.out.print("\nInvalid.\n");
	//response to mae sure that the credit card is vaild
        }
    }
}
