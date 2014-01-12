package harjassi.unixtools;

import java.io.*;

public class FileOperations {
    public String readFile(String fileName){
        String current_line = null;
        String data="";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((current_line = reader.readLine()) != null) {
                data = data + current_line+"\n";
            }
        }
        catch(Exception exp){
            System.out.println("Something Went Wrong in Reading File");
        }
        return data.substring(0,data.length()-1);
    }

    public void writeFile(String fileName,String data){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            String[]  temp = data.split("\n");
            for(String line : temp)
                writer.println(line);
            writer.close();
        }
        catch(Exception exp){
            System.out.println("Something Went Wrong in Writing File");
        }
    }
}
