package cond;

public class else_if {
    public static void main(String[] args) {

      /*  7세 이하의 경우 : 미취학
        8세 이상 13세 이하 : 초등학생
        14 세이상 16세 이하 : 중학생
        17세 이상 19세 이하 : 고등학생
        20세 이상  : 성인
*/
        int age = 20;

        if(age <= 7) {
            System.out.println("미취학입니다");
        }else if(age<=13){
            System.out.println("초등학생입니다");
        }else if(age<=16){
            System.out.println("중학생입니다");
        }else if(age<=19) {
            System.out.println("고등학생입니다");
        }else{
            System.out.println("성인입니다");
        }

        int price = 10000;
        int age1 = 10;
        int discount = 0;

        if(price >=10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }else{
            System.out.println("할인금액은 없습니다.");
        }

        if(age1<=10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");

        }
        System.out.println("총 할인 금액 = " + discount + "원 ");


        if(false)
            System.out.println("실행됨...");
            System.out.println("실행안됨...");




    }







}
