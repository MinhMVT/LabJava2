package Lab3;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class listFilesAndFolders {
    public listFilesAndFolders(String path) {
    }

    public static void listFilesAndFolders(String path) {
        // Khởi tạo một đối tượng File để đại diện cho thư mục
        File folder = new File(path);
        // Kiểm tra xem thư mục có tồn tại và có thể đọc được không
        if (folder.exists() && folder.canRead()) {
            // Lấy danh sách các tập tin và thư mục con trong thư mục
            File[] files = folder.listFiles();
            // In đường dẫn của thư mục
            System.out.println("Directory of " + path);
            // Duyệt qua từng tập tin và thư mục con
            for (File file : files) {
                // Lấy thông tin về kích thước, ngày sửa đổi, tên của tập tin hoặc thư mục
                long size = file.length();
                Date date = new Date(file.lastModified());
                String name = file.getName();
                // Định dạng ngày sửa đổi theo định dạng dd/MM/yyyy hh:mm a
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
                String formattedDate = sdf.format(date);
                // Kiểm tra xem tập tin hay thư mục là ẩn hay không
                String hidden = file.isHidden() ? "<HIDDEN>" : "";
                // Kiểm tra xem tập tin hay thư mục là chỉ đọc hay không
                String readOnly = file.canWrite() ? "" : "<READONLY>";
                // In thông tin ra màn hình theo định dạng: kích thước - ngày sửa đổi - tên - thuộc tính
                System.out.printf("%10d - %s - %s %s %s%n", size, formattedDate, name, hidden, readOnly);
            }
        } else {
            // In thông báo lỗi nếu thư mục không tồn tại hoặc không thể đọc được
            System.out.println("The directory does not exist or cannot be read.");
        }
    }
}