package casting;

public class Casting4 {
    public static void main(String[] args) {

        int div1 = 3 / 2; // 1.5
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // 1.5
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // 1.5
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // 1.5
        System.out.println("div4 = = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result =" + result);

        // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
        //    int + int는 int를, double + double은 double의 결과가 나온다.
        // 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        //    int + long은 long + long으로 자동 형변환이 일어난다.
        //    int + double은 double + double로 자동 형변환이 일어난다.
    }
}
