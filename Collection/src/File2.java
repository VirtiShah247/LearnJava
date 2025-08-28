import java.io.*;
public class File2 {
    public static void main(String[] args) throws IOException {
        // FileWriter fw=new FileWriter("a31.txt", true);
        // fw.write(65);
        // fw.write("hedeh\n");
        // fw.append("hello\n");
        // char[] c = {'a', 'b', 'c','\n','\n'};
        // fw.write(c);
        // // fw.close();
        
        // fw.flush();
        // // fw.close();
        // // char[] c = {'a', 'b', 'c','\n'}
        // fw.write(c);
        // fw.flush();

        // FileWriter fw1=new FileWriter("a32.txt", true);
        // fw1.write(65);
        // fw1.write("hedeh\n");
        // fw1.append("hello world\n");
        // char[] c1 = {'a', 'b', 'c','\n','\n'};
        // fw1.write(c1);
        // // fw.close();
        
        // fw1.flush();
        // // fw.close();
        // // char[] c = {'a', 'b', 'c','\n'}
        // fw1.write(c);
        // fw1.flush();
        // FileReader fi = new FileReader("a31.txt");
        // while(fi.read()!=-1){
        //     System.out.println((char)fi.read());
        // }
        FileWriter fw2=new FileWriter("a32.txt", false);
        FileWriter fw3=new FileWriter("a33.txt", true);
        // fw2.write(65);
        fw2.write("Bam\n");
        fw2.flush();
        FileReader fi1 = new FileReader("a32.txt");
        // char i = (char) fi1.read();
        // do {
        //     i = (char) fi1.read();
        //     System.out.println(i);
        // } while (i!=-1);
        while(fi1.read()!=-1){
            // System.out.println((char)fi1.read());
            // fw3.append((char)fi1.read());
            System.out.println((char)fi1.read());
        }
        fw3.close();

        // fw.write(); // 
    }
}
// replace word1 by word2 from file1 and write to file2
