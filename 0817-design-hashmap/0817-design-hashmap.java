class MyHashMap {

    class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }

    Node[] bucket = new Node[1000];

    int hash(int key) { return key % 1000; }

    public void put(int key, int value) {
        int i = hash(key);
        Node head = bucket[i];

        if (head == null) {
            bucket[i] = new Node(key, value);
            return;
        }

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }
        curr.next = new Node(key, value);
    }

    public int get(int key) {
        Node curr = bucket[hash(key)];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int i = hash(key);
        Node curr = bucket[i];

        if (curr == null) return;
        if (curr.key == key) {
            bucket[i] = curr.next;
            return;
        }

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}
