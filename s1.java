import java.util.Scanner;

public class s1{
    public static void main(String[] args) {
        int a;
        char b;
        float c;
        double d;
        String e;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter E :- ");
        e = sc.nextLine();

        System.out.println("Enter D :- ");
        d = sc.nextDouble();

        System.out.println("Enter C :- ");
        c = sc.nextFloat();

        System.out.println("Enter B :- ");
        b = sc.next().charAt(0);

        System.out.println("Enter A :- ");
        a = sc.nextInt();
        
        System.out.println("Int= " + a);
        System.out.println("Char= " + b);
        System.out.println("Float= " + c);
        System.out.println("Double= " + d);
        System.out.println("String= " + e);

    }

}