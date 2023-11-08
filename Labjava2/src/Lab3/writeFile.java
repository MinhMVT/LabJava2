package Lab3;



// Hàm main để thực hiện chương trình


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void writeFile(String fileName, String content) throws IOException {
        // Khởi tạo một đối tượng BufferedWriter để ghi file
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        // Ghi nội dung vào file
        writer.write(content);
        // Đóng file
        writer.close();
    }

    public void main(String[] args) {
        try {

            String input = new readFile("input.txt").toString();

            String output = toString(input);

            writeFile("output.txt", output);

            System.out.println("File đã được mã hóa thành công!");
        } catch (IOException e) {

            System.out.println("Lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String toString(String input) {

        return input;
    }


}