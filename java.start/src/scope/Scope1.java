package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //지역변수, 생존 시작
        if (true) {
            int x = 20; //x 생존 시작 if 안에서만 생존
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x); //범위 밖으로 나가서 생존 종료 symbol: 찾을 수 없다
        System.out.println("main m = " + m);
    } // m 생존 종료
}
