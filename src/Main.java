import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

       Numbers[] numbers = new Numbers[4];
       numbers[0] = new Numbers(20);
       numbers[1] = new Numbers(200);
       numbers[2] = new Numbers(45);
       numbers[3] = new Numbers(20);

       Radix.bucketPass(numbers, 4);

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }

   }

    public static ArrayList ReadFile(String fileName){

        ArrayList infoArray =  new ArrayList();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            int i = 0;
            while (line != null){
                infoArray.add(i, Integer.parseInt((line)));
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

                for (int i = 0; i <= 3000; i++) {
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
