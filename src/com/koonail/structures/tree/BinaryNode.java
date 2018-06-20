package com.koonail.structures.tree;

/**
 * 节点类
 */
public class BinaryNode {
    /** 节点值*/
    int data;
    /** 左子节点*/
    BinaryNode left;
    /** 右子节点*/
    BinaryNode right;
    public BinaryNode(int data){
        this(data,null,null);
    }

    public BinaryNode(int data,BinaryNode lt,BinaryNode rt){
        data = data;
        left = lt;
        right = rt;
    }
}
