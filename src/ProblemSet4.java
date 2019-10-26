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
	// values
		
        System.out.print("\nLower bound: ");
        lower = in .nextInt();
        System.out.print("Upper bound: ");
        upper = in .nextInt();

        while (lower > upper) {
            System.out.print("Lower bound: ");
            lower = in .nextInt();
            System.out.print("Upper bound: ");
            upper = in .nextInt();
        }

        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

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
	// values
		
        while (intergers <= 0) {
            System.out.print("Positive interger: ");
            intergers = in .nextInt();
        }

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
	// values
		
        while (integer2 <= 0) {
            System.out.print("Positive integer: ");
            integer2 = in .nextInt();
        }

        String intString2 = String.format("%d", integer2);
        char[] digitsArray = intString2.toCharArray();

        for (int i = 0; i < intString2.length(); i++) {
            if (digitsArray[i] % 2 == 1) {
                double digit = Character.getNumericValue(digitsArray[i]);
                sum2 += digit;
            }
        }
        System.out.println("\n" + sum2 + ".\n");
    }


    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    	public void average() {
        arrayList < Integer > arrayIntegers = new arrayList < Integer > ();
        int number;
        int i = 0;
        int sum3 = 0;
        arrayIntegers.add(0);
	// values
		
        while (arrayIntegers.get(i) >= 0) {
            System.out.print("Non-negative integer: ");
            number = in .nextInt();
            arrayIntegers.add(number);
            i++;
        }

        for (int j = 0; j < arrayIntegers.size() - 1; j++) {
            sum3 += arrayIntegers.get(j);
        }
        int arraySize = arrayIntegers.size() - 2;
        double average = (double) sum3 / (double) arraySize;
        System.out.printf("\n%,.2f\n", average);
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

        while (tested <= 0) {
            System.out.print("Non-negative integer: ");
            tested = in .nextInt();
        }

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

        while (fibonacciNumber <= 0 || fibonacciNumber > 92) {
            System.out.print("Positive integer: ");
            fibonacciNumber = in .nextInt();
        }

        long base1 = 0;
        long base2 = 1;
        long fibonacci = 0;

        for (int i = 2; i <= fibonacciNumber; i++) {
            fibonacci = base1 + base2;
            base1 = base2;
            base2 = fibonacci;
        }
        System.out.println("\n" + base2 + ".");
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    	public void factors() {
        System.out.print("\nPositive integer: ");
        int value = in .nextInt();

        while (value <= 0) {
            System.out.print("Positive integer: ");
            value = in .nextInt();
        }

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
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    	public void mario() {
        System.out.print("Height: ");
        int height = in .nextInt();

        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in .nextInt();
        }

        System.out.print("\n");

        String output = "";
        int h = height;
        String s = " ";
        String t = "#";

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

        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in .nextInt();
        }

        System.out.print("\n");

        String output = "";
        int h = height;
        String s = " ";
        String t = "#";

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
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    	public void credit() { in .nextLine();
        System.out.print("\nNumber: ");
        String number = in .nextLine();
        int sum2 = 0;
        int multiply;
        int finalSum = 0;

        for (int i = number.length() - 2; i >= 0; i -= 2) {
            multiply = Character.getNumericValue(number.charAt(i));
            sum2 = multiply * 2;
            if (sum2 >= 10) {
                finalSum += (int)((sum2 / Math.pow(10, 0)) % 10) + (int)((sum2 / Math.pow(10, 1)) % 10);
            } else {
                finalSum += sum2;
            }
        }

        for (int i = number.length() - 1; i >= 0; i -= 2) {
            multiply = Character.getNumericValue(number.charAt(i));
            finalSum += multiply;
        }

        String sum2 = Integer.toString(finalSum);
        if (sum2.charAt(sum2.length() - 1) == '0') {
            if (number.charAt(0) == '3' && (number.charAt(1) == '4' || number.charAt(1) == '7')) {
                System.out.println("\nAmex.\n");
            } else if (number.charAt(0) == '5' && (number.charAt(1) == '1' || number.charAt(1) == '2' || number.charAt(3) == '3' || number.charAt(4) == '4' || number.charAt(5) == '5')) {
                System.out.println("\nMastercard.\n");
            } else if (number.charAt(0) == '4') {
                System.out.println("\nVisa.\n");
            }
        } else {
            System.out.println("\nInvalid.\n");
        }
    }
