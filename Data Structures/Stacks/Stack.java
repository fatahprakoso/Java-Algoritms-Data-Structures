/**
 * This interface represents Stack data structure. A stack popping the data
 * using LIFO (Last In First Out) or FILO (First In Last Out) algorithm.
 *
 * @interface
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

// change to generic model soon
public interface Stack {

    boolean isEmpty();

    int size();

    void push(Object o);

    Object pop();

    Object peek();
}
