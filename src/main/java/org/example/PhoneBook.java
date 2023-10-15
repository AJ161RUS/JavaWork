package org.example;

import java.util.*;

public class PhoneBook {
    private  static  HashMap<String, ArrayList> contact = new HashMap<>();

    public static void  addCont (String name , String Number){
        if(contact.containsKey(name)){
            ArrayList AddNumbers = contact.get(name);
            AddNumbers.add(Number);
            contact.put(name, AddNumbers);
        }else {
            ArrayList AddNumbers = new ArrayList<>();
            AddNumbers.add(Number);
            contact.put(name, AddNumbers);
        }
    }
    public static void printContact(){
        ArrayList<Map.Entry<String,ArrayList>> list = new ArrayList<>(contact.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
       for (Map.Entry<String,ArrayList>entry: list) {
           System.out.println(entry.getKey() + ": " + entry.getValue());

       }
    }

}
