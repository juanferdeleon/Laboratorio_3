import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gnome {

    public ArrayList<Integer> gnomeSort(ArrayList<Integer> infoArray){

        for (int i = 1; i < infoArray.size();){

            if (infoArray.get(i - 1) <= infoArray.get(i))
                ++i;

            else {

                int tempValue = infoArray.get(i);
                infoArray.set(i, infoArray.get(i -1));
                infoArray.set(i -1, tempValue);
                --i;

                if (i == 0)
                    i = 1;

            }
        }
        return infoArray;
    }

}
