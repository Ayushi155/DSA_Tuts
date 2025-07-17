package Queues;

public class basicsSTL {
    // implementation of queue using arran
    public static class queueA {
        int[] arr = new int[100];
        private int f = -1;
        private int r = -1;
        int size = 0;

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
                size++;
            } else {
                arr[r] = val;
                r++;
                size++;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedElement = arr[f];
            f++;
            size--;
            return removedElement;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f - 1];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            for (int i = f; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Queue implementation using linked list

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;

        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int cur = head.val;
            head = head.next;
            size--;
            return cur;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            return head.val;
        }

        public void display() {
            if (head == tail) {
                System.out.println("Queue is empty");
            }
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.val + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    // array implementation of circular queue

    public static class circularQueueA {
        int[] arr = new int[10];
        int n = 10;
        private int f = -1;
        private int r = -1;
        int size = 0;

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
                size++;
            } else if (r < n - 1) {
                arr[r] = val;
                r++;
                size++;
            } else if (r == n - 1) {
                r = 0;
                arr[0] = val;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else if (f < n - 1) {
                int removedElement = arr[f];
                f++;
                size--;
                return removedElement;
            } else if (f == n - 1) {
                int removedElement = arr[f];
                f = 0;
                size--;
                return removedElement;
            }
            return -1;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f - 1];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else if (f <= r) {
                for (int i = f; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else if (r < f) {
                for (int i = f; i < n - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //queueA q = new queueA();
        queueLL q1 = new queueLL();

        q1.display();
        System.out.println(q1.size);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        System.out.println(q1.size);
        System.out.println(q1.remove());
        System.out.println(q1.peek());

    }
}
