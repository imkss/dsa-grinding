package pattern;

public class Q21 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                int gap = n - 2;
                System.out.print("* ");
                for (int k = 0; k < gap; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
    }
}
