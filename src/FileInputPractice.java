import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputPractice {
    public static void main(String[] args) {
        Scanner infile;

        try{
        //infile=new Scanner(new File("C:/Users/Shubham/IdeaProjects/Chapter8_Project/input.txt"));
            infile=new Scanner(new File("input.txt"));
        int input,sum=0;
        while (infile.hasNext())
        {
            input=infile.nextInt();
            System.out.println(input);
            sum += input;
        }
            System.out.println("Sum is: "+sum);
        infile.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Can't find file");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Input mismatched!!!");
            ime.printStackTrace();
        }
    }
}
