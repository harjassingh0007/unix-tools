package harjassi.unixtools;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
        }
        try{
            String content = "";
            String[] output = new String[0];
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            content = new readFile().getContent(br);
            if(args.length < 2){
                output = content.split("\n");
                Arrays.sort(output);
            }
            int i;
            for(i = 0; i < output.length; i++){
                System.out.println(output[i]);
            }
        }
        catch(Exception exp){
            System.out.println("Something Went Wrong");
        }
    }
}

class readFile{
    String getContent(BufferedReader br){
        String lines = "", content = "";
        try {
            while((lines = br.readLine()) != null) {
                content = content+"\n"+lines;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
