package Lab3;


import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        try {
            // Tạo một đối tượng Scanner để nhập liệu từ bàn phím
            Scanner scanner = new Scanner(System.in);
            // Nhập đường dẫn của thư mục từ bàn phím
            System.out.print("Enter the path of the directory: ");
            String path = scanner.nextLine();
            // Gọi hàm để liệt kê tất cả các tập tin và thư mục con trong thư mục
            new listFilesAndFolders(path);
        } catch (Exception e) {
            // In thông báo lỗi nếu có
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[]args){

    }
}