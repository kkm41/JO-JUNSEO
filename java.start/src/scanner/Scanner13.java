package scanner;


import java.util.Scanner;

public class Scanner13 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("상품의 가격을 입력하세요");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.println("상품의 수량을 입력하세요");
            int quantify = sc.nextInt();

            System.out.println("총 비용 : " + (price*quantify) + "원 입니다");
        }





   }
}
