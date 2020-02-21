import org.graalvm.compiler.graph.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyProject {
    String name;

    public MyProject(String name) {
        this.name = name;
    }

    public String Hello() {
        return ("Hello" + name);

    }

    public static String CheckNumber(int number) {
        String message;
        if (number % 2 == 0) {
            message = number + " is an even number";
        } else {
            message = number + " is an odd number";
        }
        return message;
    }

    public static void Square(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("#");

            }
            System.out.print("\n");
        }

    }

    public static void Triangle(int number) {

        for (int x = 1; x <= number; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(" #");
            }

                System.out.println(" ");
            }

           }


    public static void IsoscelesTriangle(int number) {
        for (int i = 1; i <= number; i++) {

            // loop to print the number of spaces before the star
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }

            // for new line after printing each row
            System.out.println();
        }

    }
    public static void LongestString()
    {
        ArrayList<String> Str = new ArrayList<String>();
        Str.add("The");
        Str.add("Quick");
        Str.add("Brown");
        Str.add("Fox");
        Str.add("Ate");
        Str.add("My");
        Str.add("Chicken");
        int largestString = Str.get(0).length();
        int index = 0;

        for(int i = 0; i < Str.size(); i++)
        {
            if(Str.get(i).length() > largestString)
            {
                largestString = Str.get(i).length();
                index = i;
            }
        }
        System.out.println("Index " + index + " "+ Str.get(index) + " " + "is the largest and is size " + largestString);
    }
    public  static void CombineArrays( ) {

        ArrayList<Integer> array1 = new ArrayList();
        ArrayList<Integer> array2 = new ArrayList();
        ArrayList<Integer> array3 = new ArrayList();
        array1.add(4);
        array1.add(2);
        array1.add(8);
        array1.add(9);
        array1.add(3);

        array2.add(1);
        array2.add(8);
        array2.add(3);
        array2.add(0);
        array2.add(3);

        for(int z=0;z<array2.size();z++)
        {

            array3.add(array1.get(z));
            array3.add(array2.get(z));


        }
        System.out.println(array3);

    }



    public  static void arrayWords() {
        String[] words = {"write", "good ", "code ", "every","day  "};
        System.out.println("*******");
        for (String x : words)
        {

           System.out.println("* " + x + "*");

        }
        System.out.println("*******");
    }






        public static void main(String [] args)

        {
            MyProject project = new MyProject("hello");
            project.name = " Tebogo ";
            System.out.println(project.Hello());


            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            int numbers = in.nextInt();

            System.out.println(CheckNumber(numbers));

            Square(2);
            Triangle(2);
            IsoscelesTriangle(4);
            LongestString();
            CombineArrays();
            arrayWords();



        }
    }

