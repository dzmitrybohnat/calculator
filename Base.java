import java.util.Scanner;

public class Base {

  char operation;
  double secondNumber, result = 0;
  Scanner inputChar = new Scanner(System.in);
  boolean continueInput  = false;

  public void start() {

    printString("Welcome to Calculator!");

    printString("Welcome to Calculator \n Please use + - * / as operator \n Please use Q or q to quit");

    double firstValue = first();

    char operatorValue = operator();

    double secondValue = second();

    switch (operatorValue) {

    case '+':
      System.out.println(firstValue + secondValue);
      break;

    case '-':
      System.out.println(firstValue - secondValue);
      break;

    case '*':
      System.out.println(firstValue * secondValue);
      break;

    case '/':
      System.out.println(firstValue / secondValue);
      break;

    case 'Q':
      System.out.println("BUY");
      System.exit(0);
      break;

    default:
      System.out.println("Undefined operation");

    }

  }

  public static void printString(String text) {
    System.out.println(text);
  }

  public double first() {
    System.out.print("Enter first number: ");
    Scanner scannerFirtsNumber = new Scanner(System.in);
    return scannerFirtsNumber.nextDouble();
  }

  public char operator() {
    System.out.print("Enter operator: ");
    Scanner scannerOperator = new Scanner(System.in);
    return scannerOperator.next().charAt(0);
  }

  public double second() {
    System.out.print("Enter second number: ");
    Scanner scannerSecondNumber = new Scanner(System.in);
    return scannerSecondNumber.nextDouble();
  }
}