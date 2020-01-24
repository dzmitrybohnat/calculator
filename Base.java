import java.util.Scanner;
import java.util.InputMismatchException;

public class Base {

  public static void printString(String text) {
    System.out.println(text);
  }

  public static void main(String[] ags) {

    char operation;
    double secondNumber, result = 0;
    Scanner inputChar = new Scanner(System.in);
    boolean continueInput = false;

    printString("Welcome to Calculator Application \n Please use + - * / as operator \n Please use N or n after calculation is done to quit");

    do {

      try{				
        printString("Enter number");
        Scanner inputNumber = new Scanner(System.in);
        result = inputNumber.nextDouble();
        continueInput = true;
        }

    catch (InputMismatchException e){

  } while (!continueInput);

      printString("Enter operator");
      operation = inputChar.next().charAt(0);

      if (operation == 'n' || operation == 'N') {

        printString("BUY! App is closed!");
        System.exit(0);

      } else {

        printString("Enter number");
        Scanner inputSecondNumber = new Scanner(System.in);
        secondNumber = inputSecondNumber.nextDouble();

        switch (operation) {

        case '+':
          result += secondNumber;
          break;

        case '-':
          result -= secondNumber;
          break;

        case '*':
          result *= secondNumber;
          break;

        case '/':
          result /= secondNumber;
          break;

        default:
          printString("Unknown operation");
        }
      }

      printString("Your result is: "+result);

      printString("If you want make new calculation enter any char otherwise prin N");
      operation = inputChar.next().charAt(0);

      if (operation == 'n' || operation == 'N') {

        printString("\n\nThank You, BUY! \n\n\n");
        System.exit(0);
      }

    } while (operation != 'N' || operation != 'n');
  
    System.exit(0);

  }
}