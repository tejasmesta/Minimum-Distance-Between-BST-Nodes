class Solution {
    List<Integer> list = new ArrayList<>();
    
    public int minDiffInBST(TreeNode root)
    {
        inorder(root);
        
        if(list.size()==1)
        {
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        
        int s = list.size();
        
        for(int i=1;i<s;i++)
        {
            min = Math.min(min,list.get(i)-list.get(i-1));
        }
        
        return min;
    }
    
    void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
