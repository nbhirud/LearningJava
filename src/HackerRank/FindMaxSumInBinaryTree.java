/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author nbhirud
 */
public class FindMaxSumInBinaryTree {
    
    public static void main(String[] args) {
        //String in = "1 2 3 # # 4 # # 5";
        //String in = "3 2 3 # 3 # 1";
        String in = "3 4 5 1 1 # 1";
        long op = findMax(6, in);
        
    }
    
    static long findMax(int n, String tree) {
        
        //converts string tree representation to an actual tree
        class Node {
            public int data = -1;
            public Node right = null;
            public Node left = null;
            Node(int d) {
                this.data = d;
//                this.right = r;
//                this.left = l;
            }
            
        }
        
        String[] nums = tree.split(" ");
//        int parent, child;
//        parent = 0;
//        child = 1;
        Node root = new Node(Integer.parseInt(nums[0]));
        Node currentParent = root;
        for(int parent = 0, child = 1; child < nums.length; parent++) {
            
            if(nums[parent] == "#") {
                continue;
            }
            else {
                //setting the left child
                if(nums[child] == "#") {
                    
                }
                else {
                    currentParent.left = new Node(Integer.parseInt(nums[child]));
                    
                }
                
                //setting the right child
                child++;
                if(nums[child] == "#") {
                    
                }
                else {
                    currentParent.right = new Node(Integer.parseInt(nums[child]));
                }
                    
            }
            
        }
                
              
        
        
        
        
        
        
        
        
        
        
        return 0;
    }
    

    
}
