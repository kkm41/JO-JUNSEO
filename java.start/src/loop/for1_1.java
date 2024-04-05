package loop;

public class for1_1 {
    public static void main(String[] args) {

        /*문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기*/

        int i = 1;
        int endnum = 3;
        int sum = 0;

        /*for(int i = 1; i<=endnum; i++){
            sum+=i;
            System.out.println("i = " + i + " sum = " + sum);*/

        while (i <= endnum) {
            sum+=i;

            System.out.println(sum);
            i++;
        }

        }


    }





