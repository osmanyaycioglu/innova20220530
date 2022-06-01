package com.training.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapHolder<V> {

    private Map<String,SetHolder<V>> map = new HashMap<>();

    public SetHolder<V> add(String k,V v){
        SetHolder<V> v1 = map.get(k);
        if (v1 == null) {
            v1 = new SetHolder<>();
            map.put(k,v1);
        }
        v1.add(v);
        return v1;
    }

    public SetHolder<V> get(String key){
        return map.get(key);
    }

}
