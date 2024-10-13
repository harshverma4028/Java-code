package L27LinkedList;
import java.util.*;

import javafx.scene.Node;

public class ReverseLL {
    Node head;
    public void reverseList(){
        if (head ==null || head.=next==null) {
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;

        while (currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        reverseList();

    }
}
