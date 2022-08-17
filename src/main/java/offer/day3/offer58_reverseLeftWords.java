package offer.day3;

public class offer58_reverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }

    public static void main(String[] args) {
        offer58_reverseLeftWords a = new offer58_reverseLeftWords();
        System.out.println(a.reverseLeftWords("lrloseumgh", 2));
    }

}
