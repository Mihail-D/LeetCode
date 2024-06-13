package Easy;

public class FindIndexFirstOccurrence {

    public int strStr(String haystack, String needle) {
        int index;

        if (haystack.contains(needle)) {
            index = haystack.indexOf(needle);
        } else {
            index = -1;
        }

        return index;
    }

    public static void main(String[] args) {
        FindIndexFirstOccurrence f = new FindIndexFirstOccurrence();
        System.out.println(f.strStr("hello", "ll"));         // 2
        System.out.println(f.strStr("sadbutsad", "sad"));    // 0
        System.out.println(f.strStr("leetcode", "leeto"));   // -1
    }

}

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
