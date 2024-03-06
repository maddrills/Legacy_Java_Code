package fileHandel1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIn {

    private File fob;
    public FileIn(String path) {
        fob = new File(path);
        //must perform a search till all the files are listed out
    }
    //path H:\src
    public FileIn() {
        //default path
        this("E:\\Documents");
    }
    //return the result
    public void returnResult() {
        listing(listOfFiles(), 0);
    }


    //list out
    private File[] listOfFiles() {
        //
        File[] filesa = fob.listFiles();
        //while()
        return filesa;
    }


    //perform a recursive listing
    private void listing(File aar[], int i) {
        if(aar.length == i){
            return;
        }
        //print only .txt files
        if(aar[i].isFile() && (aar[i].getName().endsWith(".txt"))){
            System.out.println(aar[i].getName());
            try{
            System.out.println(fileContent(aar[i].getAbsolutePath()));
            System.out.println();
            }catch (IOException e){};
        }
        listing(aar,i + 1);
    }

    //print file content
    private String fileContent(String name)throws IOException{
        String content = "";
        FileInputStream bitsStreem = null;
        try{
            bitsStreem = new FileInputStream(name);
            int c;
            while((c =bitsStreem.read()) != -1) {
                content += ((char)c);
            }
        }catch (Exception e){}
        finally {
            if(bitsStreem != null){
            bitsStreem.close();
            }
        }
        return content;
    }
}
