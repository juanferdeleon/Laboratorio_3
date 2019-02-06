import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){

<<<<<<< HEAD
        WriteFile();
        ReadFile();

        QuickSort q = new QuickSort();
        q.Sorting(null, 0,0);


=======
        WriteFile("./numeros.txt");
>>>>>>> cb5500afce51910b2cb33966080fc7b95211fe5d
    }

    public static void ReadFile(){

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
