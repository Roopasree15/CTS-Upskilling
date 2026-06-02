import java.util.*;

public class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter operation: ");
        char op = sc.next().charAt(0);

        int result;

        switch(op){

            case '+':
                result = a + b;
                System.out.println(result);
                break;

            case '-':
                result = a - b;
                System.out.println(result);
                break;

            case '*':
                result = a * b;
                System.out.println(result);
                break;

            case '/':
                if(b != 0){
                    result = a / b;
                    System.out.println(result);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}