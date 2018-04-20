package com.sap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    HashMap<String, Integer> a = new HashMap<String, Integer>();
    a.put("one", 1);
    a.put("two", 2);
    a.put("three", 3);
    a.put("four", 4);
    a.put("five", 5);
    a.remove("four");
//    System.out.println(a.get("one"));
//    System.out.println(a.get("two"));
//    System.out.println(a.get("three"));

//     iteratorUsingForEach(a);
//     iteratorUsingIterator(a);
    
//    Set keys = a.keySet();
//    Iterator<String> ki = keys.iterator();
//    
//    while (ki.hasNext()) {
//      String key = ki.next();
//      System.out.println(key + ":" + a.get(key));
//    }
    
    Set<Map.Entry<String, Integer>> as = a.entrySet();
    Iterator<Map.Entry<String, Integer>> asi = as.iterator();
    
    while (asi.hasNext()) {
      Map.Entry<String, Integer> me = asi.next();
      System.out.println(me.getKey() + " : " + me.getValue());
    }
  }

  static void iteratorUsingForEach(HashMap map) {
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

  static void iteratorUsingIterator(HashMap map) {
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    Iterator<Map.Entry<String, Integer>> i = entries.iterator();
    while (i.hasNext()) {
      Map.Entry<String, Integer> entry = i.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
