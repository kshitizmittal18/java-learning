package com.learnings.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class CalculateCharFrequency {
    private List<String> namesList;
    private Boolean ignoreCase;

    public CalculateCharFrequency(List<String> namesList, Boolean ignoreCase){
        this.ignoreCase = ignoreCase;
        this.namesList = namesList;
    }

    public Map<String, Map<Character, Integer>> calculate(){
        Map<String, Map<Character,Integer>> listResult = new HashMap<>();

        for (String name: namesList){
            Map<Character, Integer> mapResult = new HashMap<>();
            char[] charArr = name.toCharArray();
            for (char c:charArr) {
                if(ignoreCase){
                    c = Character.toLowerCase(c);
                }
                if(c == ' '){
                    continue;
                }
                // Logic to count occurrences
                if (mapResult.containsKey(c)) {
                    mapResult.put(c, mapResult.get(c) + 1);
                }
                else {
                    mapResult.put(c, 1);
                }
            }
            listResult.put(name, mapResult);
        }
        return listResult;
    }
}

public class CharFrequency {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Kshitiz Mittal");
        namesList.add("Tanya Mittal");
        namesList.add("Vivek Sharma");

        CalculateCharFrequency c = new CalculateCharFrequency(namesList ,false);

//        Map<Character, Integer> m = c.calculate();
//        System.out.println(m);
//        Map<Character, Integer> filteredResultByValue = m.entrySet().stream()
//                                                .filter(map -> map.getValue() >= 2)
//                                                .collect(Collectors.toMap(map->map.getKey(),map-> map.getValue()));
//
//        System.out.println(filteredResultByValue);
//
//        Map<Character, Integer> filteredResultByKey = m.entrySet().stream()
//                .filter(map -> map.getKey().equals('a') || map.getKey().equals('A'))
//                .collect(Collectors.toMap(map->map.getKey(),map-> map.getValue()));
//
//        System.out.println(filteredResultByKey);

        Map<String, Map<Character,Integer>> rm = c.calculate();

        Map<String, Map<Character,Integer>> filteredByKeyResult = new HashMap<>();

        filteredByKeyResult = rm.entrySet().stream()
                        .filter(map -> map.getKey().endsWith("Mittal") && map.getValue().containsKey('a'))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredByKeyResult);
    }
}
