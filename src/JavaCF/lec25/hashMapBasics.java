package JavaCF.lec25;

import java.util.*;

public class hashMapBasics {
   public static void main(String[] args) {
       Map<String, String> mapping = new HashMap<>();

       //insertion
       mapping.put("in", "India");
       mapping.put("en", "england");
       mapping.put("us", "unitedStates");

       System.out.println(mapping);

       Map<String, String> table = new HashMap<>();
       table.put("br" ,"Brazil");
       System.out.println("Before" + table);
       table.putAll(mapping);
       System.out.println( "After" + table);

       //deletion
       table.remove("us");
       System.out.println(table);

       System.out.println(table.size());

       table.putIfAbsent("is", "israel");
       System.out.println(table);

       System.out.println(table.containsKey("in"));
       System.out.println(table.containsKey("im"));
       System.out.println(table.containsValue("israel"));
       System.out.println(table.containsValue("portugal"));
       System.out.println(table.getOrDefault("is", "NONE"));
       System.out.println(table.getOrDefault("im", "NONE"));

       System.out.println(table);
       table.replace("in", "Bharat");
       System.out.println(table);

       Set<String> keyset = table.keySet();
       System.out.println(keyset);

       Collection<String> valueSet = table.values();
       System.out.println(valueSet);

       //get all entries from map
       Set<Map.Entry<String, String>> entrySet = table.entrySet();
       System.out.println(entrySet);




    }
}
