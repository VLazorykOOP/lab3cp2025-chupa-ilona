import java.util.ArrayList;
import java.util.Iterator;

public class AdultPersonIterator implements Iterator<Person> {
    private final ArrayList<Person> list;
    private int index = 0;

    public AdultPersonIterator(ArrayList<Person> list) {
        this.list = list;
        moveToNextAdult(); // одразу перейти до першого дорослого
    }

    private void moveToNextAdult() {
        while (index < list.size() && list.get(index).getAge() <= 18) {
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Person next() {
        Person person = list.get(index);
        index++;
        moveToNextAdult();
        return person;
    }
}
