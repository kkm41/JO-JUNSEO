package scanner;


import java.util.Scanner;

public class Scanner15 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         int totalCost = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();
            if (option == 1) {

                System.out.println("상품명을 입력하세요");
                String foodName = sc.nextLine();

                System.out.println("상품의 가격을 입력하세요");
                int price = sc.nextInt();

                System.out.println("상품의 갯수를 입력하세요");
                int quantify = sc.nextInt();

                totalCost += price*quantify;
                System.out.println("상품명 :" + foodName+ "상품가격 : " + price + "상품 갯수 : " + quantify + "합계 : " + (price*quantify));
            }
        }
   }
}
