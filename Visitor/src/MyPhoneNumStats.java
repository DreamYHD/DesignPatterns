import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/17.
 */
public class MyPhoneNumStats implements PhoneNumStats {
    static Set<String>mStrings1 = new HashSet<>();

    @Override
    public int stats(String src) {
        String[]mStrings = src.split("#");
        for (int i = 0; i < mStrings.length; i++) {
            mStrings1.add(mStrings[0]);
        }
        return mStrings.length;
    }

    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        String s;
        while ( (s = mScanner.nextLine())!=""){
            new MyPhoneNumStats().stats(s);
        }
        System.out.println(mStrings1.size());

    }
}
