package recursion;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7};
//        long ans = factorial(5);
//        System.out.println(ans);
//        System.out.println(arraySum(nums));
//        char[] str = {'h','e','l','l','o'};
//        revStr(str);
//        System.out.println(str);
//        System.out.println(isPrime(2229));
//        System.out.println(fb(6));
//        System.out.println(pow(2.00, 3));
//        System.out.println(maze(3, 3));
//        mazePath("", 3, 3);
//        System.out.println(mazePathDiagonal("", 3,3 ));
        boolean[][] mazeBox = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        mazeWithObstacle("", mazeBox, 0, 0);
    }
//    Q1
    public static int numSum(int n) {
        if(n == 0) return 0;
        return n + numSum(n - 1);
    }

//    Q2
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return (long) n * factorial(n - 1);
    }

//    Q3
    public static int arraySum(int[] arr) {
        return addFrom(arr, 0);
    }
    public static int addFrom(int[] arr, int ind) {
        if(ind == arr.length) return 0;
        return arr[ind] + addFrom(arr, ind + 1);
    }

//    Q4
    public static void revStr(char[] str) {
        revHelper(str, 0, str.length - 1);
    }
    public static void revHelper(char[] str, int l, int r) {
        // base condition
        if(l >= r) return;
        // the tasks
        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;
        // recursive call
        revHelper(str, ++l, --r);
    }

//    Q5
    public static boolean isPrime(int num) {
        return (divCnt(num,1) == 2);
    }
    public static int divCnt(int num, int i) {
//      Base case
        if (i > num) return 0;
//      Task
        if(num % i == 0) {
            return 1 + divCnt(num, i + 1);
        }
//      Recursive call
        return divCnt(num, i + 1);
    }

//    Q6
    public static int fb(int n) {
        if(n < 2) return n;
        return fb(n - 1) + fb(n - 2);
    }

//    Q7 x^n
    public static double pow(double x, int n) {
    long longN = Math.abs((long) n);
    double ans = powHelper(x, longN);
    return n < 0 ? 1 / ans : ans;
    }
    public static double powHelper(double x, long n) {
        if(n == 0) return 1;
        double half = powHelper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else return x * (half * half);
    }

//    Q8 maze escape problem
    public static int maze(int r, int c) {
        if (r == 1 || c == 1) return 1;
        int down = maze(r - 1, c);
        int right = maze(r, c - 1);
        return down + right;
    }

//    Q8.1 print path
    public static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1 ) {
            System.out.println(p);
            return;
        }
        if(r > 1) {
            mazePath(p + 'R', r - 1, c);
        }
        if(c > 1) {
            mazePath(p + 'D', r, c - 1);
        }
    }

    //    Q8.2 diagonal travel included
    public static List<String> mazePathDiagonal(String p, int r, int c) {
        List<String> ans = new ArrayList<>();
        if (r == 1 && c == 1 ) {
            ans.add(p);
            return ans;
        }
        if(r > 1) {
            ans.addAll(mazePathDiagonal(p + 'R', r - 1, c));
        }
        if(c > 1) {
            ans.addAll(mazePathDiagonal(p + 'D', r, c - 1));
        }
        if(r > 1 && c > 1) {
            ans.addAll(mazePathDiagonal(p + "Dia", r - 1, c - 1));
        }
        return ans;
    }
    //    Q8.3 maze with obstacle
    public static void mazeWithObstacle(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) return;

        if(r < maze.length - 1) {
            mazeWithObstacle(p + 'R', maze, r + 1, c);
        }
        if(c < maze[0].length - 1) {
            mazeWithObstacle(p + 'D', maze, r, c + 1);
        }
        if(r < maze.length - 1 && c < maze[0].length - 1) {
            mazeWithObstacle(p + "Dia", maze, r + 1, c + 1);
        }
    }
}