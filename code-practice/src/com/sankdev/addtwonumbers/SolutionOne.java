package com.sankdev.addtwonumbers;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SolutionOne {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return new ListNode();
    }


    public static void main(String[] args) {
        ListNode f1 = new ListNode(3);
        ListNode f2 = new ListNode(4,f1);
        ListNode f3 = new ListNode(2,f2);
        ListNode s1 = new ListNode(4);
        ListNode s2 = new ListNode(6,s1);
        ListNode s3 = new ListNode(5,s2);

        int count = 1;
        int tempVal = 0;
        boolean flag = false;
        ListNode i1 = f3;
        ListNode i2 = s3;
        ListNode res1;
        while(i1 != null || i2 != null) {
            if((i1.val + i2.val) >= 10) {
                flag = true;

            }
        }










        int counter = 0;
        int f = f3.val;
        int tmp = 0;
        ListNode i = f3.next;
        while(i != null) {
            counter++;
            tmp = i.val;
            tmp = tmp*(int)Math.pow(10,counter);
            f += tmp;
            i = i.next;
        }

        System.out.println(f);

        int r = f;

        counter = 0;
        f = s3.val;
        tmp = 0;
        i = s3.next;
        while(i != null) {
            counter++;
            tmp = i.val;
            tmp = tmp*(int)Math.pow(10,counter);
            f += tmp;
            i = i.next;
        }

        System.out.println(f);

        r += f;



    }

}
