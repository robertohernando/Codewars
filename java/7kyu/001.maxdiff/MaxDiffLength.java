import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * MaxDiffLength
 */
public class MaxDiffLength {

    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(s1, s2));
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        int max = -1;
        int long1 = a1.length;
        int long2 = a2.length;

        if (long1 != 0 && long2 != 0) {
            for (int i = 0; i < long1; i++) {
                for (int j = 0; j < long2; j++) {
                    max = Math.max(
                        Math.abs(
                            a1[i].length() - a2[j].length()
                            )
                            , max);
                }
            }
        }
    
        return max;
    }

    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }    
}