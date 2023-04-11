import java.util.Arrays;

class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "kasur";
        String t = "rusak";
        System.out.println(isAnagram(s, t));
    }
}
