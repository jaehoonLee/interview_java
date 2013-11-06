package com.interview.ds;

/**
 * Created with IntelliJ IDEA.
 * User: leejaehoon
 * Date: 13. 11. 2.
 * Time: 오전 12:27
 * To change this template use File | Settings | File Templates.
 */
public class Stack {

    //TODO:Use Node
    //TODO:Use Static Array

    public Node lastNode;
    public Object Node[];

    public Stack()
    {
        lastNode = null;
        Node = new Object[10];
    }

    public void push(Object data)
    {
        if(lastNode == null)
        {
            lastNode = new Node(data);
            lastNode.next = null;
        }
        else
        {
            Node newLastNode = new Node(data);
            newLastNode.next = lastNode;
            lastNode = newLastNode;
        }
    }

    public Object pop()
    {
        if(lastNode == null)
        {
            return null;
        }
        else
        {
            Node popNode = lastNode;
            lastNode = lastNode.next;
            return popNode.data;
        }
    }

    public int size()
    {
        int size = 0;
        Node firstNode = lastNode;
        while(firstNode != null)
        {
            firstNode = firstNode.next;
            size++;
        }

        return size;
    }
}
