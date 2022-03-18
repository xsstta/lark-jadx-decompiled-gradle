package bytedance.p052c;

import android.os.Build;
import bytedance.p050a.C1673b;

/* renamed from: bytedance.c.a */
public class C1680a {
    /* renamed from: a */
    public static boolean m7444a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m7443a(int i) {
        if (C1673b.m7425a().f5696a != null) {
            C1673b.m7425a().f5696a.mo8553a(i);
        }
    }

    /* renamed from: a */
    public static String m7442a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }
}
