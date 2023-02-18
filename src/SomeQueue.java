import java.util.Iterator;
import java.util.LinkedList;

public class SomeQueue {
    private LinkedList<Object> list;
    SomeQueue(){
        list = new LinkedList<>();


    }

    boolean empty() {
        return list.isEmpty();
    }

    void enqueue(Object ob) {
        list.addLast(ob);
    }

    Object dequeue() {
        if (!empty()) {
            return list.removeFirst();
        }
        return null;
    }

    Object first() {
        if (!empty()){
            return list.get(0);
        }
        return  null;
    }

    public String toString(){
        return list.toString();
    }

    public void add(Object ob) {
        list.add(ob);
    }


}
