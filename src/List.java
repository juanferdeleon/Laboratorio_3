import java.util.ArrayList;

public class List<E> implements Comparable<List<E>>{

    ArrayList<Integer> value;
    int x, y;

    public List(E value)
    {
        this.value = new ArrayList<>();
    }

    public int compareTo(List<E> a){
        return a.value.get(x).compareTo(y);
    }



    public int  getX(int index)
    {
        return value.get(index);
    }

    public int  getY(int index){
        return value.get(index);
    }

}


