package Tutorial7;

import java.io.*;

class ClassFile {
    public static void main(String[] args) throws IOException {
        File fp = new File(args[0]);
        File fr = new File("File.text");
        if (fp.exists()) {
            System.out.println("The File "+fp.getName()+" exists.!");
        } else {
            if (fp.createNewFile())
                System.out.println("A new File "+fp.getName()+" has been created.! ");
            else {
            }
        }
        System.out.println("The Absolute path of the file is: "+fp.getAbsolutePath());
        System.out.println("The path of the file is: "+fp.getPath());
        System.out.println("Is the filename a directory: "+fp.isDirectory());
        System.out.println("Renaming the file: "+fp.renameTo(fr));
    }
}