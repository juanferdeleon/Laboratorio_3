import java.util.ArrayList;

public class List<E> implements Comparable<List<E>>{

    private ArrayList<Integer> value;
    private int x, y;

    public List(){

        this.value = new ArrayList<>();
    }

    public int compareTo(List<E> o){
        return o.value.get(x).compareTo(o.value.get(y));
    }


    public void Push(int index, int value){
        this.value.add(index, value);
    }

    public int Pop(int index){

        return value.get(index);
    }

    public void Set(int index, int value){
        this.value.set(index, value);
    }

    public int size(){
        return value.size();
    }
}


