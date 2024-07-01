package Easy;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        StringBuilder sb = new StringBuilder(str).reverse();

        return str.compareTo(sb) == 0;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome("0P"));
    }
}
