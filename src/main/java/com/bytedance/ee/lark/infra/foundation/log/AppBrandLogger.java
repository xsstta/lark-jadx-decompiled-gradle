package com.bytedance.ee.lark.infra.foundation.log;

import android.text.TextUtils;
import android.util.Log;

public class AppBrandLogger {
    private static ILogger sFeedbackLogger = null;
    private static ILogger sLogger = null;
    private static boolean sLoggerDisable = true;
    private static boolean sShowMoreLogInfo;

    public interface ILogger {
        void flush();

        void logD(String str, String str2);

        void logE(String str, String str2);

        void logE(String str, String str2, Throwable th);

        void logI(String str, String str2);

        void logW(String str, String str2);
    }

    public static boolean debug() {
        return sShowMoreLogInfo;
    }

    public static boolean isShowMoreLogInfo() {
        return sShowMoreLogInfo;
    }

    public static void flush() {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.flush();
        }
    }

    private static void updateLoggerEnableState() {
        boolean z;
        if (sLogger == null && sFeedbackLogger == null) {
            z = true;
        } else {
            z = false;
        }
        sLoggerDisable = z;
    }

    public static void registerFeedbackLogger(ILogger iLogger) {
        sFeedbackLogger = iLogger;
        updateLoggerEnableState();
    }

    public static void registerLogger(ILogger iLogger) {
        sLogger = iLogger;
        updateLoggerEnableState();
    }

    public static void setShowMoreLogInfo(boolean z) {
        sShowMoreLogInfo = z;
        m52830i("AppBrandLogger", "setShowMoreLogInfo:", Boolean.valueOf(z));
    }

    private static String createLog(Object[] objArr) {
        String str;
        int i;
        String str2;
        if (objArr == null) {
            return "emptyLog";
        }
        StringBuilder sb = new StringBuilder();
        if (sShowMoreLogInfo) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 2) {
                str2 = stackTrace[2].getFileName();
                str = stackTrace[2].getMethodName();
                i = stackTrace[2].getLineNumber();
            } else {
                str = "unknown";
                str2 = "unknown file";
                i = -1;
            }
            sb.append(str);
            sb.append("(");
            sb.append(str2);
            sb.append(":");
            sb.append(i);
            sb.append(") ");
        }
        for (Object obj : objArr) {
            sb.append(" ");
            if (obj != null) {
                sb.append(obj);
            } else {
                sb.append("null");
            }
        }
        return sb.toString();
    }

    private static String formatTag(String str) {
        if (TextUtils.isEmpty(str)) {
            return "tma";
        }
        String str2 = "tma_";
        if (sShowMoreLogInfo) {
            Thread currentThread = Thread.currentThread();
            str2 = currentThread.toString() + "[" + currentThread.getId() + "]" + str2;
        }
        if (str.startsWith(str2)) {
            return str;
        }
        return str2 + str;
    }

    /* renamed from: d */
    public static void m52828d(String str, Object... objArr) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logD(formatTag, createLog);
            }
            if (sFeedbackLogger != null) {
                sFeedbackLogger.logD(formatTag(formatTag), createLog(objArr));
            }
        } else if (sShowMoreLogInfo) {
            Log.d(formatTag(str), createLog(objArr));
        }
    }

    /* renamed from: i */
    public static void m52830i(String str, Object... objArr) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logI(formatTag, createLog);
            }
            ILogger iLogger2 = sFeedbackLogger;
            if (iLogger2 != null) {
                iLogger2.logI(formatTag, createLog);
            }
        } else if (sShowMoreLogInfo) {
            Log.i(formatTag(str), createLog(objArr));
        }
    }

    /* renamed from: w */
    public static void m52831w(String str, Object... objArr) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logW(formatTag, createLog);
            }
            ILogger iLogger2 = sFeedbackLogger;
            if (iLogger2 != null) {
                iLogger2.logW(formatTag, createLog);
            }
        } else if (sShowMoreLogInfo) {
            Log.w(formatTag(str), createLog(objArr));
        }
    }

    /* renamed from: e */
    public static void m52829e(String str, Object... objArr) {
        boolean z;
        if (objArr == null || objArr.length <= 0 || !(objArr[objArr.length - 1] instanceof Throwable)) {
            z = false;
        } else {
            z = true;
        }
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            String createLog = createLog(objArr);
            if (z) {
                eWithThrowable(formatTag, createLog, (Throwable) objArr[objArr.length - 1]);
                return;
            }
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logE(formatTag, createLog);
            }
            ILogger iLogger2 = sFeedbackLogger;
            if (iLogger2 != null) {
                iLogger2.logE(formatTag, createLog);
            }
        } else if (sShowMoreLogInfo) {
            String createLog2 = createLog(objArr);
            if (z) {
                Log.e(formatTag(str), createLog2, (Throwable) objArr[objArr.length - 1]);
            } else {
                Log.e(formatTag(str), createLog2);
            }
        }
    }

    public static void eWithThrowable(String str, String str2, Throwable th) {
        if (!sLoggerDisable) {
            String formatTag = formatTag(str);
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logE(formatTag, str2, th);
            }
            ILogger iLogger2 = sFeedbackLogger;
            if (iLogger2 != null) {
                iLogger2.logE(formatTag, str2, th);
            }
        } else if (sShowMoreLogInfo) {
            Log.e(formatTag(str), str2, th);
        }
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        int i2 = 0;
        if (!sLoggerDisable) {
            StringBuilder sb = new StringBuilder();
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                while (i2 < length) {
                    sb.append(stackTraceElementArr[i2]);
                    sb.append("\n");
                    i2++;
                }
            }
            String sb2 = sb.toString();
            ILogger iLogger = sLogger;
            if (iLogger != null) {
                iLogger.logE(formatTag(str), sb2);
            }
            ILogger iLogger2 = sFeedbackLogger;
            if (iLogger2 != null) {
                iLogger2.logE(formatTag(str), sb2);
            }
        } else if (sShowMoreLogInfo) {
            StringBuilder sb3 = new StringBuilder();
            if (stackTraceElementArr != null) {
                int length2 = stackTraceElementArr.length;
                while (i2 < length2) {
                    sb3.append(stackTraceElementArr[i2]);
                    sb3.append("\n");
                    i2++;
                }
            }
            Log.e(formatTag(str), sb3.toString());
        }
    }
}
