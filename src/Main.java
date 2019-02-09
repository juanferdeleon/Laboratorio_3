import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/***
 * Universidad del Valle de Guatemala
 * Estructuras de Datos
 * Ing. Douglas Barrios
 * @author Amado Garcia 181460 / Juan Fernando De Leon Quezada 17822
 */
public class Main {
    public static void main(String[] args){
        Scanner readLine = new Scanner(System.in);
        while (true) {
            WriteFile("./Numbers.txt");
            Comparable[] numbers = ReadFile("./Numbers.txt");

            System.out.println("Select the Sort: ");
            System.out.println(MainMenu());
            String option = readLine.nextLine();
            switch (option) {
                case "1":
                    Gnome.gnomeSort(numbers);

                    break;
                case "2":
                    Merge.mergeSort(numbers, numbers.length);
                    break;
                case "3":
                    QuickSort.quickSort(numbers, numbers.length);
                    break;
                case "4":
                    Radix.bucketPass(numbers, numbers.length);
                    break;
                case "5":
                    Bubble.bubbleSort(numbers);
                    break;
                default:
                    System.out.println("Bye");
                    return;
            }
            for (int i = 0; i < numbers.length ; i++) {
                System.out.println("[" + (i + 1) + "]" + numbers[i]);
            }
        }

    }


    /**
     * Method used to Read the .txt file in the requested location
     * @param fileName Valid Path for .txt file
     * @return Comparable array
     */
    public static Comparable[] ReadFile(String fileName)
            //pre: A valid File Path
            //Post: A non null Comparable Array
    {


        Comparable[] numbers = new Numbers[3000];
        int i = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine().trim();

            while (line != null) {
                line = bufferedReader.readLine();
                int number = Integer.parseInt((line));
                numbers[i] = new Numbers(number);
                i++;
            }
        } catch (Exception var10) {

        }

            return numbers;

    }

    /**
     * Mein Menu Method
     * @return A String with the Main Menu
     */
    public static String MainMenu(){
        return
                "1. Gnome Sort\n" +
                "2. Merge Sort\n" +
                "3. Quick Sort\n" +
                "4. Radix Sort\n" +
                "5. Bubble Sort\n" +
                "Pres any other button to exit" ;
    }


    /**
     * Creates or writes 3000 random numbers from 0 to 3000 in a .txt file
     * @param fileName A String path where the .txt is.
     */
    public static void WriteFile(String fileName)
    //Pre: A valid File Path
    {
        try{

            File fout = new File(fileName);
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            Random generator = new Random();

            for (int i = 0; i <= 3000; i++) {
                int num = generator.nextInt(3001); //generate a random number
                bw.write("" + num ); //write the number to the file
                bw.newLine();
            }

            bw.close();

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}