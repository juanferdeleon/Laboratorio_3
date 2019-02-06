import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        WriteFile("./numeros.txt");
    }

    public static void ReadFile(){
        byte var1 = 10;
        int[] var2 = new int[var1];

        try {
            FileReader var4 = new FileReader("./numeros.txt");
            BufferedReader var5 = new BufferedReader(var4);

            String var3;
            for(int var6 = 0; (var3 = var5.readLine()) != null; ++var6) {
                int var7 = Integer.parseInt(var3);
                var2[var6] = var7;
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
