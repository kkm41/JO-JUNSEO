package loop;

public class for1_2 {
    public static void main(String[] args) {
        /*문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가*/
        int sum = 0;


        for(int i = 0; ; i++){
            sum+=i;
            if(sum>10){
                System.out.println("10보다 커지면 종료 : " + "i =" + i + "sum =" + sum );
                break;

            }

        }



    }
}
