package operator;

public class op1 {
    public static void main(String[] args) {

        //"증감,비교,논리,산술,나머지 연산자,대입연산자,삼항연산자"
        int a= 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(!(a == b));


        boolean result = a==b;

        System.out.println(result);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        boolean c = true;
        boolean d = false;


        System.out.println(c && d); ;
        System.out.println(c || d); ;


        int e = 15;;
        System.out.println(e > 10 && e < 20);

        int i = 0;
        i += 3;
        System.out.println(i);
        System.out.println("i = " + i);
        i -= 1;
        System.out.println(i);

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        System.out.println(num1+num2+num3);
        System.out.println(sum);
        int average = sum / 3;
        System.out.println(average);

        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;
        double vsum = var1 + var2 + var3;
        double average1 = vsum / 3 ;

        System.out.println(vsum);
        System.out.println(average1);

        int score = 79;

        System.out.println(score >= 80 && score <=100);





    }
}
