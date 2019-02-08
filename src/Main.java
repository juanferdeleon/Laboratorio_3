import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        int[] numbers =  {100, 1, 30, 90, 55};
        Radix.radixsort(numbers, 5);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }

   }





    public static int[] ReadFile(String fileName){

        int[] infoArray =  new int[300];

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            int i = 0;
            while (line != null){
                infoArray[i] =  Integer.parseInt(line);
                line = bufferedReader.readLine();
                i++;
            }
        } catch (Exception var10) {
            System.out.println(var10);
        }
        return infoArray;
    }

    public static void WriteFile(String fileName){
            try{

                File fout = new File(fileName);
                FileOutputStream fos = new FileOutputStream(fout);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

                Random generator = new Random();

                for (int i = 0; i <= 300; i++) {
                    int num = generator.nextInt(3000); //generate a random number
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
