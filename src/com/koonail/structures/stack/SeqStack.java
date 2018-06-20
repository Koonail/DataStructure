package com.koonail.structures.stack;

/**
 * @Author: WEN KANG
 * @Description: 顺序栈
 * @Time : 2018/6/20 11:51
 */
public class SeqStack {
    /** 栈顶指针，-1代表空栈*/
    private int top = -1;
    /** 栈的容量,默认为10*/
    private int cap = 10;
    /** 用于存放栈中的值*/
    private int[] array;
    /** 栈中元素的个数*/
    private int size;
    public SeqStack(int cap){
        this.cap = cap;
        array = new int[cap];
    }

    public SeqStack(){
        array = new int[cap];
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        int index = ++top;
        if (index >= cap){
            System.out.println("栈溢出！");
            return;
        }
        array[index] = value;
        size ++;
    }

    /**
     * 出栈
     * @return
     */
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("栈已为空！");
        }
        size --;
        return array[top--];
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        if (-1 == top){
            return true;
        }
        return false;
    }

    /** 返回栈中元素的个数*/
    public int size(){
        return size;
    }
}
