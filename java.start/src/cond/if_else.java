package cond;

public class if_else {
    public static void main(String[] args) {

        int age = 15;

        if(age >= 18 ){
            System.out.println("성인입니다");


        }

        if(age < 18){
            System.out.println("미성년자입니다"); //false면 실행 안한다 무시하고 지나간다




        }

        if(true){
            System.out.println("성인입니다");
        }else{
            System.out.println("미성년자입니다");
        }


    }
}
