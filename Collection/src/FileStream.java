import java.io.*;

public class FileStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fw=new FileOutputStream("ola.txt");
        fw.write(65);
        
        // fw.write(62);
        System.out.println();
        // fw.close();
        fw.write(68);
        FileInputStream fi = new FileInputStream("ola.txt");
        // fi.read();
        // System.out.println(fi.read());
        // System.out.println(fi.read());
        // System.out.println(fi.read()); // -1
        int i = fi.read();
        System.out.println((char) i);
        int i1 = fi.read();
        System.out.println((char) i);
        String s = "hello world";
        byte[] b = s.getBytes();
        fw.write(b);
        System.out.println(fi.readAllBytes());
        System.out.println(fi.readNBytes(10));
        FileOutputStream fw1=new FileOutputStream("abc.csv");
        // fw1.write(65);
        FileInputStream fi2 = new FileInputStream("abc.csv");
        System.out.println(fi2.read());

    }
}
// create def.txt and write string hello, hi in def.txt file with helpof java fileoutput string and read the data using fileinputstring
