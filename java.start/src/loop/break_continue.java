package loop;

public class break_continue {
    public static void main(String[] args) {
        /*문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
               1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다*/


        int sum = 0;
        int i = 1;

       /* while(true){
            sum+=i;
             if(sum>10){
                 System.out.println("합이 10보다 크면 종료 : " +"i = " + i  + " sum = " + sum  );
                 break;
             }
            i++;
        }*/

        /*문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다*/
            while(i<=5){
                if(i==3){
                    i++;
                    continue;
                }
                System.out.println("3을 제외한 i의 숫자들 : " + i);
                i++;
            }


    }
}
