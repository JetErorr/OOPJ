package Tutorial7;

import java.io.*;

class FileCpy{
    public static void main(String[] args) throws IOException {
        // File f = new File(args[0]);
        int i;
        FileInputStream fin = new FileInputStream(args[0]);
        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(args[1]));
        while((i=bin.read())!=-1){
            bos.write((char)i);
        }
        System.out.println("File content copied.!");
        bin.close();
        bos.close();
    }
}