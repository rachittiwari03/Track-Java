import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        // Calculator using switch operator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator -,+, *, / & %");
        String ch = sc.next();
        switch (ch){
            case "-" :
                System.out.println(num1-num2);
                break;
            case "+" :
                System.out.println(num1+num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            case "*" :
                System.out.println(num1*num2);
                break;
            case "%" :
                System.out.println(num1%num2);
            default:
                System.out.println("Sorry wrong input");
        }

    }
}
