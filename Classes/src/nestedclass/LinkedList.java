package nestedclass;
 /*
 outer class
 can only have two access level one is public and other is private
 LinkedList is a top levevl class

 Nested class:-Nested class is a class within another class
 Nested class is divided into two categories
 1 Static nested class:-Declared using static keyword are static nested class
 Can not refer dirictly to instance filed or method define in its enclosing class
 but it can only use them obj refreance of enclosing class
 2 Inner class(Non static nested class):-

  */

import org.w3c.dom.Node;

public class LinkedList {
    //tjis class of field head of type node
    Node head;
    public LinkedList(Node head){
        this.head = head;
    }
    // Creating Node as static class which is helper of linkedlist class
    // node is similar to top level class and is not part of object of linkedList class
    // Node class which static inner class can have all access level
    //Private , default, protected,public
    //Note:- this node class is a static innner class and hence cannot access field/data member
    //from outer class directly because it is static
    static class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

    }
    void printLL(){
        System.out.println("LinkedList is :");
        Node temp = head;
        while(temp != null);{
            System.out.print("["+ temp .data +"]-->");
            temp = temp.next;
        }
        System.out.println("null/n");
    }
    void addNode(Node newNode){
        if (head == null){
            head = newNode;

        }else {
            Node temp = head;
            while (temp.next != null);
            temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Node" + newNode.data +" addeded successfully!");
        printLL();

    }

    public static void main(String[] args) {
        LinkedList LinkedList = new LinkedList(null);
        //creating an object of ode class
        LinkedList. Node newNode;
        newNode= new LinkedList.Node(20, null);
        LinkedList.addNode(newNode);
        newNode = new LinkedList.Node(30,null);
        LinkedList.addNode(newNode);
        newNode = new LinkedList.Node(40,null);
        LinkedList.addNode(newNode);

    }
}
