package loop;

public class test4 {
    public static void main(String[] args) {

/*문제: 구구단 출력
중첩 for문을 사용해서 구구단을 완성해라*/

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }




    }
}
