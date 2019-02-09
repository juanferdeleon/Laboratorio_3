public class Numbers implements Comparable{

    private int number;

    public Numbers(int number){
        this.number=number;
    }

    public int getNumber(){
        return this.number;
    }



    @Override
    public int compareTo(Object o) {
        int result = 0 ;
        int otherNumber = ((Numbers) o).getNumber();


        if(this.number == otherNumber){
            result = 0;
        }if(this.number < otherNumber){
            result = -1;
        }if(this.number > otherNumber){
            result = 1;
        }

        return result;
    }

    @Override
    public String toString() {
        return " " + this.number;
    }
}

