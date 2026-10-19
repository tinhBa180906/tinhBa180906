/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public TreeNode balanceBST(TreeNode root) {
        //step2: sort the array
        List<Integer> avl = copyAndSort(root);
        
        //step3: clear the tree
        
        
        //Step 4: Call balance() mathod to rebuild the tree
        return balance(avl, 0, avl.size() - 1);
    }
    
    public void inOrder(TreeNode p, List<Integer> list) {
        if (p == null) {
            return;
        }
        inOrder(p.left, list);

        list.add(p.val);
        inOrder(p.right, list);
    }
    
    public List<Integer> copyAndSort(TreeNode p) {
        List<Integer> result = new ArrayList<>();
        inOrder(p, result);
        return result;
    }
    
    
    
    public TreeNode balance(List<Integer> data, int first, int last) {
    // Điều kiện dừng: nếu khoảng không hợp lệ, trả về null
    if (first > last) {
        return null;
    }

    // Lấy phần tử ở giữa làm gốc (root) cho cây hoặc cây con hiện tại
    int mid = first + (last - first) / 2;
    TreeNode root = new TreeNode(data.get(mid));

    // Đệ quy xây dựng cây con bên trái và bên phải
    root.left = balance(data, first, mid - 1);
    root.right = balance(data, mid + 1, last);

    // Trả về node root của cây con hiện tại
    return root;
}
}