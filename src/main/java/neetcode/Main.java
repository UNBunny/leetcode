package neetcode;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println( containsDuplicate.hasDuplicate(new int[]{1, 2, 3, 4, 5, 4}));

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("racecar", "carrace"));

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }
}
