package com.koonail.structures.linked;

import java.util.List;

/**
 * @Description:自定义链表实现
 * @author: WEN KANG
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
     * 获取指定节点的值
     * @param index
     * @return
     */
    public Node getNode(int index){
        // 越界判断
        if (index > length()){
            try {
                throw new Exception("越界！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
     * 修改指定节点值
     * @param index
     * @param newData 新的值
     * @return
     */
    public  boolean setNode(int index, int newData){
        // 如果给出的下标超出链表长度，则抛出越界异常
        if (index > length()){
            try {
                throw new Exception("越界！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int curIndex = 1;
        Node curNode = head;
        while (curNode != null){
            if (index == curIndex){
                curNode.data = newData;
                return true;
            }
            curIndex ++;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 删除指定节点
     * @param index
     * @return
     */
    public boolean deleteNode(int index){
        // 越界判断
        if (index > length()){
            try {
                throw new Exception("越界！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int cruIndex = 1;
        Node preNode = null;
        Node curNode = head;
        Node nextNode = curNode.next;
        while (curNode != null){
            if (index == cruIndex){
                // 只剩一个节点
                if (nextNode == null) {
                    curNode = null;
                    return true;
                } else if (index == 1){
                    // 如果需要删除头节点
                    head = head.next;
                    return true;
                }
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            cruIndex ++;
        }
        return false;
    }

    /**
     * 链表反转
     */
    public void reverseLinked()
    {
        Node preNode = null;
        Node curNode = head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            // 当前节点为最后一节点时，反转完毕
            if (nextNode == null){
                head = curNode;
            }
            // 当前节点指向原上一节点
            curNode.next = preNode;
            // 对于下一节点来说，当前节点就是原上一节点
            preNode = curNode;
            // 当前节点往后移动
            curNode = nextNode;
        }
    }

    /**
     * 获取链表的中间节点
     * 采用快慢指针的方式，快指针一次走两步，慢指针一次走一步，当快指针走到末尾时，满指针刚好走到中间
     * @return
     */
    public Node getMidNode()
    {
        Node fastPointer = head;
        Node slowPointer = head;
        // 至少需要三个节点才能体现出中间节点
        while (fastPointer != null && fastPointer.next != null && fastPointer.next.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    /**
     * 获取链表的倒数第index个节点
     * 还是采用双指针的方式，让指针q先移动index，然后再让p和q一起移动，当q移动到末尾时，p则是倒数第index个节点
     * @param index
     * @return
     */
    public Node getReciprocalNode(int index)
    {
        // 判断越界
        if (index > length()){
            try {
                throw new Exception("越界！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Node q = head;
        Node p = head;
        // 让q先移动index
        for (int i = 0;i < index;i++){
            q = q.next;
        }
        while (q != null){
            q = q.next;
            p = p.next;
        }
        return p;
    }

    /**
     * 链表排序
     * 采用冒泡排序，不用改变节点位置，交换节点的值就行
     */
    public void sort(){
        Node curNode = head;
        int tempData = 0;
        while (curNode.next != null){
            Node nextNode = curNode.next;
            while (nextNode != null){
                if (curNode.data > nextNode.data){
                    tempData = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tempData;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 去除链表中的重复节点
     */
    public void uniq()
    {
        Node curNode = head;
        while (curNode != null){
            Node temp = curNode;
            while (temp.next != null){
                Node nextNode = temp.next;
                if (curNode.data == nextNode.data){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 递归倒序输出链表
     */
    public List<Integer> reversePrint(Node head,List<Integer> rs){
        if (head != null){
            reversePrint(head.next,rs);
            //System.out.print(head.data + " ");
            rs.add(head.data);
            return rs;
        }
        return rs;
    }

    /**
     * 获取链表的长度
     * @return
     */
    public int length(){
        // 链表为空，返回0
        if (head == null){
            return 0;
        }
        // 加上头节点
        int length = 1;
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
            length ++;
        }
        return length;
    }

    /**
     * 以数组的形式打印链表所有节点的值
     * @return
     */
    public void printLinked()
    {
        if (head == null){
            return;
        }
        Node curNode = head;
        System.out.print("当前链表为：");
        while(curNode != null)
        {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
