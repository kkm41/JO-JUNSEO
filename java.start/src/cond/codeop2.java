package cond;

public class codeop2 {
    public static void main(String[] args) { //삼항연산자
        int age = 18;
        String status = (age>=18) ? "성인" : "미성년자";

        System.out.println("age =" + age + " status = " + status );

        double rating = 7.1;

        if(rating >=9.0){
            System.out.println("어바웃타임을 추천합니다");
        }else if(rating >=7.9) {
            System.out.println("어바웃타임을 추천합니다");
            System.out.println("토이스토리를 추천합니다");
        }else if(rating>=7.0){
            System.out.println("어바웃타임을 추천합니다");
            System.out.println("토이스토리를 추천합니다");
            System.out.println("고질라를 추천합니다");
        }

        String grade = "G";

        if(grade == "A"){
            System.out.println("탁월한 성과입니다!");
        }else if(grade=="B"){
            System.out.println("좋은 성과입니다!");
        }else if(grade=="C"){
            System.out.println("djasdklasdlk");
        } else if (grade == "D") {
            System.out.println("마마마마");
        }else if(grade =="E"){
            System.out.println("아모르파티");
        } else if (grade == "F") {
            System.out.println("불합격입니다");
        }else{
            System.out.println("잘못된 학점입니다");
        }

        switch(grade){
            case "A" :
                System.out.println("탁월한 성과입니다!");
            break;
            case "B" :
                System.out.println("B급 성과입니다!");
            break;
            case "C" :
                System.out.println("C급 성과입니다!");
            break;
            case "D" :
                System.out.println("D급 성과입니다!");
            break;
            default:
                System.out.println("아주 형편 없습니다");

        }

        int a = 10;
        int b = 20;

        int max = (a>b)? a: b;
        System.out.println(max);

        int x = 3;

        String min = (x%2==0)? "짝수":"홀수";
        System.out.println("x는 " + min + " 입니다");
    }








}
