package com.designpatterns.java.structural.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Long, FlyweightClass> cache = new HashMap<>();

    public FlyweightClass getFlyweight(long id){
        if (!cache.containsKey(id)){
            cache.put(id, new FlyweightClass(id));
        }
        return cache.get(id);
    }
}
