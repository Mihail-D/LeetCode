package Easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");

        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        String s = "   fly me   to   the moon  ";
        System.out.println(sol.lengthOfLastWord(s));
    }
}

// https://leetcode.com/problems/length-of-last-word
