package pattern;

public class Q13 {
    public static void main(String[] args) {
        int n = 5;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}
