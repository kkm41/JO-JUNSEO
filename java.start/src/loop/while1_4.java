package loop;

public class while1_4 {
    public static void main(String[] args) {

        int i =10;

        while (i < 3) {
            System.out.println("현재 숫자는? : " + i);
        }

        do{
            System.out.println("현재 숫자는? : " + i);
            i++;
        } while (i<3);
        //최초의 1번은 실행한다. 즉, i=10일때를 먼저 실행한다. 그 다음 조건문(while)을 만난다.

    }
}
