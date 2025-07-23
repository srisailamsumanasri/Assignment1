import java.util.Scanner;

public class MathOperationsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Multiplication Table
                    System.out.print("Enter the number: ");
                    int tableNum = sc.nextInt();
                    System.out.println("Multiplication Table of " + tableNum + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " * " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2: // Factorial
                    System.out.print("Enter a number to calculate factorial: ");
                    int factNum = sc.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + factNum + " is " + factorial);
                    break;

                case 3: // Prime Check
                    System.out.print("Enter a number to check if it is prime: ");
                    int primeNum = sc.nextInt();
                    boolean isPrime = true;
                    int i = 2;

                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        while (i <= primeNum / 2) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                    }

                    if (isPrime)
                        System.out.println(primeNum + " is a Prime Number.");
                    else
                        System.out.println(primeNum + " is not a Prime Number.");
                    break;

                case 4: // Fibonacci Series
                    System.out.print("Enter the number of terms for Fibonacci Series: ");
                    int terms = sc.nextInt();
                    int first = 0, second = 1;
                    System.out.println("Fibonacci Series:");
                    for (int j = 1; j <= terms; j++) {
                        System.out.print(first + " ");
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    System.out.println();
                    break;

                case 5: // Exit
                    System.out.println("Exiting the program. Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

            System.out.print("\nBack to menu? (Y/N): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Program ended. Goodbye!");
        sc.close();
    }
}