/**
 * This is List Interface for list data structure. This data structure stored
 * data in an ordered manner.
 *
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

 // change to generic model soon
public interface List {

    boolean isEmpty();

    int size();

    void addFirst(Object dataNode);

    void addLast(Object dataNode);

    void addBefore(Object dataNode, Object key);

    void addBefore(Object dataNode, int index);

    void addAfter(Object dataNode, Object key);

    void addAfter(Object dataNode, int indexKey);

    void replace(Object dataNode, Object key);

    void replace(Object dataNode, int indexKey);

    void removeFirst();

    void removeLast();

    void remove(Object key);

    void remove(int indexKey);

    Object getData(int index);
}
