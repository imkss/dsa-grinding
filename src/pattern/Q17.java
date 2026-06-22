package pattern;

public class Q17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if(j < i){
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print(ch + " ");
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
