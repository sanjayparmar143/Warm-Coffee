import java.util.Scanner;

public class s2{

    public static void main(String[] args) {
        int s,p;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter S :- ");
        s = sc.nextInt();

        System.out.print("Enter P :- ");
        p = sc.nextInt();

        if (s > p) {
            System.out.println("S is Big");
        } else {
            System.out.println("P is Big");
        }

        
    }
}