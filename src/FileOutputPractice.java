import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutputPractice {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Shubham");
        names.add("abc");
        names.add("ahjvg");
        names.add("ldrohe");
        try{
            PrintWriter pw=new PrintWriter("output.txt");
            pw.println("Hello everyone");
            pw.println("Nothing");
            for(String name:names)
                pw.println(name);
            pw.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Couldn't write to the file");
            System.out.println(ex.getMessage());
        }
    }
}
