1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11
12class Solution {
13    public ListNode oddEvenList(ListNode head) {
14        if (head == null || head.next == null) {
15            return head;
16        }
17
18        ListNode odd = head;
19        ListNode even = head.next;
20        ListNode evenHead = even;
21
22        while (even != null && even.next != null) {
23            odd.next = even.next;
24            odd = odd.next;
25
26            even.next = odd.next;
27            even = even.next;
28        }
29
30        odd.next = evenHead;
31
32        return head;
33    }
34}