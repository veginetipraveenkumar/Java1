package collections;

import java.util.LinkedList;

public class LinkedTest  {
    public static void main(String args[]){
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("praveen");
        linkedList.add("gopi");
        linkedList.add("ashok");
        linkedList.add("null");
        System.out.println(linkedList);
        linkedList.add(2,"dhoni");
        linkedList.add(null);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.set(4,"rahul");
        System.out.println(linkedList);
        String[] strarray=linkedList.toArray(new String[0]);
        System.out.println(strarray.length);
        //Object[] sarray= linkedList.toArray();
    }
}
