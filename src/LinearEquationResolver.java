import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number a:");
        double a = scanner.nextDouble();

        System.out.println("number b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("all x is nghiem");
            } else {
                System.out.println("No solution!");
            }
        } else {
            double answer = (-b / a);
            System.out.println("answer is: " + answer);
        }
    }
}

