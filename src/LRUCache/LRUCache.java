package LRUCache;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/lru-cache/description/
/*
* Using DLL and Hashmap to implement LRU cache
* Idea is to implement DLL in such a way that most recent item is right next to head
* and least recent is just before the tail.
* */
public class LRUCache {
    Map<Integer, Node> cache ;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    public int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<Integer, Node>();
        this.head.next = this.tail;
        this.tail.prev = this.head;

    }

    public int get(int key) {
        if (this.cache.containsKey(key)) {
            Node node = this.cache.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        else {
            return -1;
        }
    }

    private void addNode(Node node) {
        cache.put(node.key, node);
        node.next = this.head.next;
        node.next.prev = node;
        node.prev = this.head;
        this.head.next = node;

    }

    private void removeNode(Node node) {
        cache.remove(node.key);
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            removeNode(this.cache.get(key));
        }
        if (this.cache.size() == this.capacity) {
            removeNode(this.tail.prev);
        }

        addNode(new Node(key, value));
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
