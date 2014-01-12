package harjassi.unixtools;

public class RemoveSpaces {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("File Not Given");
            return;
        }
        try{
            String content = "";
            String data;
            FileOperations operation = new FileOperations();
            content = operation.readFile(args[0]);
            RemoveSpace removeSpace = new RemoveSpace();
            data = removeSpace.RemoveExtraSpaces(content);
            operation.writeFile(args[1], data);
            System.out.println("Operation Done");
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

