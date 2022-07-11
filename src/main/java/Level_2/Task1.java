package Level_2;

import static Level_2.Task1.TestText.testing;

public class Task1 {
    public static void main(String[] args) {
        String s = "{test text(more text)[][one more test text]((Some text or numbers (33)))}";
        System.out.println(testing(s));
    }

    public class TestText {
        public static boolean testing(String str) {
            int check = 0;
            for (int i = 0; i < str.length(); i++) {
                if (check < 0) {
                    return false;
                }
                String symbol = str.substring(i, i + 1);
                if (symbol.equals("(") || symbol.equals("{") || symbol.equals("[")) {
                    check++;
                    continue;
                }
                if (symbol.equals(")") || symbol.equals("}") || symbol.equals("]"))
                    check--;
            }
            if (check == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
