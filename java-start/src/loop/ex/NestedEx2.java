package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        System.out.println("1X");
        System.out.println("2X");

        int rows = 3;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
