package com.coursedesign.demo.a22characterfrequencycountwithhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class CharacterFrequencyCountWithHashMap {
    public static void main(String[] args) {
        String str = "aabbbcdddd";

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(hm.containsKey(c)){
                int count = hm.get(c);
                count++;
                hm.put(c, count);
            }else{
                hm.put(c, 1);
            }
        }

        StringBuffer sb = new StringBuffer();
        hm.forEach((character,integer)-> sb.append(character).append("(").append(integer).append(")"));

        System.out.println(sb);
    }
}
