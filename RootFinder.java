import java.util.Scanner;

public class RootFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== ROOT FINDER ======");
        System.out.print("Enter the coefficient of X^2: ");
        int a = sc.nextInt();

        System.out.print("Enter the coefficient of X: ");
        int b = sc.nextInt();

        System.out.print("Enter the constant value: ");
        int c = sc.nextInt();

        System.out.println("\n\n======= RESULT =======\n");
        System.out.println("The equation formed: " + a + "x^2 + " + b + "x + " + c);

        // ROOT CALCULATION
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double sumOfRoots = root1 + root2;       // -b / a
        double productOfRoots = root1 * root2;   // c / a

        if (discriminant > 0) {
            System.out.printf("- There are two real roots: %.2f , %.2f", root1, root2);
        } else if (discriminant == 0) {
            System.out.printf("- There is one double root: %.2f", root1);
        } else {
            System.out.println("- No real roots exist.");
        }

        System.out.printf("\n- Sum of roots: %.2f\n", sumOfRoots);
        System.out.printf("- Product of roots: %.2f\n", productOfRoots);
        System.out.println("\n===================");
    }
}