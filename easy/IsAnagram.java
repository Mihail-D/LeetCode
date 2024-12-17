package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        List<String> sList = new ArrayList<>(List.of(s.split("")));
        List<String> tList = new ArrayList<>(List.of(t.split("")));
        Collections.sort(sList);
        Collections.sort(tList);

        if (s.length() != t.length()) {
            return false;
        }

        return sList.equals(tList);
    }

    public static void main(String[] args) {
        IsAnagram sol = new IsAnagram();
        String s = "anagram", t = "nagaram";
        System.out.println(sol.isAnagram(s, t));
    }

}
