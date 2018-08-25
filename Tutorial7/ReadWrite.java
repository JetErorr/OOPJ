import java.io.*;

class ReadWrite {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo = new FileOutputStream("A.md");
        for (int i = 65; i < 101; i++) {
            fo.write((char)i);
        }
        // fo.close();
    }
}