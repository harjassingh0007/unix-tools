package harjassi.unixtools;

        import java.io.BufferedReader;
        import java.io.FileReader;

public class WC {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
        }
        try{
            String content = "";
            String lines;
            int words, total_lines, characters;
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while((lines = br.readLine()) != null) {
                content = content+"\n"+lines;
            }
            total_lines = content.split("\n").length -2;
            words = content.split(" ").length;
            characters = content.split("").length;
            System.out.println("\t"+total_lines+"\t"+words+"\t"+characters+" "+args[0]);
        }
        catch(Exception exp){
            System.out.println("Something went Wrong");
        }
    }
}