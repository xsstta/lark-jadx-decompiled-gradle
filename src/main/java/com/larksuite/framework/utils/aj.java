package com.larksuite.framework.utils;

import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public final class aj {

    /* renamed from: a */
    static final String[] f64842a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f64843b = new ThreadLocal<StringBuilder>() {
        /* class com.larksuite.framework.utils.aj.C262581 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder(8192);
        }
    };

    /* renamed from: c */
    private static BitSet f64844c = new BitSet(DynamicModule.f58006b);

    /* renamed from: a */
    private static boolean m95017a(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F');
    }

    /* renamed from: a */
    public static boolean m95018a(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    static {
        for (int i = 97; i <= 122; i++) {
            f64844c.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f64844c.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f64844c.set(i3);
        }
        f64844c.set(43);
        f64844c.set(45);
        f64844c.set(95);
        f64844c.set(46);
        f64844c.set(42);
    }

    /* renamed from: b */
    public static boolean m95021b(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m95018a(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m95023c(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m95024d(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m95019a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (!f64844c.get(charAt)) {
                if (charAt != '%' || i + 2 >= str.length()) {
                    return true;
                }
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                i = i2 + 1;
                char charAt3 = str.charAt(i);
                if (!m95017a(charAt2) || !m95017a(charAt3)) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m95022b(String str, String str2) {
        return !m95020a(str, str2);
    }

    /* renamed from: a */
    public static String m95015a(Collection collection, String str) {
        return m95016a(collection.iterator(), str);
    }

    /* renamed from: a */
    public static String m95016a(Iterator it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(obj);
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m95020a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }
}
