package harjassi.unixtools;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
        }
        try{
            String content = "";
            String[] output = new String[0];
            FileOperations operation = new FileOperations();
            content = operation.readFile(args[0]);
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