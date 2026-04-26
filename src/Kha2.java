public class Kha2 {
    public static void main(String[] args) {
        int iterations = 100000;

        long startTimeString = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World";
        }
        long endTimeString = System.currentTimeMillis();
        long timeString = endTimeString - startTimeString;

        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World");
        }
        long endTimeBuilder = System.currentTimeMillis();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(" World");
        }
        long endTimeBuffer = System.currentTimeMillis();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("Thời gian thực hiện với String: " + timeString + " ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + timeBuilder + " ms");
        System.out.println("Thời gian thực hiện với StringBuffer: " + timeBuffer + " ms");

        System.out.println("Nhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}
