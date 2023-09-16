import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        q16();
    }

    public static void q1() {
        System.out.println("Hello");
        System.out.println("Haruto Suzuki");
    }

    public static void q2() {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(a + "足す" + b + "は" + c + "です。");
    }

    public static void q3() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a * b;
        System.out.println(a + "x" + b + "=" + c);
    }

    public static void q4() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void q5() {
        System.out.println("整数[n]を入力してください:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 3; i <= n; i = i + 3) {
            System.out.println(i);
        }
    }

    public static void q6() {
        System.out.println("整数[m]を入力してください:");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        for (int i = m; i <= n; i = i + m) {
            System.out.println(i);
        }
    }

    public static void q7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + i;

        }
        System.out.println("1から" + n + "までの合計は" + a + "です。");
    }

    public static void q8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + i * i;

        }
        System.out.println("1から" + n + "までの整数の2乗の合計は" + a + "です。");
    }

    public static void q9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;

        }
        System.out.println("1から" + n + "までの整数のかけ算は" + a + "です。");
    }

    public static void q10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        System.out.println(n + "までのフィボナッチ数列：");
        int a = 1;
        int b = 0;
        for (int i = 1; i <= n; i = a + b) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }

    public static void q11() {
        Scanner scan = new Scanner(System.in);
        System.out.println("５つの数字を入力してください:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int f = a + b + c + d + e;
        double g = f / 5;
        System.out.println("合計" + f);
        System.out.println("平均" + g);
    }

    public static void q12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("2つの数字を入力してください:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("最大値" + a);
        } else {
            System.out.println("最大値" + b);
        }
    }

    public static void q13() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        int max = -99999999;
        int min = 99999999;
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }

        }
        System.out.println("最大値" + max);
        System.out.println("最小値" + min);
    }

    public static void q14() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + 1.0 / i;
        }
        System.out.println(n + "までの調和級数の合計：" + a);
    }

    public static void q15() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[m]を入力してください:");
        int m = scan.nextInt();
        double a = 0;
        double b = 0;
        for (int i = 1; i <= m; i = i + 4) {
            a = a + 1.0 / i;
        }
        for (int j = 3; j <= m; j = j + 4) {
            b = b - 1.0 / j;
        }
        double c = 4 * (a + b);
        System.out.println(String.format("円周率：" + "%.3f", c));
    }

    public static void q16() {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数[n]を入力してください:");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.print("\r\n");
        }
        System.out.println("______________");
    }

}
