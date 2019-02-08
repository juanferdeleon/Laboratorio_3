
public class Gnome {

    public int[] gnomeSort(int[] infoArray){

        for (int i = 1; i <= infoArray.length;){

            if (infoArray[i - 1] <= infoArray[i])
                ++i;

            else {

                int tempValue = infoArray[i];
                infoArray[i] = infoArray[i - 1];
                infoArray[i - 1] = tempValue;
                --i;

                if (i == 0)
                    i = 1;

            }
        }
        for (int i = 0; i < 300 ; i++) {
            System.out.println(infoArray[i]);
        }
        return infoArray;
    }

}
