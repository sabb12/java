package Operator;

public class Compare1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을
        boolean result = a == b; // a == b가 false로 변경 된다
        System.out.println(result);
    }
}
