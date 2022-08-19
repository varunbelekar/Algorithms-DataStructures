package com.varun.datastructures.lrucache;

import java.util.*;

public class LRUCache {
    int capacity;
    Map<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)){
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
        }
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {

        if (map.containsKey(key)){
            map.remove(key);
        }else{
            if (map.size() == capacity){
                int first = map.keySet().stream().findFirst().get();
                map.remove(first);
            }
        }
        map.put(key, value);

    }
}
