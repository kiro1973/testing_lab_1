public class Watermelon {
    public boolean isEven(int weight){
        if (weight<1 || weight>100 )
            throw new IllegalArgumentException("number must be between 0 and 100");
        if (weight%2 == 0)
            return true;
        else
            return false;
    }

}
