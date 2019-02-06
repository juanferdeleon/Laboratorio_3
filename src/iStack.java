/*
UNIVERSIDAD DEL VALLE DE GUATEMALA
AMADO GARCIA
RENATO ESTRADA
 */

public interface iStack<E>  {
    /**
     * Adds a new item in the stack
     * @param item Generic
     */
    public void push(E item);
    // pre:
    // post: item is added to stack
    // will be popped next if no intervening push

    /**
     * Pulls out a item from the stack
     * @return Generic
     */
    public E pop();
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned

    public E peek();
    // pre: stack is not empty
    // post: top value (next to be popped) is returned

    /**
     * Verifies if the stack is empty or not
     * @return boolean
     *
    public boolean empty();
    // post: returns true if and only if the stack is empty

    /**
     * Gets the size of the stack
     * @return Integer
     */
    public int size();
    // post: returns the number of elements in the stack
}
