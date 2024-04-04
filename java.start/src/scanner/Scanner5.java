package scanner;


import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요");
            int str = scanner.nextInt();

            System.out.print("두 번째 정수를 입력하세요");
            int str2 = scanner.nextInt();

            if (str == 0 && str2 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("입력한 두 정수의 합 : " + (str+str2));
        }




   }
}
