import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class FileReadr {
    public static void main(String[] args)throws IOException {
        int i;
        FileReader fil = new FileReader(args[0]);
        while ((i=fil.read()) != -1){
            System.out.print((char)i);
        }
    fil.close();
    }
}