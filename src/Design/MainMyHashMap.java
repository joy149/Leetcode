package Design;

public class MainMyHashMap {
    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1,1);
        myMap.put(2,2);
        myMap.put(2,3);
        System.out.println(myMap.get(2));
        myMap.remove(2);
        System.out.println(myMap);
    }
}
