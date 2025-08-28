// byte stream deals with only 8 bits. Only int and char is allowed
// char stream deals with full byte. All data type is allowed
// output stream deals with write
// input stream deals with read

import java.util.*;
import java.io.*;
public class File1 {
    public static void main(String[] args) throws Exception{
       File f = new File("abc.csv"); 
       System.out.println(f.exists());
       if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       }

    //    File f1 = new File("A1/as","abc.csv");
    //    f1.createNewFile();
    // //    f1.mkdir();
    //    File f2 = new File("hi.csv");
    //    f2.mkdir();
    // // folder->folder
    // File f3 = new File("A2", "def.csv");// error The system cannot find the path specified
    // f3.createNewFile();
    File f4 = new File("hello");
    f4.mkdir();
    File f5 = new File("hello", "ola");
    f5.mkdir();
    File f6 = new File("hello", "ola.txt");
    f6.createNewFile();
    File f7 = new File("A1", "ola.txt");// error The system cannot find the path specified
    f7.createNewFile(); 
    File f8 = new File(f5, "ola.txt");
    f8.createNewFile();
    System.out.println(f8.getPath());
    System.out.println(f4.getPath());
    System.out.println(f4.getAbsolutePath());
    System.out.println(f8.getAbsolutePath());
    System.out.println(f4.getParent());
    System.out.println(f5.getParent());
    System.out.println(f8.getParent());
    // getName
    System.out.println(f4.getName());
    System.out.println(f5.getName());
    System.out.println(f8.getName());
    // isFile
    System.out.println(f4.isFile());
    System.out.println(f5.isFile());
    System.out.println(f8.isFile());
    // canRead
    System.out.println(f4.canRead());
    System.out.println(f5.canRead());
    System.out.println(f8.canRead());
    // canWrite
    System.out.println();
    System.out.println(f4.canWrite());
    System.out.println(f5.canWrite());
    System.out.println(f8.canWrite());
    // canExecute
    System.out.println();
    System.out.println(f4.canExecute());
    System.out.println(f5.canExecute());
    System.out.println(f8.canExecute());
    //equals
    File f10 = new File(f5,"ola.txt");
    f10.createNewFile();
    File f11 = new File(f5,"ola1.txt");
    f11.createNewFile();
    System.out.println();
    System.out.println(f5.equals(f8));
    System.out.println(f5.equals(f4));
    System.out.println(f7.equals(f8));
    System.out.println((f10).equals(f11));
    System.out.println((f10.getParent()).equals(f11.getParent())); // true
    System.out.println((f5.getParent()).equals(f6.getParent())); // true
    //    length
    System.out.println();
    System.out.println(f10.length());
    System.out.println(f11.length());
    //int i=f10.length();//Type mismatch: cannot convert from long to int
    System.out.println();
    File [] ff=f4.listFiles();
    for (File g : ff) {
        System.out.println(g);
    }
    String[] ff1=f4.list();
    for (String g : ff1) {
        System.out.println(g);
    }
    System.out.println(ff1.length);
    }
}
