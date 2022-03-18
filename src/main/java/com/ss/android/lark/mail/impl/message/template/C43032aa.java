package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.C41816b;
import java.util.Locale;
import org.apache.commons.text.C69981e;

/* renamed from: com.ss.android.lark.mail.impl.message.template.aa */
public class C43032aa {
    /* renamed from: a */
    public static String m171186a() {
        String str;
        Locale m = C41816b.m166115a().mo150146m();
        if (m == null || m.getLanguage() == null) {
            str = null;
        } else {
            str = m.getLanguage().toLowerCase();
        }
        if (TextUtils.isEmpty(str)) {
            return "en";
        }
        return str;
    }

    /* renamed from: d */
    public static String m171192d(String str) {
        return C69981e.m268410c(str);
    }

    /* renamed from: e */
    public static String m171193e(String str) {
        return C69981e.m268408a(str);
    }

    /* renamed from: a */
    static String m171187a(String str) {
        return "$" + str + "$";
    }

    /* renamed from: b */
    public static String m171190b(String str) {
        return "<!" + str + "!>";
    }

    /* renamed from: c */
    public static String m171191c(String str) {
        return "<!/" + str + "!>";
    }

    /* renamed from: a */
    public static String m171188a(String str, int i, String str2) {
        String b = m171190b(str2);
        int indexOf = str.indexOf(b, i);
        int indexOf2 = str.indexOf(m171191c(str2), i);
        if (indexOf < 0 || indexOf2 <= 0) {
            return "";
        }
        return str.substring(indexOf + b.length(), indexOf2);
    }

    /* renamed from: a */
    public static boolean m171189a(char[] cArr, int i, char[] cArr2) {
        if (i >= cArr.length - 2) {
            return false;
        }
        for (int i2 = 0; i2 < cArr2.length; i2++) {
            if (cArr[i + i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
