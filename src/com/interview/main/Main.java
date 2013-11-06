package com.interview.main;

import com.interview.ds.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: leejaehoon
 * Date: 13. 11. 2.
 * Time: 오전 12:23
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[])
    {
        Stack stack = new Stack();
        stack.push("Hi");
        stack.push("Hello");
        stack.push("Why");

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());

        return;
    }
}
