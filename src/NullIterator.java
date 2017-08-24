import java.util.Iterator;

/*
Created by ChrisChan on 2017/8/24.
*/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
