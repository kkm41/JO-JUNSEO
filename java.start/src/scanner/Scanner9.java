package scanner;


import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        String name = "제육복음";


        System.out.println("음식의 이름을 입력해주세요");
        String foodName = scanner.nextLine();
        System.out.println("음식의 가격을 입력해주세요");
        int foodprice = scanner.nextInt();
        System.out.println("음식의 갯수를 입력해주세요");
        int foodQuantify = scanner.nextInt();

        int totalPrice = foodprice*foodQuantify;
        System.out.println(foodName +  foodQuantify +"개를 주문하셨습니다." + "가격은 " + totalPrice +"원 입니다");




   }
}
