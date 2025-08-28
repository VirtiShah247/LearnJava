// random access file creates.
// it supports special pointer name as file pointer
// the file pointer can be move by using seek
// int 4 bytes, float 4, double 8, short 2, char 2,  

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomFile {
    public static void main(String[] args) throws Exception {
        File f = new File("a36.txt");
        RandomAccessFile rf = new RandomAccessFile(f,"rw");
        // String s = "abcdef";
        // rf.write(s.getBytes());
        // System.out.println(rf.read());
        // rf.seek(3);
        // System.out.println(rf.read());
        // int i=rf.read();
        // System.out.println(i);
        rf.writeChar('A');
        rf.writeInt(222);
        rf.writeDouble(222.0);
        rf.seek(0);
        System.out.println(rf.readChar());
        System.out.println(rf.readInt());
        rf.close();


    }
}
