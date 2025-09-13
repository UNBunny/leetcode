package neetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EncodeDecodeStrings {
    Random random = new Random();
    Integer x = random.nextInt();

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length() != 0 ? x / str.length() : 1).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            if (length == 1) {
                result.add("");
            } else {
                j = i + x / length;
                result.add(str.substring(i, j));
                i = j;
            }

        }
        return result;
    }
}
