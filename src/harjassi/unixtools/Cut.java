package harjassi.unixtools;


public class Cut {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
            return;
        }
        try{
            String content = "";
            String data;
            String[] output = new String[0];
            FileOperations operation = new FileOperations();
            content = operation.readFile(args[0]);
        }
        catch (Exception exp){
             System.out.println("Something Went Wrong");
        }
    }
}
