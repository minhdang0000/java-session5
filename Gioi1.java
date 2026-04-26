import java.util.Scanner;

public class Gioi1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mật khẩu cần kiểm tra: ");
        String password = scanner.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        scanner.close();
    }
}

