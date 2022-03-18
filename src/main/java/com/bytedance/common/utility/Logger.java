package com.bytedance.common.utility;

import android.util.Log;

public class Logger {
    private static int mLevel = 4;
    private static ILogWritter sLogWriter = DefaultLogHandler.getInstance();

    private static final class DefaultLogHandler extends ILogWritter {

        /* access modifiers changed from: private */
        public static class SingletonHolder {
            public static final DefaultLogHandler INSTANCE = new DefaultLogHandler();
        }

        private DefaultLogHandler() {
        }

        static DefaultLogHandler getInstance() {
            return SingletonHolder.INSTANCE;
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logD(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logE(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logI(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logV(String str, String str2) {
            Log.v(str, str2);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logW(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logD(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logE(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logI(String str, String str2, Throwable th) {
            Log.i(str, str2, th);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logV(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        @Override // com.bytedance.common.utility.Logger.ILogWritter
        public void logW(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    public static int getLogLevel() {
        return mLevel;
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static void registerLogHandler(ILogWritter iLogWritter) {
        sLogWriter = iLogWritter;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    /* renamed from: d */
    public static void m15166d(String str) {
        m15167d(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: e */
    public static void m15169e(String str) {
        m15170e(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: i */
    public static void m15172i(String str) {
        m15173i(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: k */
    public static void m15175k(String str) {
        m15176k(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: v */
    public static void m15177v(String str) {
        m15178v(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    /* renamed from: w */
    public static void m15180w(String str) {
        m15181w(com.huawei.hms.common.util.Logger.f57967b, str);
    }

    public static abstract class ILogWritter {
        public void logD(String str, String str2) {
        }

        public void logD(String str, String str2, Throwable th) {
        }

        public void logE(String str, String str2) {
        }

        public void logE(String str, String str2, Throwable th) {
        }

        public void logI(String str, String str2) {
        }

        public void logI(String str, String str2, Throwable th) {
        }

        public void logK(String str, String str2) {
        }

        public void logV(String str, String str2) {
        }

        public void logV(String str, String str2, Throwable th) {
        }

        public void logW(String str, String str2) {
        }

        public void logW(String str, String str2, Throwable th) {
        }

        public boolean isLoggable(int i) {
            if (Logger.getLogLevel() <= i) {
                return true;
            }
            return false;
        }
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

    /* renamed from: k */
    public static void m15176k(String str, String str2) {
        if (sLogWriter.isLoggable(3)) {
            sLogWriter.logK(str, str2);
        }
    }

    /* renamed from: d */
    public static void m15167d(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(3)) {
            sLogWriter.logD(str, str2);
        }
    }

    /* renamed from: e */
    public static void m15170e(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(6)) {
            sLogWriter.logE(str, str2);
        }
    }

    /* renamed from: i */
    public static void m15173i(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(4)) {
            sLogWriter.logI(str, str2);
        }
    }

    /* renamed from: v */
    public static void m15178v(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(2)) {
            sLogWriter.logV(str, str2);
        }
    }

    /* renamed from: w */
    public static void m15181w(String str, String str2) {
        if (str2 != null && sLogWriter.isLoggable(5)) {
            sLogWriter.logW(str, str2);
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
            m15178v(str, sb.toString());
        }
    }

    /* renamed from: d */
    public static void m15168d(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(3)) {
            sLogWriter.logD(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m15171e(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(6)) {
            sLogWriter.logE(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m15174i(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(4)) {
            sLogWriter.logI(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m15179v(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(2)) {
            sLogWriter.logV(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m15182w(String str, String str2, Throwable th) {
        if (!(str2 == null && th == null) && sLogWriter.isLoggable(5)) {
            sLogWriter.logW(str, str2, th);
        }
    }
}
