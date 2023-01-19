public class innerclass{

    public static void main(String[] args) {
        innerclass i = new innerclass();
        innerclass.Test t = i.new Test();
        t.use();
        
    }


    class Test{

    void use(){
        int a = 3;

        if (a % 2 == 0) {
            System.out.println("This num is even :" + a);
        } else {
            System.out.println("This num is odd :" + a);
        }
        }

    }
}