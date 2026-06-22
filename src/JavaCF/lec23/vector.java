package JavaCF.lec23;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.List;

public class vector {
    //peek, poll, offer, clone, ensureCapacity() Cannot be used in vector
    public static void main(String[] args) {
        Vector<Integer> list = new Vector();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(50);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        //addAll Example
        List<Integer> list2 = new Vector<>();
        list2.add(101);
        list2.add(102);

        //addAll
        list.addAll(list2);
        System.out.println(list);

        //removeAll
        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //clear
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        //traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) { //using hasNext method
            System.out.println("Element is" + iterator.next()); //NOTE: using next() not hasNext()
        }

        List<Integer> list3 =  new Vector<>();
        list3.add(18);
        list3.add(19);
        list3.add(20);

        System.out.println(list3.get(2)); //using get method

        list3.set(1,99);  //using set method
        System.out.println(list3);

        //toArray
        Object[] arr = list3.toArray();
        for (Object obj:arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(99));

        //sort
        System.out.println(list);
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(list);

        //sort
        Collections.sort((list)); //sorting in ascending order
        System.out.println(list);
        Collections.reverse(list); //sorting in descending order
        System.out.println(list);

        //clone- not possible in linkedlist
//        List<Integer>newlist = (List<Integer>)list.clone();
//        System.out.println( "newList elements" +  newlist);


    }
}
