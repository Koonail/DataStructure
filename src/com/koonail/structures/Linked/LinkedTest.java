package com.koonail.structures.Linked;

public class LinkedTest {
    public static void main(String[] args) {
        MyLinked myLinked = new MyLinked();
        myLinked.addNode(1);
        myLinked.addNode(2);
        // 获得头节点的值
        System.out.println(myLinked.getHead().data);
        // 获得指定节点的值
        System.out.println(myLinked.getNode(2).data);
    }
}
