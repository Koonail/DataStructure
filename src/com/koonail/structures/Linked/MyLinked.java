package com.koonail.structures.Linked;

/**
 * @Description:自定义链表实现
 * @author WEN KANG
 * @time 2018年4月13日 星期五
 */
public class MyLinked {
    /** 定义头结点*/
    private Node head = null;

    /** 定义节点*/
    class Node{
        // 指向下一节点
        Node next = null;
        // 当前节点的值
        int data;
        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * 新增节点
     * @param data
     */
    public void addNode(int data)
    {
        // 生成一个节点
        Node newNode = new Node(data);
        // 判断头节点是否为空，如果为空，直接给头节点赋值
        if (head == null){
            head = newNode;
        } else{
            // 不为空，则将头节点移动至下一节点
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    /**
     * 获取指定下标的节点的值
     * @param index
     * @return
     */
    public Node getNode(int index){
        // 如果头节点为空，则链表为空，返回空值
        if (head == null){
            return null;
        }
        // 头节点不为空
        int curIndex = 1;
        Node curNode = head;
        while(curNode != null){
            if (curIndex == index){
                return curNode;
            }
            curIndex ++;
            curNode = curNode.next;
        }
        return null;
    }

    /**
     * 修改指定下标的节点值
     * @param index
     * @return
     */
    public  boolean setNode(int index){
        return false;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
