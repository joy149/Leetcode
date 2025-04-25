package Design;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap {

    HashNode[] node;
    public MyHashMap() {
        this.node = new HashNode[8];
    }

    public void put(int key, int value) {
        HashNode newNode = new HashNode(key, value);
        int index = getIndex(newNode);
        this.node[index] = newNode;
    }

    private int getIndex(HashNode newNode) {
        int index = Math.abs(newNode.hashCode()) % this.node.length;
        return index;
    }

    public int get(int key) {
        HashNode node1 = new HashNode();
        node1.setKey(key);
        return this.node[getIndex(node1)].getValue();
    }

    public void remove(int key) {
        HashNode node2 = new HashNode();
        node2.setKey(key);
        this.node[getIndex(node2)] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(node).filter(Objects::nonNull).toArray());
    }
}

class HashNode {
    int key;
    int value;

    public HashNode() {
    }
    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashNode hashNode = (HashNode) o;
        return key == hashNode.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "HashNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
