import java.util.*;

public class occurs{
    public static HashMap <Character, Integer> occu(String str) {

        HashMap <Character, Integer> hMap = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (hMap.containsKey(str.charAt(i))) {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            } else {
                hMap.put(str.charAt(i),1);
            }
        }

        return hMap;
    }
}
