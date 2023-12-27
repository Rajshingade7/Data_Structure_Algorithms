package Tree;

/*
 * public class Tree_Example { DNode root; void createtree() { root=null; }
 * 
 * void insert(DNode r,DNode n)//r:root n:new node { if(root==null) root=n; else
 * { if(n.data<r.data) { if(r.left==null) r.left=n; else
 * 
 * insert(r.left,n); } else { if(r.right==null) r.right=n; else
 * insert(r.right,n); } } } void inorder(DNode r) { if(r!=null) {
 * 
 * inorder(r.left);//l System.out.print(r.data+",");//p inorder(r.right);//r } }
 * void preorder(DNode r) { if(r!=null) { System.out.println(r.data);
 * preorder(r.left); preorder(r.right); } } void postorder(DNode r) {
 * if(r!=null){ postorder(r.left); postorder(r.right);
 * System.out.println(r.data); } } boolean search(DNode r,int key) { if(r!=null)
 * { if(r.data==key) return true; else { if(key<r.data) return
 * search(r.left,key);//l else return search(r.right,key);//2 } } else return
 * false; }
 * 
 * int getHeight(DNode r) { if(r==null) return 0; else { int
 * right=getHeight(r.right); int left=getHeight(r.left); return Math.max(left,
 * right)+1; } } boolean isBalanced(DNode r) { if(r==null) return true; else {
 * int right=getHeight(r.right); int left=getHeight(r.left); if(Math.abs(left -
 * right)<=1)//+1,0,-1 return true; else return false;
 * 
 * } } public static void main(String args[]) { Tree_Example obj=new
 * Tree_Example(); obj.createtree();//root=null DNode n1=new DNode(50);
 * obj.insert(obj.root, n1); DNode n2=new DNode(20); obj.insert(obj.root, n2);
 * DNode n3=new DNode(60); obj.insert(obj.root, n3); DNode n4=new DNode(30);
 * obj.insert(obj.root, n4); DNode n5=new DNode(40); obj.insert(obj.root, n5);
 * DNode n6=new DNode(90); obj.insert(obj.root, n6); // obj.inorder(obj.root);
 * // obj.preorder(obj.root); //obj.postorder(obj.root); //
 * System.out.println("Height is:"+(obj.getHeight(obj.root)-1));
 * System.out.println("is it balanced:"+obj.isBalanced(obj.root));
 * System.out.println("find 200:"+obj.search(obj.root,20)); } }
 */
public class Tree_Example{
	DNode root;
	void createTree() {
		root=null;
	}
	void insert(DNode r,DNode n) {
		if(root==null) {
			root=n;
		}
		else {
			if(r.data>n.data) {
				if(r.left==null) {
					r.left=n;
				}
				else
					insert(r.left,n);
			}
			else {
				if(r.right==null) {
					r.right=n;
				}
				else
					insert(r.right,n);
			}
		}
	}
	void preorder(DNode r) {
		if(r!=null) {
			System.out.println(r.data);
			preorder(r.left);
			preorder(r.right);
		}
	}
	int getHeight(DNode r) {
		if(r==null) {
			return 0;
		}
		else {
			int left=getHeight(r.left);
			int right=getHeight(r.right);
			
			return Math.max(left, right)+1;
		}
	}
	boolean isbalanced(DNode r) {
		if(r==null)
			return true;
		else {
			int left=getHeight(r.left);
			int right=getHeight(r.right);
			if(Math.abs(left-right)<1)
				return true;
			else
				return false;
		}
		
	}
	boolean search(DNode r,int key) {
		if(r!=null) {
			if(r.data==key) {
				return true;
			}
			else {
				if(key<r.data) {
					return search(r.left,key);
				}
				else {
					return search(r.right,key);
				}
				
			}
		}
		else {
			return false;
		}
			
	}
	public static void main(String[] args) {
				Tree_Example obj=new  Tree_Example(); 
				obj.createTree();//root=null
				 DNode n1=new DNode(50);
				 obj.insert(obj.root, n1); 
				 DNode n2=new DNode(20); 
				 obj.insert(obj.root, n2);
				 DNode n3=new DNode(60);
				 obj.insert(obj.root, n3); 
				 DNode n4=new DNode(30);
			 		obj.insert(obj.root, n4);
//				 DNode n5=new DNode(40); 
//				 obj.insert(obj.root, n5);
//				 DNode n6=new DNode(90); 
//				 obj.insert(obj.root, n6);
//				 obj.preorder(obj.root);
				// System.out.println("The height of root node is"+(obj.getHeight(obj.root)-1));
				// System.out.println(obj.isbalanced(obj.root));
				 System.out.println(obj.search(obj.root,29));
	}
}
