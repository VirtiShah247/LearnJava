import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class BufferFile {
    public static void main(String[] args) throws IOException {
        File f = new File("a34.txt");
        FileWriter fw = new FileWriter(f,true);
        // BufferedWriter bf=new BufferedWriter(fw);
        // bf.newLine();
        // bf.write("Hey! GM");
        // bf.write("\n");
        // bf.write("Hey! GM");
        // bf.flush();
        
        // System.out.println(br.readLine());
        // System.out.println(br.read());
        // bf.close();
        InputStreamReader is=new InputStreamReader(System.in);
        FileReader fr= new FileReader(f);
        BufferedReader br=new BufferedReader(is);
        br.readLine();
        String i=br.readLine();
        System.out.println(i);
        // while ((i=br.readLine())!=null) {
        //     System.out.println(i);
        //     // i=br.readLine();
        // }
    }
}
