import java.util.HashMap;

/**
 * This is Linked List data structure. This data structure storing data using
 * linked node. One node will linked to another node and so on (except tail
 * node). Node has 2 properties, that are stored data and pointer for next node.
 * The value of tail node's pointer is always null.
 *
 * @author Fatah Prakoso, fatahap27@gmail.com
 */

public class LinkedList<T> implements List<T> {

  public static void main(String[] args) {
    LinkedList<String> sll = new LinkedList<>();
    sll.addFirst("1");
    sll.addFirst("2");
    sll.addFirst("3");
    sll.addFirst("4");
    sll.addLast("wer");
    sll.removeHead();
    sll.removeTail();
    sll.remove(1);
    sll.remove(1);
    sll.remove(0);
    sll.removeHead();

    for (int i = 0; i < sll.size(); i++) {
      System.out.print(sll.getData(i));

      if (i != sll.size() - 1)
        System.out.print(", ");
      else
        System.out.print("\n");
    }

    System.out.printf("size: %d\n", sll.size());
  }

  /**
   * Head is node that located on the front of list
   */
  private Node<T> head;

  /**
   * Number of existing nodes on list
   */
  private int size;

  /**
   * Node is container of list's data
   */
  class Node<U> {
    /**
     * Data stored on node
     */
    T data;

    /**
     * Pointer refer to next node
     */
    Node<U> pointer;

    Node(T data, Node<U> pointer) {
      this.data = data;
      this.pointer = pointer;
    }
  }

  /**
   * Check whether the list's node empty or not
   *
   * @return {@code true} if list is empty or size equals to zero, otherwise
   *         {@code false}
   */
  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  /**
   * Get size of the list
   *
   * @return size of the list
   */
  @Override
  public int size() {
    return this.size;
  }

  private boolean isIndexSafe(int index) {
    return index >= 0 && index < size;
  }

  /**
   * Get the last of list's node
   *
   * @return tail node or the last of list's node
   */
  private Node<T> tail() {
    Node<T> buffer = head;
    for (int i = 0; i < size - 1; i++) {
      buffer = buffer.pointer;
    }

    return buffer;
  }

  /**
   * Get specific node by index. Index starts from 0 (index 0 is head node).
   *
   * @param index a number that specific node location
   * @return the specific node by index
   */
  private Node<T> getNode(int index) {
    if (isIndexSafe(index)) {
      Node<T> buff = head;
      for (int i = 0; i < index; i++) {
        buff = buff.pointer;
      }
      return buff;
    }

    return null;
  }

  /**
   * Get specific node by searched data within the node.
   *
   * @param searchedData data that will be searched
   * @return HashMap<index number, searched node> by searched data
   */
  private HashMap<Integer, Node<T>> getNodes(T searchedData) {
    HashMap<Integer, Node<T>> nodes = new HashMap<>();

    Node<T> buffer = head;
    for (int i = 0; i < this.size; i++) {
      if (buffer.data.equals(searchedData)) {
        nodes.put(i, buffer);
      }
    }

    return nodes;
  }

  /**
   * Add head or insert head node with the new one
   *
   * @param dataNode a node that will by inserted as a head node
   */
  @Override
  public void addFirst(T dataNode) {
    if (this.head == null) {
      this.head = new Node<T>(dataNode, null);
      System.out.println("Head has been added");
    } else {
      Node<T> newHead = new Node<T>(dataNode, this.head);
      this.head = newHead;
      System.out.println("New head has been added");
    }
    size++;
  }

  /**
   * Add tail or insert tail node with the new one
   *
   * @param dataNode a node that will by inserted as a tail node
   */
  @Override
  public void addLast(T dataNode) {
    if (tail() == null) {
      head = new Node<T>(dataNode, null);
      System.out.println("Head or tail has been added");
    } else {
      tail().pointer = new Node<T>(dataNode, null);
      System.out.println("New tail has been added");
    }
    size++;
  }

  @Override
  public void insertBefore(T dataNode, int index) {
    // TODO Auto-generated method stub

  }

  @Override
  public void insertAfter(T dataNode, int indexKey) {
    // TODO Auto-generated method stub

  }

  @Override
  public void replace(T dataNode, T key) {
    // TODO Auto-generated method stub

  }

  @Override
  public void replace(T dataNode, int indexKey) {
    // TODO Auto-generated method stub

  }

  /**
   * Remove head node and set new head node
   */
  @Override
  public void removeHead() {
    if (size() == 0) {
      System.out.println("This list doesn't has any node");
      return;
    } else if (size() == 1) {
      this.head = null;
      System.out.println("A node has been removed. This list has been emptied");
    } else {
      this.head = this.head.pointer;
      System.out.println("Current head node has been removed");
    }

    size--;
  }

  /**
   * Remove tail node
   */
  @Override
  public void removeTail() {
    if (size() == 0) {
      System.out.println("This list doesn't has any node");
      return;
    } else if (size() == 1) {
      this.head = null;
      System.out.println("A node has been removed. This list has been emptied");
    } else {
      Node<T> buffer = this.head;
      for (int i = 0; i < this.size - 2; i++) {
        buffer = buffer.pointer;
      }
      buffer.pointer = null;
      System.out.println("Current tail node has been removed");
    }

    size--;
  }

  @Override
  public void removeFirstSearchedData(T key) {

  }

  @Override
  public void removeLastSearchedData(T key) {

  }

  @Override
  public void removeAllSearchedData(T key) {

  }

  @Override
  public void remove(int indexKey) {
    if (!isIndexSafe(indexKey)) {
      System.err.println("Index out of bound!");
      return;
    } else if (indexKey == size - 1) {
      removeTail();
      return;
    } else if (indexKey == 0) {
      removeHead();
      return;
    } else {
      Node<T> buffer = getNode(indexKey - 1);
      buffer.pointer = buffer.pointer.pointer;

      System.out.printf("Node %d has been removed\n", indexKey);
    }

    size--;
  }

  @Override
  public T getData(int index) {
    return getNode(index).data;
  }

}