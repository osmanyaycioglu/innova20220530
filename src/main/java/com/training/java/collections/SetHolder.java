package com.training.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SetHolder<T> implements Iterable<T> {

    private Set<T> set = new HashSet<>();

    public void xyz(){
        System.out.println("xyz");
    }

    public SetHolder<T> add(T t){
        set.add(t);
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
