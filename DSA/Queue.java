public class Queue {
    private ListNode front;
    private ListNode rare;
    private int length;

    public static void main(String[] agrs) {
    }

    private class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private int length() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }
}
