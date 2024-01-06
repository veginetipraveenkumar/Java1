package collections;

import java.util.ArrayList;

public class ArrayTest2 {
    public static void main(String args[]){
        ArrayList lst=new ArrayList();
        Integer i=Integer.valueOf(10);
        Character c=Character.valueOf('p');
        Double d=Double.valueOf(7.25);
        lst.add(i);
        lst.add(c);
        lst.add(d);
        for(Object objj: lst){
            System.out.print(""+objj.toString());
        }
    }

}

