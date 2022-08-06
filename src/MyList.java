import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void MyListTest(int capacity) {

    }

    public void add(int index, E element) {
        if (size >= elements.length) {
            ensureCapacity(15);
        }
        System.arraycopy(elements, index, elements, index + 1, elements.length - index - 1);
        elements[index] = element;
        size++;
    }

    E remove(int index) {
        E temp = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public void ensureCapacity(int minCapacity) {

        Object[] elemens2 = new Object[elements.length + minCapacity];
        System.arraycopy(elements, 0, elemens2, 0, size);
        elements = elemens2;


    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> elementClone = new MyList<>();
        System.arraycopy(elements, 0, elementClone.elements, 0, size);
        return elementClone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        add(e);
        return true;
    }

    public Object get(int i) {
        if (0 <= i && i < size) {
            return elements[i];
        }
        return null;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }

}