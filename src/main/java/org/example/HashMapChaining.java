package org.example;

import java.util.LinkedList;

public class HashMapChaining<K,V> {
    private class Entry<K, V>{
        K key;
        V value;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] buckets;
    private int capacity = 16;

    public HashMapChaining(){
        buckets = new LinkedList[capacity];
        for(int i = 0; i<capacity; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public void put(K key, V value){
        int index = getBucketIndex(key);
        LinkedList<Entry<K,V>> bucket = buckets[index];
        for(Entry<K,V> entry: bucket){
            if(entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public V get(K key){
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for(Entry<K, V> entry : bucket){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for(Entry<K, V> entry : bucket){
            if(entry.key.equals(key)){
                bucket.remove(entry);
                return;
            }
        }
    }
}
