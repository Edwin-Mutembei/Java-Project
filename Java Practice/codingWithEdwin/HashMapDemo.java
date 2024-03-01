package com.codingWithEdwin;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of map is:- " + map.size());
        System.out.println(map);

//        Contains method and get method

        if(map.containsKey("a")){
            String a = String.valueOf(map.get("a"));
            System.out.println("Value for key " + "\"a\" is :-" + a) ;
        }

//        calling all the keys in the key set  using enhanced for loop
        for(String key : map.keySet()){
            System.out.println("Key:  " + key +" value:  "   + map.get(key));
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + ", value: " + entry.getValue());
        }


    }
}
