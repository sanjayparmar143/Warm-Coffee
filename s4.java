import java.util.Scanner;

public class s4 {

    public static void main(String[] args) {
        int s;
        int r;
        int p;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter S :- ");
        s = sc.nextInt();

        System.out.print("Enter R :- ");
        r = sc.nextInt();

        System.out.print("Enter P :- ");
        p = sc.nextInt();
        if (s < r) {
            if (s < p) {
                System.out.println("S is small");

            } else {
                System.out.println("P is small");

            }
        } else {
            if (r < p) {
                System.out.println("R is small");

            } else {
                System.out.println("P is small");

            }
        }
    }

}