package harjassi.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tail {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
            return;
        }
        try{
            int linesToPrint = 10;
            if(args[1]!= null){
                if(args[1].charAt(0) == '-'){
                    linesToPrint = Integer.parseInt(args[1].substring(1,args[1].length()));
                }
            }
            String content = "";
            String lines;
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while((lines = br.readLine()) != null) {
                content = content+"\n"+lines;
            }
            int i;
            int length = content.split("\n").length;
            for(i = linesToPrint; i < length; i++)
                System.out.println(content.split("\n")[i]);
        }
        catch(Exception exp){
            System.out.println("Something Went Wrong");
        }
    }
}
