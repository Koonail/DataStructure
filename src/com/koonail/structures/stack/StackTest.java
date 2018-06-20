package com.koonail.structures.stack;

import java.util.Stack;

/**
 * @Author: WEN KANG
 * @Description:栈测试类
 * @Time : 2018/6/20 14:09
 */
public class StackTest {
    public static void main(String[] args) {
        SeqStack seqStack = new SeqStack();
        System.out.println(seqStack.size());
        seqStack.push(1);
        seqStack.push(2);
        seqStack.push(3);
        System.out.println(seqStack.size());
        while (!seqStack.isEmpty()){
            try {
                System.out.println(seqStack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
