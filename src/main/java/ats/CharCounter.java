package ats;

import java.util.HashMap;

public class CharCounter {

    public HashMap<Character, Integer> countAll(String text) {
    	String nolauso;
        HashMap<Character, Integer> results = new DefaultHashMap<Character, Integer>(0);
        if (null == text || text.length() == 0) {
            return results;
        }
        text = text.toLowerCase();
        for(int i=0; i < text.length(); i++) {
            int count = 0;
            char c = text.charAt(i);
            if(results.containsKey(c)) {
                count = results.get(c);
            }
            count++;
            results.put(c, count);
        }
        return results;
    }

    class DefaultHashMap<K,V> extends HashMap<K,V> {
        protected V defaultValue;
        public DefaultHashMap(V defaultValue) {
            this.defaultValue = defaultValue;
        }
        @Override
        public V get(Object k) {
            return containsKey(k) ? super.get(k) : defaultValue;
        }	
    }
}