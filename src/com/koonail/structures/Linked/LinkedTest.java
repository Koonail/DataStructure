package com.koonail.structures.Linked;

public class LinkedTest {
    public static void main(String[] args) {
        MyLinked myLinked = new MyLinked();
        myLinked.addNode(1);
        myLinked.addNode(3);
        myLinked.addNode(2);
        myLinked.addNode(5);
        myLinked.addNode(4);
        myLinked.printLinked();
        // 获得链表的长度
        System.out.println("链表长度为：" + myLinked.length());
        // 获得头节点的值
        System.out.println("链表头节点的值为：" + myLinked.getHead().data);
        // 获得指定节点的值
        int index = 2;
        System.out.println("链表第" + index + "个节点的值为" + myLinked.getNode(index).data);
        // 修改指定节点的值
        // myLinked.setNode(index,4);
        //System.out.println("链表第" + index + "个节点的值为" + myLinked.getNode(index).data);
        // 删除指定节点
        //myLinked.deleteNode(3);


        // 常用链表操作
        // 链表反转
        //myLinked.reverseLinked();
        // 获得链表的中间节点
        System.out.println("链表的中间节点为：" + myLinked.getMidNode().data);
        // 获得链表的倒数第二个节点
        System.out.println("链表的倒数第二个节点为：" + myLinked.getReciprocalNode(2).data);
        // 链表排序
        myLinked.sort();
        // 删除链表中的重复元素
        myLinked.uniq();
        // 倒序打印当前链表
        System.out.print("当前链表的倒序输出为：");
        myLinked.reversePrint(myLinked.getHead());
        System.out.println();
        // 打印当前链表
        myLinked.printLinked();
    }
}
