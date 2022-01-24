package stream.mapStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>() {{
            put("key1", "NY");
            put("key2", "IL");
            put("key3", "CA");
            put("key4", "IL");
            put("key5", "AK");
            put("key6", "NY");
        }};

        Map<String, String> resultMap = map.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey,
                        (oldValue, newValue) -> oldValue + ", " + newValue));
        resultMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(","))
                .forEachOrdered(System.out::println);
    }
}
