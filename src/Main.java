import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Numbers[] numbers = ReadFile("../numeros.txt");

       Radix.bucketPass(numbers, numbers.length);

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }

   }

    public static Numbers[] ReadFile(String fileName){

        ArrayList infoArray =  new ArrayList();
        Numbers[] numbers;
        int i = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null){
                infoArray.add(i, Integer.parseInt((line)));
                line = bufferedReader.readLine();
                i++;
            }
        } catch (Exception var10) {
            System.out.println(var10);
        }

        numbers = new Numbers[i];

        for (int j = 0; j <= i; j++){
            numbers[i] = (Numbers)infoArray.get(i);
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
