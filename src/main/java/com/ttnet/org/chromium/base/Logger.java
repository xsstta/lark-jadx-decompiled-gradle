package com.ttnet.org.chromium.base;

import android.util.Log;

public class Logger {
    static int mLevel = 4;

    public static int getLogLevel() {
        return mLevel;
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    /* renamed from: d */
    public static void m264567d(String str) {
        m264568d(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: e */
    public static void m264570e(String str) {
        m264571e(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: i */
    public static void m264573i(String str) {
        m264574i(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: v */
    public static void m264576v(String str) {
        m264577v(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: w */
    public static void m264579w(String str) {
        m264580w(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    public static void alertErrorInfo(String str) {
        if (debug()) {
            throw new IllegalStateException(str);
        }
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void throwException(Throwable th) {
        if (th != null) {
            th.printStackTrace();
            if (debug()) {
                throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
            }
        }
    }

    /* renamed from: d */
    public static void m264568d(String str, String str2) {
        if (str2 != null && mLevel <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m264571e(String str, String str2) {
        if (str2 != null && mLevel <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m264574i(String str, String str2) {
        if (str2 != null && mLevel <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: v */
    public static void m264577v(String str, String str2) {
        if (str2 != null && mLevel <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m264580w(String str, String str2) {
        if (str2 != null && mLevel <= 5) {
            Log.w(str, str2);
        }
    }

    public static void st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(getSimpleClassName(stackTrace[i2].getClassName()));
                sb.append(".");
                sb.append(stackTrace[i2].getMethodName());
            }
            m264577v(str, sb.toString());
        }
    }

    /* renamed from: d */
    public static void m264569d(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && mLevel <= 3) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m264572e(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && mLevel <= 6) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m264575i(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && mLevel <= 4) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m264578v(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && mLevel <= 2) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m264581w(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && mLevel <= 5) {
            Log.w(str, str2, th);
        }
    }
}
