import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        List list = new List();
        List sortedList = new List();
        QuickSort qSort = new QuickSort();
       WriteFile("./numeros.txt");
       list = ReadFile("./numeros.txt");
       qSort.sort(list, 0,  list.size() - 1);
       sortedList = qSort.SortedList();
        for (int i = 0; i < sortedList.size() ; i++) {
            System.out.println(sortedList.Pop(i));
        }





    }

    public static List ReadFile(String fileName){

        List infoArray =  new List();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            int i = 0;
            while (line != null){
                infoArray.Push(i, Integer.parseInt(line));
                line = bufferedReader.readLine();
            }
        } catch (Exception var10) {
            System.out.println("Error al leer");
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
