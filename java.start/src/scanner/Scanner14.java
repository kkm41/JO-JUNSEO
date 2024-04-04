package scanner;


import java.util.Scanner;

public class Scanner14 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. -1을 입력하면 프로그램 종료");
        while (true) {
            input = sc.nextInt();
            if (input == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            sum+=input;
            count++;
        }

/*
 while ((input = scanner.nextInt()) != -1) {
 sum += input;
 count++;
 }
*/    //이거 개좋네

        double average = (double)sum / count;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);
   }
}
