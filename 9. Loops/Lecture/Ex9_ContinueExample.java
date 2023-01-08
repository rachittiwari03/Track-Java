package src;

public class Ex9_ContinueExample {
    public static void main(String[] args) {

        // Continue Statement - To Skip Iteration

        for (int i = 0; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
