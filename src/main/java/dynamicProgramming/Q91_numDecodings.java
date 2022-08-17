package dynamicProgramming;

public class Q91_numDecodings {
    public int numDecodings(String s) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            c = 0;
            if (s.charAt(i) != '0') {
                c += b;
            }
            if (i >= 1 && s.charAt(i-1) != '0' &&  (10*(s.charAt(i-1)-'0') + s.charAt(i)-'0') <= 26 ) {
                c += a;
            }
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Q91_numDecodings a = new Q91_numDecodings();
        String s = "226";
        System.out.println(a.numDecodings(s));
    } 
}
