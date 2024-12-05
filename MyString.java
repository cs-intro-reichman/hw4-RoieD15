public class MyString {
    public static void main(String[] args) {
        //System.out.println("Testing lowercase:");
        //System.out.println("UnHappy : " + lowerCase("UnHappy"));
        //System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        //System.out.println("TLV : " + lowerCase("TLV"));
        //System.out.println("lowercase : " + lowerCase("lowercase"));
        //System.out.println("Testing contains:");
        System.out.println(contains("baba yaga", "baba")); // true
        System.out.println(contains("happy", "")); // true
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); // false
        System.out.println(contains("baba yaga", "Yaga")); // false
        System.out.println(contains("baba yaga", "babayaga")); // false
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newString = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
            c += 32;
            newString += c;
            } else {
                newString += c;
            }
        }
        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1.isEmpty()) {
            return false;
        }
        if(str2.length() > str1.length()) {
            return false;
        }
        if(str2.equals("")) {
            return true;
        }
        if(str1.length() == str2.length()) {
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i))
                return false;
            }
        }
        for(int i = 0; i <= str1.length() - str2.length(); i++) {
            if((str1.substring(i, i + str2.length()).equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
