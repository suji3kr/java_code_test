import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정숫값:");
        int n = stdIn.nextInt();
        int count = 0;                                          //약수의 개수
        for (int i =1; i<=n; i++)
            if (n % i ==0) {                                   //나누어서
                System.out.print(i + " ");                      //표시
                count++;
            }
        System.out.println("\n의 약수는 " + count +"개입니다 .");    //개수
    }
}
