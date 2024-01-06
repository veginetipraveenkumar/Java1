package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("praveen", 20);
        hm.put("gopi", 30);
        hm.put("ashok", 40);
        hm.put("pullarao", 45);
        hm.put("null",50);
        System.out.println(hm);
        for (Object obj1 : hm.entrySet()) {
            System.out.println(obj1);
        }
        for (Object obj2 : hm.keySet()) {
            System.out.println(obj2);
        }
        System.out.println("gopi marks are" + hm.get("gopi"));
        for (Map.Entry<String, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
