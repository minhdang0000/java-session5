import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi email can kiem tra: ");
        String email = sc.nextLine();
        String cleanEmail = email.trim();
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
        if (cleanEmail.matches(emailRegex)) {
            System.out.println("Email hợp lệ");
        }else{
            System.out.println("Email không hợp lệ");
        }
    }
}
