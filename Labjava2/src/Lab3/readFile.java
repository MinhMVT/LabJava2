package Lab3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public readFile(String file) {
    }

    public static String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {

            content.append(line).append("\n");
        }

        reader.close();

        return content.toString();
    }
}