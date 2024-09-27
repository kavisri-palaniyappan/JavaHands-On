package org.map;
import java.util.*;
import java.util.Map.Entry;
public class MapTask {
   public static void main(String[] args) {
//	Map<String,Integer> m=new HashMap();
//    m.put("Chicken Briyani",100);
//    m.put("null",30);
//    m.put("Dosa",60);
//    m.put("Chicken Rice",90);
//    m.put("Egg Rice",80);
//    m.put("Poori",null);
//    System.out.println(m);
//    
//    int size = m.size();
//    System.out.println(size);
//    System.out.println("==============================");
//
//    boolean containsKey = m.containsKey("Chicken Rice");
//    System.out.println(containsKey);
//    System.out.println("==============================");
//
//    boolean containsValue = m.containsValue(60);
//    System.out.println(containsValue);
//    System.out.println("==============================");
//
//    Integer remove = m.remove("Poori");
//    System.out.println(remove);
//    System.out.println("==============================");
//
//    Set<String> keySet = m.keySet();
//    System.out.println(keySet);
//    System.out.println("==============================");
//
//    Collection<Integer> values = m.values();
//    System.out.println(values);
//    System.out.println("==============================");
//
//    Set<Entry<String, Integer>> entrySet = m.entrySet();
//    for(Entry<String, Integer> a:entrySet) {
// 	   System.out.println(a);
// 	  a.getKey();
// 	    System.out.println(a);
// 	    System.out.println(a.getValue());
//    }    
//  
//    Map<String,Integer> m1=new LinkedHashMap();
//    m1.put("Chicken Briyani",100);
//    m1.put("null",30);
//    m1.put("Dosa",60);
//    m1.put("Chicken Rice",90);
//    m1.put("Egg Rice",80);
//    m1.put("Poori",null);
//    System.out.println(m1);
//      
//    int size = m1.size();
//    System.out.println(size);
//    System.out.println("==============================");
//
//    boolean containsKey = m1.containsKey("Chicken Rice");
//    System.out.println(containsKey);
//    System.out.println("==============================");
//
//    boolean containsValue = m1.containsValue(60);
//    System.out.println(containsValue);
//    System.out.println("==============================");
//
//    Integer remove = m1.remove("Poori");
//    System.out.println(remove);
//    System.out.println("==============================");
//
//    Set<String> keySet = m1.keySet();
//    System.out.println(keySet);
//    System.out.println("==============================");
//
//    Collection<Integer> values = m1.values();
//    System.out.println(values);
//    System.out.println("==============================");
//
//    Set<Entry<String, Integer>> entrySet = m1.entrySet();
//    for(Entry<String, Integer> b:entrySet) {
// 	   System.out.println(b);
// 	  b.getKey();
// 	    System.out.println(b);
// 	    System.out.println(b.getValue());
//    }    
//   }
     
   Map<String,Integer> m2=new TreeMap();
   m2.put("Chicken Briyani",100);
   m2.put("null",30);
   m2.put("Dosa",60);
   m2.put("Chicken Rice",90);
   m2.put("Egg Rice",80);
   m2.put("Poori",null);
   System.out.println(m2);
    
   int size = m2.size();
   System.out.println(size);
   System.out.println("==============================");

   boolean containsKey = m2.containsKey("Chicken Rice");
   System.out.println(containsKey);
   System.out.println("==============================");

   boolean containsValue = m2.containsValue(60);
   System.out.println(containsValue);
   System.out.println("==============================");

   Integer remove = m2.remove("Poori");
   System.out.println(remove);
   System.out.println("==============================");

   Set<String> keySet = m2.keySet();
   System.out.println(keySet);
   System.out.println("==============================");

   Collection<Integer> values = m2.values();
   System.out.println(values);
   System.out.println("==============================");

   Set<Entry<String, Integer>> entrySet = m2.entrySet();
   for(Entry<String, Integer> c:entrySet) {
	   System.out.println(c);
	  c.getKey();
	    System.out.println(c);

	    System.out.println(c.getValue());
   }    
  }
}														
   
