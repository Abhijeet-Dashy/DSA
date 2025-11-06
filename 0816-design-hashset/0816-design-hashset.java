class MyHashSet {

    private static final int SIZE = 769;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int idx = hash(key);
        List<Integer> bucket = buckets[idx];
        return bucket.contains(key);
    }
}
