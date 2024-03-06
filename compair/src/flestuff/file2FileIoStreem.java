package flestuff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file2FileIoStreem {
    static FileInputStream in = null;
    static FileOutputStream out = null;
    public static void main(String[] args) throws IOException{
        try{
           in = new FileInputStream("H:\\src\\ samplez.txt");
           out = new FileOutputStream("H:\\src\\ op.txt");
           int c;
           while( (c= in.read()) != -1){
               System.out.print((char)(c));
               out.write(c);
           }
        } catch(IOException e){}
        finally {
            if(in != null){
                in.close();
            }
        }
    }
}
