import java.util.ArrayList;

/**
 * This is Tree Interface. This interface has some methods that will apply to
 * tree data structure. Tree data structure is a collection of nodes that are
 * formed hierarchically
 *
 * @interface
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

interface Tree <T extends Comparable<? super T>>{

    int size();

    boolean isEmpty();

    int height();

    int max();

    int min();

    void insert(T input);

    boolean isExist(T key);

    boolean delete(T key);

    T parentOf(T key);

    int degreeOf(T key);

    T getRoot();

    ArrayList<T> getLeafs();

    ArrayList<T> getChildrenOf(T key);

    ArrayList<T> getSiblingsOf(T key);

    ArrayList<T> getAancestorOf(T key);

    ArrayList<T> getDescendantOf(T key);

    void display();

    void preorder();

    void inorder();

    void postorder();

    void levelorder();
}