package code;

public class MyStringTokenizer {

    private String string, delimiter;

    public MyStringTokenizer(String string, String delimirer) {
        this.string = string;
        this.delimiter = delimirer;
    }

    public boolean hasMoreTokens() {
        String tmpString = string;
        while (tmpString.startsWith(delimiter)) {
            tmpString = tmpString.substring(delimiter.length(), tmpString.length());
        }
        return !tmpString.isEmpty();
    }

    public String nextToken() {
        String token;
        String tmpString = string;
        while (tmpString.startsWith(delimiter)) {
            tmpString = tmpString.substring(delimiter.length(), tmpString.length());
        }
        if (tmpString.length() >= delimiter.length()) {
            int i = tmpString.indexOf(delimiter);
            token = tmpString.substring(0, i);
            tmpString = tmpString.substring(i, tmpString.length());
            string = tmpString;
        } else {
            token = tmpString;
        }
        return token;
    }

    @Override
    public String toString() {
        return string;
    }
}
