import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("실수a:"); double a= stdIn.nextDouble();
        System.out.print("실수b:"); double b= stdIn.nextDouble();

        double max;   //큰값을 저장
        if (a>b)
            max = a;
        else
            max = b;

        System.out.println("큰 쪽의 값은" + max +"입니다.");
    }
}
