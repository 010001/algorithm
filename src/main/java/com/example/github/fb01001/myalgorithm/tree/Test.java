package com.example.github.fb01001.myalgorithm.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TreeNode node01 = new TreeNode("01","01");
        TreeNode node02 = new TreeNode("02","02");
        TreeNode node03 = new TreeNode("03","03");
        TreeNode node04 = new TreeNode("04","04");
        TreeNode node05 = new TreeNode("05","05");
        TreeNode node06 = new TreeNode("06","06");
        TreeNode node07 = new TreeNode("07","07");
        TreeNode node08 = new TreeNode("08","08");
        TreeNode node09 = new TreeNode("09","09");
        TreeNode node10 = new TreeNode("10","10");
        List<TreeNode> childrenNodes01 = new ArrayList<TreeNode>();
        List<TreeNode> childrenNodes02 = new ArrayList<TreeNode>();
        List<TreeNode> childrenNodes03 = new ArrayList<TreeNode>();
        List<TreeNode> childrenNodes04 = new ArrayList<TreeNode>();
        childrenNodes01.add(node02);
        childrenNodes01.add(node03);
        childrenNodes01.add(node04);
        childrenNodes02.add(node05);
        childrenNodes02.add(node06);
        childrenNodes03.add(node07);
        childrenNodes03.add(node08);
        childrenNodes04.add(node09);
        childrenNodes04.add(node10);
        node01.setChildrenNodes(childrenNodes01);
        node02.setChildrenNodes(childrenNodes02);
        node03.setChildrenNodes(childrenNodes03);
        node04.setChildrenNodes(childrenNodes04);
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        nodes.add(node01);
        TreeNode resNode = getNodeByName(nodes,"08");
        System.out.println(resNode.getNodeId());
    }


    /**
     * 根据节点名称获取叶子节点
     * @param nodes
     * @param nodeName
     * @return
     */
    public static TreeNode getNodeByName(List<TreeNode> nodes,String nodeName){
        TreeNode resultNode = null;
        if(null != nodes){
            for(TreeNode node : nodes){
                if(null == node.getChildrenNodes()  && node.getNodeName().equals(nodeName)){
                    resultNode = node;
                    break;
                } else {
                    resultNode = getNodeByName(node.getChildrenNodes(),nodeName);
                }
                if(null != resultNode){
                    break;
                }
            }
        }
        return resultNode;
    }
}
