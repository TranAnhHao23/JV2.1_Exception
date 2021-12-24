package calculator;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    public static void calculate(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.println("Tổng x + y = " + sum);
            System.out.println("Hiệu x - y = " + sub);
            System.out.println("Nhân x * y = " + mul);
            System.out.println("Thương x + y = " + div);

        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ "+e.getMessage());
        }
    }
}
