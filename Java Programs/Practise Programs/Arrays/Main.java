package Arrays;

//package com.doublyLinkedList;

import java.util.Scanner;

public class Main {
    Node head;

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public static Main createDLL(Main list, int data) {

        Node new_node = new Node(data);
        new_node.next = null;
        new_node.prev = null;

        //if list is empty, new node is head node
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
            new_node.prev = curr;
        }
        return list;
    }

    public static void displayDLL(Main list) {
        Node curr = list.head;
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            list.head = curr;
            System.out.print("DLL: ");
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void displayReverseDLL(Main list) {
        Node curr = list.head;
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.prev;
            }
        }
    }

    public static void insertAtEnd(Main list, int data) {
        Node curr = list.head;
        Node new_node = new Node(data);

        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
            new_node.prev = curr;
        }
    }

    public static void insertInBetween(Main list, int data) {

        Node new_node = new Node(data);
        Node curr = list.head;
        //to get size of list
//        int counter = 1;
//        while(curr.next!=null){
//            curr = curr.next;
//            counter++;
//        }
        //list size is printed
        // System.out.println("Size of DLL is: "+counter);
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            int count = 1;
            System.out.println("Enter the position after which you want to insert node");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
//            if (key >= counter) {
//                System.out.println("Invalid position");
//                // break;
//            } else {
            while (curr.next != null && key != count) {
                curr = curr.next;
                count++;
            }
            new_node.next = curr.next;
            curr.next = new_node;
            new_node.prev = curr;
            new_node.next.prev = new_node;
        }
    }

    public static void insertAtStart(Main list, int data) {
        Node new_node = new Node(data);
        Node curr = list.head;

        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            new_node.next = curr;
            curr.prev = new_node;
        }
        list.head = new_node;
    }

    public static Main deleteANode(Main list) {
        int flag = 0;
        int key = 0;
        Scanner sc1 = new Scanner(System.in);
        Node curr = null;
        Node temp = null;

        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            System.out.println("Enter node's data to be deleted");
            key = sc1.nextInt();
        }

        // only head node exists in the list and that is to be deleted
        if (key == list.head.data && list.head.next == null) {
            System.out.println("This is the only node and is the head node, so list will be empty");
            list.head = null;
        }
        // at least two nodes exists and head node's data to be deleted
        else if (list.head.next != null && key == list.head.data) {
            System.out.println("Head node will change");
            temp = list.head;
            list.head = temp.next;
            temp.next = null;
            list.head.prev = null;
            temp = null;
        } else {
            curr = list.head;
            while (curr.next != null && curr.next.data != key) {
                flag = 1;
                curr = curr.next;
            }
            temp = curr.next;
            if(temp == null){
                System.out.println("Element doesn't exist in list");
            }
           else if (temp.next == null) {
                curr.next = null;
                temp.prev = null;
            } else {
                curr.next = temp.next;
                temp.next.prev = curr;
                temp.next = null;
                temp.prev = null;
            }
            //temp.prev = null;
        }
        return list;
    }

    public static void deleteLastNode(Main list) {
        Node curr = null;
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            curr = list.head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public static void display1stNode(Main list) {
        Node curr = null;
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            curr = list.head;
            System.out.println(curr.data);
        }

    }

    public static void displayLastNode(Main list) {
        Node curr = null;
        if (list.head == null) {
            System.out.println("DLL is empty");
        } else {
            curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            System.out.println(curr.data);
        }

    }

    public static void main(String[] args) {

        Main list = new Main();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int ch1 = 0;

        do {
            System.out.println("\n----------Menu----------\n" +
                    "1.Create the Doubly Linked List\n" +
                    "2.Display Doubly Linked List\n" +
                    "3.Display Reverse Doubly Linked List\n" +
                    "4.Insert an element at the end of Doubly Linked List\n" +
                    "5.Insert an element after the given position\n" +
                    "6.Insert an element at the start of DLL\n" +
                    "7.Delete a node from Doubly Linked List\n" +
                    "8.Delete last element of DLL\n" +
                    "9.Display 1st node of DLL\n" +
                    "10.Display last node of DLL\n" +
                    "0.Exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Main list1 = null;
                    do {
                        System.out.println("Enter element to add in DLL");
                        int d1 = sc.nextInt();
                        list1 = createDLL(list, d1);

                        System.out.println("Do you want to add another element?\n1.yes\t0.no");
                        ch1 = sc.nextInt();
                    } while (ch1 == 1);
                    //break;

                case 2:
                    //System.out.println("DLL: ");
                    displayDLL(list);
                    break;

                case 3:
                    System.out.println("Reverse DLL");
                    displayReverseDLL(list);
                    break;

                case 4:
                    System.out.println("Enter element to insert at end");
                    int data = sc.nextInt();
                    insertAtEnd(list, data);
                    displayDLL(list);
                    break;

                case 5:
                    System.out.println("Enter the element to be inserted in between DLL");
                    int data2 = sc.nextInt();
                    insertInBetween(list, data2);
                    displayDLL(list);
                    break;

                case 6:
                    System.out.println("Enter element to insert at start");
                    int data1 = sc.nextInt();
                    insertAtStart(list, data1);
                    displayDLL(list);
                    break;
                case 7:
                    Main list2 = deleteANode(list);
                    displayDLL(list2);
                    System.out.println();
                    break;
                case 8:
                    deleteLastNode(list);
                    displayDLL(list);
                    break;
                case 9:
                    display1stNode(list);
                    break;
                case 10:
                    displayLastNode(list);
                    break;
                case 0:
                    System.out.println("------Thank you-------");
                    choice = 11;
                    break;

            }
        } while (choice < 10);
    }
}

