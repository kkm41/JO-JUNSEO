package scanner;


import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);


        System.out.println("구구단 단 수를 입력하세요");
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "x" + i + "=" + (dan*i));
        }

   }
}
