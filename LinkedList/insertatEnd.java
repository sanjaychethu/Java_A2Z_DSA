
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null){
            return new Node (x);
            
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            
        }
        Node newNode = new Node (x);
        temp.next = newNode;
        return head;
    }
}