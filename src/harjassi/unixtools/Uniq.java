package harjassi.unixtools;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Uniq {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
            return;
        }
        try{
            String content = "";
            String lines;
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while((lines = br.readLine()) != null) {
                content = content+"\n"+lines;
            }
            int length = content.split("\n").length;
            int i;
            for(i = 0; i < length-1; i++){
                if(!content.split("\n")[i].equals(content.split("\n")[i + 1])){
                    System.out.println(content.split("\n")[i]);
                }
            }
        }
        catch(Exception exp){
            System.out.println("Something Went Wrong");
        }
    }

}