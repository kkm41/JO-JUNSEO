package cond;

public class Quiz {
    public static void main(String[] args) {

        int score = 59;
        char grade;

        if(score>=90){
            grade = 'A';
        }else if(score>=80 && score<90){
            grade = 'B';
        }else if(score>=70 && score<80){
            grade = 'C';
        }else if(score>=60 && score<70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("학생점수 = " + score + " 학생등급 = " + grade);

       /* int distance = 101;
        String transportation;
        if(distance<=1){
            transportation = "도보";
        }else if(distance<=10){
            transportation = "자전거";
        }else if(distance<=100){
            transportation = "자동차";
        }else if(distance>100){
            transportation = "비행기";
        }
        System.out.println("이동거리 = " + distance + " 운송수단 = " + transportation);*/
        }



}
