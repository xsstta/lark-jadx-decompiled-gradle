package com.ss.android.ugc.effectmanager.common;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3053h.C60539r;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.d */
public class C60512d {
    /* renamed from: f */
    private static boolean m235171f(String str) {
        return Pattern.matches("^[0-9(.|_)]+", str);
    }

    /* renamed from: b */
    public static String m235167b(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int a = C60516g.m235204a(str, "\\.model|_model|\\.dat$");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, a);
        }
        return "1.0";
    }

    /* renamed from: c */
    public static String m235168c(String str) {
        if (!str.contains("md5")) {
            return null;
        }
        try {
            return str.substring(str.indexOf("md5") + 3, str.lastIndexOf("_model"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static int m235170e(String str) {
        if (str.contains("_size")) {
            return str.lastIndexOf("_size");
        }
        return C60516g.m235204a(str, "\\.model|_model|\\.dat$");
    }

    /* renamed from: a */
    public static String m235164a(ModelInfo modelInfo) {
        return modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + modelInfo.getMD5() + ".model";
    }

    /* renamed from: d */
    public static int m235169d(String str) {
        int i;
        if (!str.contains("size")) {
            return 0;
        }
        int lastIndexOf = str.lastIndexOf("size");
        if (str.contains("md5")) {
            i = C60516g.m235204a(str, "_md5");
        } else {
            i = C60516g.m235204a(str, "\\.model|_model|\\.dat$");
        }
        if (lastIndexOf >= i) {
            return -1;
        }
        try {
            return Integer.parseInt(str.substring(lastIndexOf + 4, i));
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m235165a(String str) {
        try {
            int lastIndexOf = str.lastIndexOf("/");
            int lastIndexOf2 = str.lastIndexOf("_v");
            int i = lastIndexOf + 1;
            if (C60539r.m235323a(str, i, lastIndexOf2)) {
                int length = str.length();
                int e = m235170e(str);
                if (e > 0) {
                    length = e;
                }
                if (!m235171f(str.substring(lastIndexOf2 + 2, length))) {
                    return str;
                }
                return str.substring(i, lastIndexOf2);
            }
            int min = Math.min(C60516g.m235204a(str, "\\.model|_model|\\.dat$"), str.length());
            if (min > 0) {
                return str.substring(i, min);
            }
            return str.substring(i, str.length());
        } catch (Exception e2) {
            EPLog.m235177a("ModelNameProcessor", "getNameOfModel failed!", e2);
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m235166a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return TextUtils.equals(str.substring(0, str.indexOf(".")), str2.substring(0, str.indexOf(".")));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
