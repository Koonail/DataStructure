package com.koonail.structures.stack;

/**
 * @Author: WEN KANG
 * @Description: 链式栈（通过链表实现栈）
 * @Time : 2018/6/20 14:31
 */
public class LinkedStack {
    /** 链表节点*/
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    /** 栈顶节点,为空时栈为空*/
    private Node top = null;
    /** 栈中元素个数*/
    private int size;

    /**
     * 入栈
     * @param value
     */
    public void push(int value){

    }
}
