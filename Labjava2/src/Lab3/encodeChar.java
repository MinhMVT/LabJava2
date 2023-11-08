package Lab3;



public class encodeChar {
    public static char encodeChar(char c) {

        if (Character.isLowerCase(c)) {
            return (char) ((c - 'a' + 3) % 26 + 'a');
        } else if (Character.isUpperCase(c)) {
            return (char) ((c - 'A' + 3) % 26 + 'A');
        } else if (Character.isDigit(c)) {
            return (char) ((c - '0' + 3) % 10 + '0');
        } else {
            return c;
        }
    }
}