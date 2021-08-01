package pl.devcezz.generic;

import java.util.HashMap;
import java.util.Map;

public class MyMapImpl<K, V> implements MyMap<K, V> {

    private final Map<K, V> map = new HashMap<>();

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }
}
