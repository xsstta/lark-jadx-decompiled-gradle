package com.ss.android.vesdk;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ttve.nativePort.TELogcat;

/* renamed from: com.ss.android.vesdk.ab */
public class C63929ab {

    /* renamed from: a */
    private static String f161410a = "VESDK-";

    /* renamed from: b */
    private static String f161411b = "monitorInfo";

    /* renamed from: c */
    private static byte f161412c = 7;

    /* renamed from: a */
    public static byte m250969a(byte b) {
        if (b == 1) {
            return 1;
        }
        if (b == 3) {
            return 2;
        }
        if (b == 7) {
            return 4;
        }
        if (b != 15) {
            return b != 31 ? (byte) 0 : 16;
        }
        return 8;
    }

    /* renamed from: a */
    public static byte m250968a() {
        return f161412c;
    }

    /* renamed from: c */
    public static int m250977c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    /* renamed from: b */
    public static String m250975b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    /* renamed from: d */
    public static String m250979d() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /* renamed from: b */
    public static void m250976b(String str, String str2) {
        if ((f161412c & 8) != 0) {
            TELogcat.Log((byte) 8, f161410a + str, str2);
        }
    }

    /* renamed from: d */
    public static void m250980d(String str, String str2) {
        if ((f161412c & 1) != 0) {
            TELogcat.Log((byte) 1, f161410a + str, str2);
        }
    }

    /* renamed from: e */
    public static void m250981e(String str, String str2) {
        if ((f161412c & 16) != 0) {
            TELogcat.Log((byte) 16, f161410a + str, str2);
        }
    }

    /* renamed from: c */
    public static void m250978c(String str, String str2) {
        if ((f161412c & 2) != 0) {
            TELogcat.Log((byte) 2, f161410a + str, str2);
        }
    }

    /* renamed from: a */
    public static void m250972a(String str, byte b) {
        if (!TextUtils.isEmpty(str)) {
            f161410a += str + "-";
        }
        f161412c = b;
        TELogcat.setLogLevel(m250969a(b));
    }

    /* renamed from: a */
    public static void m250973a(String str, Object obj) {
        if ((f161412c & 8) != 0) {
            String str2 = f161411b;
            Log.d(str2, str + " = " + obj.toString());
        }
    }

    /* renamed from: a */
    public static void m250974a(String str, String str2) {
        if ((f161412c & 4) != 0) {
            TELogcat.Log((byte) 4, f161410a + str, str2);
        }
    }

    /* renamed from: com.ss.android.vesdk.ab$a */
    public static class C63930a {

        /* renamed from: a */
        String f161413a;

        /* renamed from: b */
        String f161414b;

        /* renamed from: c */
        String f161415c;

        public C63930a(String str, Object obj, String str2) {
            this.f161413a = str;
            this.f161414b = String.valueOf(obj);
            this.f161415c = str2;
        }
    }

    /* renamed from: a */
    public static void m250971a(Class<?> cls, String str, Throwable th) {
        if ((f161412c & 1) != 0) {
            TELogcat.Log((byte) 1, f161410a + cls.getSimpleName(), str + " Throwable msg is : " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static String m250970a(String str, String str2, C63930a... aVarArr) {
        StringBuilder sb = new StringBuilder(String.format("%s; (Msg): {%s}; ", str, str2));
        if (aVarArr != null) {
            for (C63930a aVar : aVarArr) {
                if (aVar != null) {
                    sb.append(String.format("(%s): {%s}[%s], ", aVar.f161413a, aVar.f161414b, aVar.f161415c));
                }
            }
        }
        sb.append("_for_auto_analysis_");
        return sb.toString();
    }
}
