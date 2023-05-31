package exercise;
// BEGIN

import java.lang.StringBuilder;


public class ReversedSequence implements CharSequence {
    private String someString;


    public ReversedSequence(String someString) {
        this.someString = new StringBuilder(someString).reverse().toString();
    }

    @Override
    public int length() {
        return this.someString.length();
    }

    @Override
    public char charAt(int index) {
        char[] result = new char[this.someString.length()];
        result = this.someString.toCharArray();
        return result[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {




        return null;
    }

    @Override
    public String toString() {
        return this.someString;
    }

    public static void main(String[] args) {


        CharSequence text = new ReversedSequence("abcdef");

//        System.out.println(text.toString()); // "fedcba"
//        System.out.println(text.charAt(0)); // 'e'
//        System.out.println(text.length()); // 6
//        text.subSequence(1, 4).toString(); // "edc"

    }
}

// END
