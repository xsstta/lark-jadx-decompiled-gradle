package com.ttnet.org.chromium.base;

import java.util.Locale;

public class Log {
    private Log() {
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            } else {
                i++;
            }
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    public static String normalizeTag(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    /* renamed from: d */
    public static void m264548d(String str, String str2) {
        debug(str, str2, new Object[0]);
    }

    public static boolean isLoggable(String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    /* renamed from: v */
    public static void m264558v(String str, String str2) {
        verbose(str, str2, new Object[0]);
    }

    private static String formatLog(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    private static String formatLogWithStack(String str, Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, objArr);
    }

    /* renamed from: d */
    public static void m264549d(String str, String str2, Object obj) {
        debug(str, str2, obj);
    }

    /* renamed from: v */
    public static void m264559v(String str, String str2, Object obj) {
        verbose(str, str2, obj);
    }

    private static void debug(String str, String str2, Object... objArr) {
        String formatLogWithStack = formatLogWithStack(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.d(normalizeTag(str), formatLogWithStack, throwableToLog);
        } else {
            android.util.Log.d(normalizeTag(str), formatLogWithStack);
        }
    }

    /* renamed from: e */
    public static void m264556e(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.e(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.e(normalizeTag(str), formatLog);
        }
    }

    /* renamed from: i */
    public static void m264557i(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.i(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.i(normalizeTag(str), formatLog);
        }
    }

    private static void verbose(String str, String str2, Object... objArr) {
        String formatLogWithStack = formatLogWithStack(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.v(normalizeTag(str), formatLogWithStack, throwableToLog);
        } else {
            android.util.Log.v(normalizeTag(str), formatLogWithStack);
        }
    }

    /* renamed from: w */
    public static void m264566w(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.w(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.w(normalizeTag(str), formatLog);
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag(str), formatLog);
        }
    }

    /* renamed from: d */
    public static void m264550d(String str, String str2, Object obj, Object obj2) {
        debug(str, str2, obj, obj2);
    }

    /* renamed from: v */
    public static void m264560v(String str, String str2, Object obj, Object obj2) {
        verbose(str, str2, obj, obj2);
    }

    /* renamed from: d */
    public static void m264551d(String str, String str2, Object obj, Object obj2, Object obj3) {
        debug(str, str2, obj, obj2, obj3);
    }

    /* renamed from: v */
    public static void m264561v(String str, String str2, Object obj, Object obj2, Object obj3) {
        verbose(str, str2, obj, obj2, obj3);
    }

    /* renamed from: d */
    public static void m264552d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        debug(str, str2, obj, obj2, obj3, obj4);
    }

    /* renamed from: v */
    public static void m264562v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        verbose(str, str2, obj, obj2, obj3, obj4);
    }

    /* renamed from: d */
    public static void m264553d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: v */
    public static void m264563v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: d */
    public static void m264554d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: v */
    public static void m264564v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: d */
    public static void m264555d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* renamed from: v */
    public static void m264565v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }
}
