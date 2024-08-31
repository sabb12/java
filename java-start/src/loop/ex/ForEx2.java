package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        for(int num = 2, count = 1; count <= 10; num += 2, count++){
//            System.out.println( num);
//        }

        // 이 코드가 위 코드 보다 좋다
        int num = 2;
        for(int count = 1; count <= 10; count++){
            System.out.println(num);
            num += 2;
        }
    }
}
