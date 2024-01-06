package collections;

import java.util.*;

public class StackTest {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<Integer>();
        s.push(11);
        s.push(12);
        s.push(13);
        Integer spop=s.pop();
        System.out.println("the pop element is" +spop);
        Integer ipeek=s.peek();
        System.out.println("the peek element is" +ipeek);
        int spos=s.search(12);
        System.out.println(spos);
        TreeSet<Integer> ts=new TreeSet<Integer>(s);
        ts.add(10);
        ts.add(15);
        ts.add(16);
        System.out.println(ts);
        LinkedList<String> lst=new LinkedList<String>();
        lst.add("the first element");
        lst.add("the second element");
        lst.add("the third element");
        for(Object obj:lst){
            System.out.println(obj);
        }
        System.out.println(lst.remove("the second element"));
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(20);
        hs.add(5);
        hs.add(25);
        System.out.println(hs);
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        lhs.add(30);
        lhs.add(5);
        lhs.add(40);
        System.out.println(lhs);

    }
}

