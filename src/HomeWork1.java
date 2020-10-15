public class HomeWork1 {


    public static void main(String[] args) {
        // целые
        byte a = 127; // от -128 до 127 1b
        short b = 32000; // от -32768 до 32767 2b
        int c = 3; // 2 ** 31 4b
        long d = 345; // 2 ** 63 8b
        // вещественные
        float aa = 0.5f; // 8 знаков после запятой 4b
        double bb = 1.12; // 16 знаков после запятой 8b
        char cc = '*'; // 1 символ, кроме \ '.
        boolean dd = true; // true || false

        int x = calculate(1, 2, 3, 4);
        System.out.println(x);

        boolean z = checkNumber(1, 2);
        System.out.println(z);

        isPositive(1);

        System.out.println(isNegative(1));

        greeting("Vadim");

        System.out.println(isLeapYear(2000));
    }

    static int calculate(int a, int b, int c, int d) {
        int x = a * (b + (c / d));
        return x;
    }

    static boolean checkNumber(int a, int b) {
        int x = a + b;
        if (x <= 20 && x >= 10) {
            return true;
        } else {
            return false;
        }
    }

    static void isPositive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }

    static void greeting(String a) {
        System.out.println("Привет, " + a + "!");
    }

    static boolean isLeapYear(int a) {
        if ((a % 400 == 0) || ((a  % 4 == 0) && (a % 100 != 0))) {
            return true;
            } else {
            return false;
        }
    }
}