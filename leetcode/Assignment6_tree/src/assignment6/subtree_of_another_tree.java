package assignment6;
public class subtree_of_another_tree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return helper(s, t);
    }
    
    private boolean helper(TreeNode s, TreeNode t) {
        if (s == null) return false;
        return equals(s, t) || helper(s.left, t) || helper(s.right, t);
    }
    
    private boolean equals(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if ((s == null && t != null) ||(s != null && t == null)) return false;
        if (s.val == t.val) {
            return equals(s.left, t.left) && equals(s.right, t.right);
        }
        return false;
    }  
}
