import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Load Scanner.
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Low-End Calculator!");

        System.out.println("Please enter a number.");
        int num1 = input.nextInt();
        System.out.println(num1);

        // prompt for operator
        System.out.println("Please enter a valid operator.");
        String operator = input.next();
        System.out.println(operator);

        System.out.println("Please enter another number.");
        int num2 = input.nextInt();
        System.out.println(num2);

        int result;

        if ("+".equals(operator)){
            result = num1 + num2;
        }
        else if("-".equals(operator)){
            result = num1 - num2;
        }
        else if("*".equals(operator)){
            result = num1 * num2;
        }
        else if("/".equals(operator)) {
            result = num1 / num2;
        }
        else {
            result = -99999; // TODO: Fix this shit
        }

        System.out.println("The result is: " + result);


    }
}
