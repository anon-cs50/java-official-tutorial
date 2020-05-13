package Interface.exercise;

import java.lang.CharSequence;

public class CharSequenceDemo implements CharSequence {

    private String data;

    public CharSequenceDemo(String data) {
        this.data = data;
    }

    public int fromEnd(int index) {
        return data.length() - 1 - index;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= data.length()) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return data.charAt(fromEnd(index));
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > data.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        CharSequence stringToCharSequence = data.subSequence(fromEnd(end), fromEnd(start));
        StringBuilder stringBuilder = new StringBuilder(stringToCharSequence);
        return stringBuilder.reverse();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.data);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        CharSequence s = new CharSequenceDemo("promote products derived");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(s.subSequence(9, 22));
        // toString automatically get called: Check println() documentation
        System.out.println(s);
    }
}
