package Lab3;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirCommand {
    public static void main(String[] args) {
        // Nhập đường dẫn của thư mục từ bàn phím
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập đường dẫn của thư mục:");
        String directoryPath = scanner.nextLine();
        scanner.close();

        // Tạo một đối tượng File
        File directory = new File(directoryPath);

        // Kiểm tra xem thư mục có tồn tại không
        if (!directory.exists()) {
            System.out.println("Thư mục không tồn tại.");
            return;
        }

        // Liệt kê tất cả các tập tin và thư mục con
        File[] files = directory.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        for (File file : files) {
            System.out.println(file.getName());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last modified: " + sdf.format(file.lastModified()));
            System.out.println("------------------------");
        }
    }
}