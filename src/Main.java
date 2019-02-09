import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        WriteFile("./Numbers.txt");
        Comparable[] numbers = ReadFile("./Numbers.txt");


        Merge.mergeSort(numbers, 3000);
        for (int i = 0; i <  numbers.length; i++) {
            System.out.println("{ " +numbers[i] + " }" );
        }
    }

    public static Comparable[] ReadFile(String fileName) {

        Comparable[] numbers = new Numbers[3000];
        int i = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                line = bufferedReader.readLine();
                int number = Integer.parseInt((line));
                numbers[i] = new Numbers(number);
                i++;
            }
        } catch (Exception var10) {
            System.out.println(var10);
        }


            return numbers;

    }


    public static void WriteFile(String fileName){
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