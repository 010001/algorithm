package com.example.github.fb01001.myalgorithm.tree;

import lombok.Data;
import sun.reflect.generics.tree.Tree;

import java.util.List;

@Data
public class TreeNode {
    private String parentId;
    private TreeNode parentNode;
    private List<TreeNode> childrenNodes;
    private String nodeId;
    private String nodeName;

    public TreeNode(){

    }

    public TreeNode(String nodeId,String nodeName){
        this.nodeId = nodeId;
        this.nodeName = nodeName;
    }
}
