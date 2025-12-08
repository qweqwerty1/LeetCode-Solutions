import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    }
}

class ListNode {
    public static final Scanner sc = new Scanner()
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    void printNodes(ListNode ptr) {
        System.out.printf("변환 결과 노드 값 : ");
        while (ptr != null) {
            System.out.printf("%d ",ptr.val);
            ptr = ptr.next;
        }
    }

    ListNode AddNodes(void) {
        System.out.printf("추가할 노드의 개수 : ")
        int n = sc.nextInt();
        System.out.println();
        ListNode head = new ListNode();
        ListNode ptr = head;

        for (int i = 0;i < n;i++) {
            System.out.printf("%d번째 노드의 값 : ",i + 1);
            int value = sc.nextInt();
            System.out.println();

            ListNode newNode = new ListNode(value);
            ptr.next = newNode;
            ptr = ptr.next;
        }

    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode ptr = head.next;
        ListNode tail = dummy;
        int sum = 0;
        while (ptr != null) {
            if (ptr.val == 0) {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            else { sum += ptr.val; }
            ptr = ptr.next;
        }

        return dummy.next;
    }
}