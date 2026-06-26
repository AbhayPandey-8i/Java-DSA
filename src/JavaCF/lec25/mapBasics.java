package JavaCF.lec25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mapBasics {
   public static void main(String[] args) {

       List<student> students = new ArrayList<>();
       students.add(new student(20,61, "Abhay"));
       students.add(new student(21,57, "Sushant"));
       students.add(new student(22,68, "Shashikant"));
       students.add(new student(25,60, "Raut"));


       System.out.println(students);
       Collections.sort(students);
       System.out.println(students);

//        List<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(30);
//        list.add(10);
//        list.add(50);
//        list.add(40);
//       System.out.println(list);
//
//       Collections.sort(list);
//       System.out.println(list);
    }
}
