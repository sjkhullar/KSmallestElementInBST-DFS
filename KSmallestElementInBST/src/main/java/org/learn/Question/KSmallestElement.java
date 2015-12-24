
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class KSmallestElement {
	public static Node kSmallestElement(Node root, int k, int[] iElement) {
		if(null == root) {
			return root;
		}
		
		Node left = kSmallestElement(root.left, k, iElement );
		if(null != left) {
			return left;
		}
		
		iElement[0] ++;
		if(iElement[0] == k) {
			return root; 
		}
		return kSmallestElement(root.right,k, iElement);
	}
	
}
