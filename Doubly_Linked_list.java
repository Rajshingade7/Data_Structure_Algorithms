package LinkedList;

public class Doubly_Linked_list {
DNode root;
    
    void createList()
    {
        root=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    void insert_left(int e)
    {
        DNode n=new DNode(e);
        if(root==null)
            root=n;
        else
        {
            n.right=root;//1
            n.left=null;
            root.left=n;
            root=n;//2
        }
        System.out.println("Inserted");       
    }
    void insert_right(int e)
    {   DNode n=new DNode(e);
        if(root==null)
            root=n;
        else
        {
           DNode t=root;//1
           while(t.right!=null)//2
               t=t.right;
           t.right=n;//3
           n.left=t;
        }
        System.out.println("Inserted");       
    } 
    void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          root=root.right;//2
          root.left=null;
          System.out.println(t.data+" deleted");       
        }
    } 
    void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          DNode t2=t;//1
          while(t.right!=null)//2
          {
        	  t.left=null;
        	  t2=t;
        	  t=t.right;
        	  
          }
          if(root==t)//only one node
              root=null;//manual reset
          else
             t2.right=null;//3
          	 
          System.out.println(t.data+" deleted");       
         }
    }
}
