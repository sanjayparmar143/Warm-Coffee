import java.util.Scanner;

public class s3{

    public static void main(String[] args) {
    
        int S;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A :- ");
        S = sc.nextInt();

        if (S > 0)
            System.out.println("Positive");
        else if (S < 0)
            System.out.println("Negative");
        else if (S == 0)
            System.out.println("Zero");

    }

}