package Tutorial7;

import java.io.*;
class ToLowerCse {
    public static void main(String[] args) throws IOException {
        char ch;
        FileReader fil = new FileReader(args[0]);
        while ((ch = (char) fil.read()) != -1) {
            if (Character.isUpperCase(ch)) {
                Character.toLowerCase(ch);
            }  System.out.print(ch);
        }
        fil.close();
    }
}