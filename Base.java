import java.util.Scanner;

public class Base {

  public static void printString(String text) {   // General method for printing messages
    System.out.println(text);
  }

  public static void main(String[] ags) {

    char operation; // store operator for calculation
    double secondNumber, firstNumber = 0, result = 0; // store entered numbers and result
    Scanner inputChar = new Scanner(System.in); // for scanning entered operators

    printString("Welcome to Calculator Application \n Please use + - * / as operator \n");

    do {

      printString("\nEnter first number:");
      Scanner inputNumber = new Scanner(System.in);
      firstNumber = inputNumber.nextDouble();

      printString("Enter operator:");

      operation = inputChar.next().charAt(0);

      printString("Enter second number:");
      Scanner inputSecondNumber = new Scanner(System.in);
      secondNumber = inputSecondNumber.nextDouble();

      switch (operation) {

      case '+':
        result = firstNumber + secondNumber;
        break;

      case '-':
        result = firstNumber - secondNumber;
        break;

      case '*':
        result = firstNumber * secondNumber;
        break;

      case '/':
        result = firstNumber / secondNumber;
        break;

      default:
        printString("Unknown operation");
      }

      printString("\nResult:\n"+firstNumber +" "+ operation + " " + secondNumber +" = "+result+"\n");

      printString("Do you want to make new calculation? Please enter N to quit:");
      operation = inputChar.next().charAt(0);

      if (operation == 'n' || operation == 'N') {


        printString("\n---------------\nThank You, BUY! \n---------------\n\n");
        System.exit(0);
      }


    } while (operation != 'N' || operation != 'n');
    System.exit(0);

  }
}