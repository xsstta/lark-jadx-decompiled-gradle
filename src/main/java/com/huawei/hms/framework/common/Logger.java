package com.huawei.hms.framework.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean println = true;

    /* access modifiers changed from: private */
    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }

        public Throwable getCause() {
            Throwable th = this.thisCause;
            if (th == this) {
                return null;
            }
            return th;
        }

        public String getMessage() {
            return this.message;
        }

        public void setCause(Throwable th) {
            this.thisCause = th;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String str = name + ": ";
            if (this.message.startsWith(str)) {
                return this.message;
            }
            return str + this.message;
        }
    }

    private static String complexAppTag(String str) {
        return TAG_NETWORK_SDK_PRE + str;
    }

    private static String complexMsg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return getCallMethodInfo(i);
        }
        return getCallMethodInfo(i) + "|" + str;
    }

    private static String complexTag(String str) {
        return TAG_NETWORKKIT_PRE + str;
    }

    /* renamed from: d */
    public static void m85366d(String str, Object obj) {
        println(3, str, obj);
    }

    /* renamed from: d */
    public static void m85367d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m85368e(String str, Object obj) {
        println(6, str, obj);
    }

    /* renamed from: e */
    public static void m85369e(String str, String str2, Throwable th) {
        if (isAPPLoggable(6)) {
            extLogger.mo82710e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (println) {
            Log.e(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    /* renamed from: e */
    public static void m85370e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    private static void extLogPrintln(int i, String str, String str2) {
        if (i == 2) {
            extLogger.mo82712v(str, str2);
        } else if (i == 3) {
            extLogger.mo82708d(str, str2);
        } else if (i == 4) {
            extLogger.mo82711i(str, str2);
        } else if (i == 5) {
            extLogger.mo82713w(str, str2);
        } else if (i == 6) {
            extLogger.mo82709e(str, str2);
        }
    }

    private static String getCallMethodInfo(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    /* renamed from: i */
    public static void m85371i(String str, Object obj) {
        println(4, str, obj);
    }

    /* renamed from: i */
    public static void m85372i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isAPPLoggable(int i) {
        if (extLogger != null) {
            return Log.isLoggable(TAG_NETWORK_SDK_PRE, i);
        }
        return false;
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, i);
    }

    private static int logPrintln(int i, String str, String str2) {
        if (isAPPLoggable(i)) {
            extLogPrintln(i, complexAppTag(str), complexMsg(str2, 7));
        }
        if (println) {
            return Log.println(i, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3 && isLoggable(i)) {
            logPrintln(i, str, obj == null ? "null" : obj.toString());
        }
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3) {
            if (str2 == null) {
                Log.w(TAG, "format is null, not log");
                return;
            }
            try {
                if (isLoggable(i)) {
                    logPrintln(i, str, StringUtils.format(str2, objArr));
                }
            } catch (IllegalFormatException e) {
                m85376w(TAG, "log format error" + str2, e);
            }
        }
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
        extLogger = extLogger2;
        println = z;
        m85371i(TAG, "logger = " + extLogger2 + z);
    }

    /* renamed from: v */
    public static void m85373v(String str, Object obj) {
        println(2, str, obj);
    }

    /* renamed from: v */
    public static void m85374v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m85375w(String str, Object obj) {
        println(5, str, obj);
    }

    /* renamed from: w */
    public static void m85376w(String str, String str2, Throwable th) {
        if (isAPPLoggable(5)) {
            extLogger.mo82714w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (println) {
            Log.w(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    /* renamed from: w */
    public static void m85377w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
