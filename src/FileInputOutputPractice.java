import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileInputOutputPractice {
    public static void main(String[] args) {
        Scanner name;
        Scanner age;
        PrintWriter pw;
        try
        {
            name=new Scanner(new File("StudentName.txt"));
            age=new Scanner(new File("studentage.txt"));
            pw=new PrintWriter("name_age.txt");

            String tempName;
            int tempAge;
            while(name.hasNext() && age.hasNext())
            {
                tempName=name.nextLine();
                tempAge=age.nextInt();
                pw.println(tempName+" is "+tempAge+" years old.");
            }

            pw.close();
            name.close();
            age.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
