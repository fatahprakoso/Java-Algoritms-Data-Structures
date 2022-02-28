/**
 * This is List Interface for list data structure. This data structure stored
 * data in an ordered manner.
 *
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

public interface List<T> {

    boolean isEmpty();

    int size();

    void addFirst(T dataNode);

    void addLast(T dataNode);

    void insertBefore(T dataNode, int index);

    void insertAfter(T dataNode, int indexKey);

    void replace(T dataNode, T key);

    void replace(T dataNode, int indexKey);

    void removeHead();

    void removeTail();

    void removeFirstSearchedData(T key);

    void removeLastSearchedData(T key);

    void removeAllSearchedData(T key);

    void remove(int indexKey);

    T getData(int index);
}
