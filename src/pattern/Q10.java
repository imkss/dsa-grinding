package pattern;

public class Q10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= (2 * i + 1)/2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {

            for (int j = 0; j < (2 * n - (2 * i + 1))/2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
