public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch){

    }

    @Override
    public char get() {
        return 0;
    }
}
