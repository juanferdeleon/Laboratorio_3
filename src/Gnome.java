import java.lang.reflect.Array;
import java.util.ArrayList;

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
