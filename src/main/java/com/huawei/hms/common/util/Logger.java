package com.huawei.hms.common.util;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONException;

public class Logger {

    /* renamed from: a */
    public static final boolean f57966a = false;

    /* renamed from: b */
    public static final String f57967b = "Logger";

    /* renamed from: c */
    public static final String f57968c = "|";

    /* renamed from: d */
    public static final int f57969d = 8;

    /* renamed from: e */
    public static final int f57970e = 20;

    /* renamed from: f */
    public static final String f57971f = "dynamic-api_";

    /* renamed from: a */
    public static int m85267a(int i, String str, String str2) {
        return Log.println(i, m85269a(str), m85270a(str2, 7));
    }

    /* renamed from: a */
    public static String m85268a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Process.myPid() + "-" + Process.myTid() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    /* renamed from: a */
    public static String m85269a(String str) {
        return f57971f + str;
    }

    /* renamed from: a */
    public static String m85270a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return m85268a(i);
        }
        return m85268a(i) + "|" + str;
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 1) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    /* renamed from: d */
    public static void m85272d(String str, Object obj) {
        println(3, str, obj);
    }

    /* renamed from: d */
    public static void m85273d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m85274e(String str, Object obj) {
        println(6, str, obj);
    }

    /* renamed from: e */
    public static void m85275e(String str, String str2, Throwable th) {
        Log.e(m85269a(str), m85270a(str2, 5), m85271a(th));
    }

    /* renamed from: e */
    public static void m85276e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: i */
    public static void m85277i(String str, Object obj) {
        println(4, str, obj);
    }

    /* renamed from: i */
    public static void m85278i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(f57971f, i);
    }

    /* renamed from: v */
    public static void m85279v(String str, Object obj) {
        println(2, str, obj);
    }

    /* renamed from: v */
    public static void m85280v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m85281w(String str, Object obj) {
        println(5, str, obj);
    }

    /* renamed from: w */
    public static void m85282w(String str, String str2, Throwable th) {
        Log.w(m85269a(str), m85270a(str2, 5), m85271a(th));
    }

    /* renamed from: w */
    public static void m85283w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    /* renamed from: a */
    public static Throwable m85271a(Throwable th) {
        if (Log.isLoggable(f57971f, 3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        int i = 20;
        if ((th instanceof IOException) || (th instanceof JSONException)) {
            i = 8;
        }
        C23519a aVar = new C23519a(th, null);
        StackTraceElement[] stackTrace = aVar.getStackTrace();
        if (stackTrace.length > i) {
            aVar.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
        } else {
            aVar.setStackTrace(stackTrace);
        }
        aVar.mo82600a(anonymizeMessage(th.getMessage()));
        Throwable cause = th.getCause();
        C23519a aVar2 = aVar;
        while (cause != null) {
            C23519a aVar3 = new C23519a(cause, null);
            aVar3.mo82600a(anonymizeMessage(cause.getMessage()));
            aVar2.f57974c = aVar3;
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.common.util.Logger$a */
    public static class C23519a extends Throwable {

        /* renamed from: a */
        public static final long f57972a = 7129050843360571879L;

        /* renamed from: b */
        public String f57973b;

        /* renamed from: c */
        public Throwable f57974c;

        /* renamed from: d */
        public Throwable f57975d;

        public C23519a(Throwable th) {
            this.f57975d = th;
        }

        /* renamed from: a */
        private void m85285a(Throwable th) {
            this.f57974c = th;
        }

        /* renamed from: a */
        public void mo82600a(String str) {
            this.f57973b = str;
        }

        public Throwable getCause() {
            Throwable th = this.f57974c;
            if (th == this) {
                return null;
            }
            return th;
        }

        public String getMessage() {
            return this.f57973b;
        }

        public String toString() {
            Throwable th = this.f57975d;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f57973b == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f57973b.startsWith(str)) {
                return this.f57973b;
            }
            return str + this.f57973b;
        }

        public /* synthetic */ C23519a(Throwable th, C23520b bVar) {
            this.f57975d = th;
        }
    }

    public static void println(int i, String str, Object obj) {
        String str2;
        if (i >= 3 && Log.isLoggable(f57971f, i)) {
            if (obj == null) {
                str2 = "null";
            } else {
                str2 = obj.toString();
            }
            m85267a(i, str, str2);
        }
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3) {
            if (str2 == null) {
                Log.w(f57967b, "format is null, not log");
                return;
            }
            try {
                if (Log.isLoggable(f57971f, i)) {
                    m85267a(i, str, format(str2, objArr));
                }
            } catch (IllegalFormatException e) {
                m85282w(f57967b, "log format error" + str2, e);
            }
        }
    }
}
