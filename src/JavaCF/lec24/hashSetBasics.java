package JavaCF.lec24;

import java.util.HashSet;
import java.util.Set;

public class hashSetBasics {
   public static void main(String[] args) {
//  Note:It follows random order and duplicate elements are not allowed
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        st.add(30);
       System.out.println(st);
    }
}
