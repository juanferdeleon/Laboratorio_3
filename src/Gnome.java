import java.lang.reflect.Array;
import java.util.ArrayList;

/***
 * Universidad del Valle de Guatemala
 * Estructuras de Datos
 * Ing. Douglas Barrios
 * @author Amado Garcia 181460 / Juan Fernando De Leon Quezada 17822
 * E-Reference: Bailey(2007) Java Structures. This code was taken fromn this book
 */
public class Gnome {

    public  static void gnomeSort(Comparable[] infoArray){

        for (int i = 1; i < infoArray.length;){

            if (infoArray[i-1].compareTo(infoArray[i]) <= 0){
                ++i;
            } else {

                Comparable tempValue = infoArray[i];
                infoArray[i] = infoArray[i -1];
                infoArray[i -1] = tempValue;
                --i;

                if (i == 0){
                    i = 1;
                }


            }
        }
    }

}
