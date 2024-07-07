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

    private void enQueue(int data){
        ListNode temp= new ListNode(data);
        if (isEmpty()){
            front=temp;
        }
        else{
            rare.next=temp;
        }
        rare=temp;
        length++;
    }

    private int deQueue(){
        int result;
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
           result= front.data;
           front=front.next;
           if(front==null){
               rare=null;
           }
        }
        length--;
        return result;
    }

}
