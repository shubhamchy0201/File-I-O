import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project2_Circle {
    public static void main(String[] args) {
        ArrayList<Circle> circleArrayList=new ArrayList<>();

        fillArrayList(circleArrayList);
        printCircle(circleArrayList);
    }

    private static void fillArrayList(ArrayList<Circle> circleArrayList) {
        Scanner infile;
        try
        {
            infile=new Scanner(new File("circleData.txt"));
            double radius;
            Circle temp;
            while(infile.hasNext())
            {
                radius=infile.nextDouble();

                temp=new Circle(radius);
                circleArrayList.add(temp);
            }
            infile.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void printCircle(ArrayList<Circle> circleArrayList) {
        PrintWriter pw;
        try
        {
            pw=new PrintWriter("circleOutput.txt");
            for(Circle c:circleArrayList)
            {
                System.out.println("Radiue is: "+c.getRadius());
                System.out.println("Area is: "+c.area());
                System.out.format("Circumference is: %.2f",c.circumference());
                System.out.println();

                //For saving data into file(circleOutput.txt)
                pw.println("Radiue is: "+c.getRadius());
               pw.format("Area is: %.2f",c.area());
                pw.format("Circumference is: %.2f",c.circumference());
                pw.println();
            }
            pw.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
