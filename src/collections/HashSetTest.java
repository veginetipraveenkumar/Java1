package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs);
       // TreeSet<Integer> ts=new TreeSet<Integer>(hs);

//System.out.println(ts);

    }
}
