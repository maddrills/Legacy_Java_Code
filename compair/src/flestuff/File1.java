package flestuff;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class File1 {
    static File file = null;
    public static void main(String[] args){
        try{
            file = new File("H:\\src\\ samplez.txt");
            if(file.createNewFile()){
                System.out.println("file created :" + file.getName());
            }
            else {
                System.out.println("file already there");
                writeToAFile();
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    static void writeToAFile() throws IOException{
        String wire = "this is just something on the fly";
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("H:\\src\\ samplez.txt");
            out.write(wire.getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e){
            System.out.println("wrong");
        }
        finally {
            out.close();
        }
    }
    static void instead() throws IOException{

    }

}
