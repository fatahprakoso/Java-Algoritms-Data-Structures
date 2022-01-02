/**
 * This interface represents Queue data structure. A Queue popping the data
 * using FIFO (First In First Out) or LILO (Last In Last Out) algorithm.
 *
 * @interface
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

// change to generic model soon
public interface Queue {

    boolean isEmpty();

    void enqueue(Object o);

    Object dequeue();

    Object peek();

    int size();
}
