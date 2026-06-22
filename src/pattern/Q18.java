package pattern;

public class Q18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
