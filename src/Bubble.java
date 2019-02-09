import java.lang.reflect.Array;
import java.util.ArrayList;

/***
 * Universidad del Valle de Guatemala
 * Estructuras de Datos
 * Ing. Douglas Barrios
 * @author Amado Garcia 181460 / Juan Fernando De Leon Quezada 17822
 * E-Reference:
 */
public class Bubble {


    public static void bubbleSort(Comparable[] infoArray)
    {
        int n = infoArray.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (infoArray[j].compareTo(infoArray[j + 1]) == 1)
                {
                    // swap temp and arr[i]
                    Comparable tempValue = infoArray[j];
                    infoArray[j] = infoArray[j + 1];
                    infoArray[j + 1] = tempValue;
                }
            }
        }
    }

}
