public class IQDemo {
    class FixedQueue implements ICharQ {
        private char q[];
        private int putloc, getloc;

        public FixedQueue(int size){
            q = new char[size];
            putloc = getloc = 0;
        }

        public void put(char ch) {
            if(putloc == q.length) {
                System.out.println("the queue is full");
                return;
            }
            q[putloc++] = ch;
        }

        public char get() {
            if (getloc == putloc) {
                System.out.println("Queue is not full");
                return (char) 0;
            }
            return q[getloc++];
        }
    }
}
