package variable;

public class VarTest {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;

        System.out.println("num1과 num2의 더하기는 ? = " + (num1 + num2));
        System.out.println("num1과 num2의 빼기는 ? = " + (num1 - num2));
        System.out.println("num1과 num2의 곱하기는 ? = " + (num1 * num2));

        int num3,num4;
        num3 = 10; num4 = 20;
        System.out.println(num3+num4);
        int sum = num3 + num4;
        System.out.println(sum);

        long longVar = 10000000000L;
        boolean isTrue = true;
        System.out.println(longVar);
        System.out.println(isTrue);
    }
}
