package pattern;

public class Q20 {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * (n - i) - 1; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j <= i * 2 + 2; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
