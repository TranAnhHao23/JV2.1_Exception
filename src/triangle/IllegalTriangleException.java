package triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            int a = sc.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = sc.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = sc.nextInt();
            illegalTriangle(a, b, c);
        } catch (InputMismatchException e) {
            System.err.println("Lỗi định dạng");
        } catch (IllegalException e) {
            System.err.println(e);
        }
    }

    public static void illegalTriangle(int a, int b, int c) throws IllegalException {
        if (a > 0 && b > 0 && c > 0 && (a + b > c && b + c > a && c + a > b)) {
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            throw new IllegalException();
        }
    }

    private static class IllegalException extends Exception {

    }

}
