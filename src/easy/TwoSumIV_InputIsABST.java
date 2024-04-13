package easy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoSumIV_InputIsABST {
    List<Integer> list = new ArrayList<>();
    HashSet<Integer> seen = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        dfs(root);

        for(int i : list){
            if(seen.contains(i)){
                return true;
            }
            seen.add(k - i);
        }
        return false;
    }

    // 2 3 4 5 6 7

    private void dfs(TreeNode node){
        if(node == null){
            return;
        }

        dfs(node.left);

        list.add(node.val);
        dfs(node.right);
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

