package Step4;
//
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class ReadFour
{
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try{

            Scanner fileIn = new Scanner(new File("/Users/Nigel/Projects/FileIOJava/src/main/java/src/main/java/Step4/input.txt"));
            PrintWriter fileOut = new PrintWriter(("/Users/Nigel/Projects/FileIOJava/src/main/java/src/main/java/Step4/output.txt"));
            while(fileIn.hasNext())
            {
                String lineIn = fileIn.nextLine();
                System.out.println(lineIn);
                fileOut.println(lineIn);
            }
            fileOut.flush();
            fileOut.close();



            // Print out a running total of all the
            // values in the input file.
        }catch (IOException e) {
            System.out.println("File not found");
        }



    }}