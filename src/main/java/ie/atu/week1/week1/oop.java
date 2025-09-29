package ie.atu.week1.week1;
import java.util.Scanner;
public class oop {




        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);

            // Prompt user for first number
            System.out.print("Please enter the first number: ");
            double firstNum = scan1.nextDouble();
            System.out.println("You entered " + firstNum);

            // Prompt user for second number
            System.out.print("Please enter the second number: ");
            double secondNum = scan1.nextDouble();
            System.out.println("You entered " + secondNum);

            // Prompt user for operation
            System.out.print("Choose an operation (add, subtract, multiply, divide): ");
            String operation = scan1.next();

            // Switch statement for operation
            double result = switch (operation) {
                case "add" -> firstNum + secondNum;
                case "subtract" -> firstNum - secondNum;
                case "multiply" -> firstNum * secondNum;
                case "divide" -> {
                    if (secondNum == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        yield 0;
                    } else {
                        yield firstNum / secondNum;
                    }
                }
                default -> {
                    System.out.println("Invalid operation.");
                    yield 0;
                }
            };

            // Print result
            System.out.println("The result is: " + result);
        }
    }


