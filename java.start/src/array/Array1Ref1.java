package array;

public class Array1Ref1 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        System.out.println(students);


        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        System.out.println(90);
        //변수 값 사용
        System.out.println("students1의 점수  = " + students[0]);
        System.out.println("students2의 점수  = " + students[1]);
        System.out.println("students3의 점수  = " + students[2]);
        System.out.println("students4의 점수  = " + students[3]);
        System.out.println("students5의 점수  = " + students[4]);


        System.out.println(90);
    }
}
