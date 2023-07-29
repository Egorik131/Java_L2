package sem_2;

public class Test_2 implements INumeric {
    int start;
    int val;

    public Test_2() {
        start = 0;
        val = 0;
    }

    @Override
    public void reset() {
        start = 100;
        val = 100;
    }

    @Override
    public int getNext() {
        val += 10;
        return val;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
