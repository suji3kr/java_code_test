import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수A:"); int a= stdIn.nextInt();
        System.out.print("변수B:"); int b= stdIn.nextInt();

        if(!(a%b ==0))
            System.out.println("B는 A의 약수가 아닙니다.");
        else
            System.out.println("B는 A의 약수입니다.");
    }
}
