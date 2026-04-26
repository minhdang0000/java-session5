import java.util.Random;
import java.util.Scanner;

public class Gioi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài chuỗi n (1 <= n <= 1000): ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n >= 1 && n <= 1000) {
                String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                StringBuilder sb = new StringBuilder(n);
                Random random = new Random();

                for (int i = 0; i < n; i++) {
                    sb.append(charPool.charAt(random.nextInt(charPool.length())));
                }

                System.out.println("Kết quả: \"" + sb.toString() + "\"");
            } else {
                System.out.println("Lỗi: Vui lòng nhập n trong khoảng từ 1 đến 1000.");
            }
        } else {
            System.out.println("Lỗi: Dữ liệu đầu vào phải là số nguyên.");
        }

        scanner.close();
    }
}