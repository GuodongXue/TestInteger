package testString;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "a-b-c";
        String s1 = new String();
        String s2 = new String(new char[]{'a','b','c'});
        int num = s2.length();
        System.out.println(s2.isEmpty());
        int i = s.compareTo(s2);
        System.out.println(i);
        String[] res = s.split("-");
        System.out.println(Arrays.toString(res));
        s.trim();
    }
}

