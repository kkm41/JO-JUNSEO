package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력받으세요");
        int input = sc.nextInt();

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }
}
