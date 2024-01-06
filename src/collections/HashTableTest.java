package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String args[]){
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        ht.put("science",34);
        ht.put("maths",30);
        ht.put("social",37);
        ht.put("telugu",29);
        ht.put("hindi",38);
        System.out.println(ht);
        for(Map.Entry<String,Integer>entry:ht.entrySet()){
            System.out.println( entry.getKey()+" "+entry.getValue());
        }
        System.out.println("social marks are"+ht.get("social"));
        System.out.println("key" +ht.keySet());
        System.out.println("value" +ht.entrySet());
        System.out.println(ht.containsValue(27));
        System.out.println(ht.values());
    }
}
