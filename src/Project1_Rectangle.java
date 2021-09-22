import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project1_Rectangle {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleArrayList;
        rectangleArrayList=new ArrayList<>();
        
        fillArrayList(rectangleArrayList);
        printRectangles(rectangleArrayList);
    }

    private static void fillArrayList(ArrayList<Rectangle> rectangleArrayList) {
   Scanner infile;
   try
   {
    infile=new Scanner(new File("rectdata.txt"));
    double length;
    double width;
    Rectangle temp;
    while(infile.hasNext())
    {
        length=infile.nextDouble();
        width=infile.nextDouble();
        temp=new Rectangle(length,width);
        rectangleArrayList.add(temp);
    }
    infile.close();
   }
   catch (FileNotFoundException ex)
   {
       System.out.println(ex.getMessage());
   }
    }

    private static void printRectangles(ArrayList<Rectangle> rectangleArrayList) {
    for(Rectangle r:rectangleArrayList)
    {
        System.out.println("Length :"+r.getLength());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.getArea());
        System.out.println();
    }
    }
}
