package collections;

import java.util.Vector;

public class VectorTest {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("apple");
        v.add("mango");
        v.add("orange");
        v.add("null");
        v.add("banana");
        System.out.println(v);
System.out.println(v.get(4));
    }
}
