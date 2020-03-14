import java.util.*;
import java.lang.*;

public class StackListBased {
    String top;
    int items = 0; // numbers of items
    LinkedList<String> list; // a linkedlist of strings names list

    public StackListBased() {
    }

    public void createStack() {
        list = new LinkedList<String> (); // create news stack using list
    }

    public void popAll () {
        list.removeAll(list);
        top = "";
        items = 0;
        // no need for stack exception
    }

    public boolean isEmpty () {
        return list.isEmpty();
    }

    public void push (String newItem) {
        list.add(0, newItem); // add new item at position 0
        top = newItem;
        items++;
        // last in, first out
    }

    public String pop () throws RuntimeException{
        if (!list.isEmpty()){
            String holder = list.get(0); // temporarily stores value at position 0
            if (list.size()>1){ // check if list is bigger than one, or else when popped, top becomes null
                top = list.get(1);
            } else {
                top = null;
            }
            list.remove(0); // remove at position 0
            items--;
            return holder;
        } else {
            throw new RuntimeException("stack is empty, exception thrown");
        }
    }

    public String peek () throws RuntimeException {
        if (!list.isEmpty()) {
            return list.get(0); // returns string at position 0
        } else {
            throw new RuntimeException("stack is empty, exception thrown");
        }
    }
}