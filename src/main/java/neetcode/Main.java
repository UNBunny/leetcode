package neetcode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println( containsDuplicate.hasDuplicate(new int[]{1, 2, 3, 4, 5, 4}));

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("racecar", "carrace"));

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3,3,3}, 2)));

        EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();
        System.out.println(encodeDecodeStrings.decode(encodeDecodeStrings.encode(List.of(""))));
    }
}
