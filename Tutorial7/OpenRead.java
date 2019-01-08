package Tutorial7;

import java.io.FileInputStream;
import java.io.IOException;

class OpenRead {
    public static void main(String[] args)throws IOException {
        int i;
        FileInputStream fil = new FileInputStream("A.md");
        while ((i=fil.read()) != -1){
            System.out.print((char)i);
        }
    fil.close();
    }
}