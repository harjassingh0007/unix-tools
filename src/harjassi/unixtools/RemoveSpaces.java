package harjassi.unixtools;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
            return;
        }
        try{
            String content = "";
            String data;
            String[] output = new String[0];
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            content = new readFile().getContent(br);
            RemoveSpace removeSpace = new RemoveSpace();
            data = removeSpace.RemoveExtraSpaces(content);
            System.out.println(data);
        }
        catch (Exception exp){
            System.out.println("Something Went Wrong");
        }
    }
}

class RemoveSpace{
    String RemoveExtraSpaces(String data){
        String output;
        output = data.replaceAll("\\ +", " ");
        return output;
    }
}

