/* 
MD Abir A. Choudhury
092118
String - CW
*/

import java.lang.String;

class stringClasswork {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a.compareTo("A"));
        Sys.out.println(a.substring(1,3) == "bc");

        String s = " How are you? ";
        System.out.println(s.trim().charAt(2));

        // System.out.println(">>>" + a.length() + a.startsWith("a")); // string concatenation so that it doesn't really matter what the data types are
    }
}