import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        WriteFile("./numeros.txt");
        ReadFile();

//        QuickSort q = new QuickSort();
//        q.Sorting(null, 0,0);
    }

    public static void ReadFile(){

        ArrayList<Integer> infoArray = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("./numeros.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                infoArray.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }
        } catch (Exception var10) {
            System.out.println("Error al leer");
        }
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
