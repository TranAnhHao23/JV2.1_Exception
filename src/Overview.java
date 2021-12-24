import java.awt.*;

public class Overview {
    public static void main(String[] args) {
        // 3 exception in Java
        // 1. Error : lỗi hệ thống, hay lỗi phần cứng, tiêu biểu nhất là StackOverFlow
//        Test.recursivePrint(1);
//    }
//
//    public static void recursivePrint(int num) {
//        System.out.println("Number: " + num);
//
//        if (num == 0)
//            return;
//        else
//            recursivePrint(++num);
        // 2. Checked Exception :  các lỗi tron lúc code, phải sửa thì chương trình mới chạy được

        // 3. Unchecked Exception :  -> runtime Exception, lỗi khi chạy, thường thì có các lỗi như sau
        // ArithmeticException
        System.out.println("----------------");
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        System.out.println("Finish");

        // NullPointerException
        System.out.println("----------------");
        try {
            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException e) {
            System.err.println(e);
        }
        System.out.println("Finish");

        // NumberFormatException
        System.out.println("----------------");
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        System.out.println("Finish");

        // ArrayIndexOutOfBoundsException
        System.out.println("----------------");
        try {
            int[] arr = new int[5];
            arr[5] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        System.out.println("Finish");

        // ClassCastException
        System.out.println("----------------");
        try {
            Object dog = new Dog();
            Rectangle rectangle = (Rectangle) dog;
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("Finally ahihi");
        }
        System.out.println("Finish");


        // Lưu ý: dùng final làm từ khóa cuối cùng để exception, tránh phát sinh lỗi
        // Không thì làm mẹ cái exception xem lỗi gì thì ghi vào
        // catch từ nhỏ đến to


    }
}
