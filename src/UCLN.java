import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find greatest common factor of two numbers ");
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("There is no greatest common factor of a and b!");
        } else if (a == 0 && b != 0) {
            System.out.printf("%d is Greatest common factor", b);
        } else if (b == 0 && a != 0) {
            System.out.printf("%d is greatest common factor", a);
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }

            }
            System.out.println("greatest common factor is: " + a);

        }
    }
}
