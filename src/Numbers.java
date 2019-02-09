public class Numbers implements Comparable{

    private int number;

    //This is going to be a random number read from the file
    public Numbers(int number){
        this.number=number;
    }

    //Returns the number
    public int getNumber(){
        return this.number;
    }



    //CompareTo() -> Comparable Interfacet implementation
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

    //Usted to return the number in a string form
    @Override
    public String toString() {
        return " " + this.number;
    }
}

