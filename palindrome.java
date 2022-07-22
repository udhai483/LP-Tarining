/*
 * To change this license Header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
 import java.util.*;
/**
 *
 * @author udaya
 */


class linkedList {
    static class NodeWrapper
    {
        public Node Node;
        NodeWrapper(Node Node) {
            this.Node = Node;
        }
    }
    public static Node push(Node Head, String Datas)
    {
        Node Node = new Node(Datas);
        Node.next = Head;
        return node;
    }
    public static boolean checkPalindrome(NodeWrapper left, Node right)
    {
        if (right == null) {
            return true;
        }
 
        boolean result = checkPalindrome(left, right.next) &&
                            (left.node.Datas.equals(right.Datas));
        left.Node = left.node.next;
 
        return result;
    }
    public static boolean checkPalin(Node Head)
    {
        return checkPalindrome(new NodeWrapper(Head), Head);
    }
 
    public static void main(String[] args)
    {
         //int[] keys = new int[3];
        Scanner scanner = new Scanner(System.in);
        mylinkedlist myLinkedList = new mylinkedlist();
       // System.out.println("Enter Letters :");
        
       
        
       System.out.println ("Enter the input");
       
       String  inout01 = scanner.nextLine();
       String[] array1 = new String[inout01.length()];
        for (int i = 0; i < inout01.length(); i++) {
           array1[i] = (""+inout01.charAt(i)).trim();
        }
       
        Node Head = null;
        for (int i = inout01.length() - 1; i >= 0; i--) {
            
            Head = push(Head, array1[i]);
        }
 
        if (checkPalin(Head)) {
            System.out.println("The linked list is a palindrome");
        }
        else {
            System.out.println("The linked list is not a palindrome");
        }
    }
}

class Node {
	String Datas;
    Node next = null;
 
    Node(String Datas) {
        this.Datas = Datas;
    }
}
