import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.print("정숫값:");
        int n = stdIn.nextInt();

        //if (조건식)실행문 else 실행문
        if (n>=0)
            //n>=0이 true일때 실행한다.
            System.out.println("절댓값은 "+ n +"입니다.");
        else
            //n >=0이 false 일때 실행한다.
            System.out.println("절댓값은"+ -n +"입니다.");
    }
}
