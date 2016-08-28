package nyc.c4q.Yojana;

/**
 * Check to see if a string has the same count of 'x's and 'o's. The method must return a boolean and be case insensitive. The string may contain any Unicode character -- not just 'x's and 'o's -- and may be of any length.
 * Created by yojanasharma on 8/28/16.
 */
public class ProblemThree {
    public static void main(String[] args) {
        System.out.println(sameXo("xxxooo"));
    }

    public static boolean sameXo(String XO) {
        boolean isSameCount = false;
        int totalx = 0;
        int totalo = 0;
        for (int i = 0; i < XO.length(); i++) {
            if (Character.toLowerCase(XO.charAt(i)) == 'x') {
                totalx++;
            }
            if (Character.toLowerCase(XO.charAt(i)) == 'o') {
                totalo++;
            }
        }
        if (totalx == totalo) {
            isSameCount = true;
        }
        return totalx == totalo;
    }


}
