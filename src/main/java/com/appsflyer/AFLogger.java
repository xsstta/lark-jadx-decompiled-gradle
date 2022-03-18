package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.C2015ai;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ι */
    private static long f6729 = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ι */
        private int f6731;

        public final int getLevel() {
            return this.f6731;
        }

        private LogLevel(int i) {
            this.f6731 = i;
        }
    }

    public static void resetDeltaTime() {
        f6729 = System.currentTimeMillis();
    }

    /* renamed from: ι */
    private static boolean m8737() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afWarnLog(String str) {
        m8734(str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: ǃ */
    private static boolean m8732(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    public static void afDebugLog(String str) {
        if (m8732(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_5.2.0", m8736(str, false));
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067(null, "D", m8736(str, true));
    }

    public static void afRDLog(String str) {
        if (m8732(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_5.2.0", m8736(str, false));
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067(null, "V", m8736(str, true));
    }

    /* renamed from: ı */
    static void m8731(String str) {
        if (!m8737()) {
            Log.d("AppsFlyer_5.2.0", m8736(str, false));
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067(null, "F", str);
    }

    /* renamed from: ɩ */
    static void m8734(String str) {
        if (m8732(LogLevel.WARNING)) {
            Log.w("AppsFlyer_5.2.0", m8736(str, false));
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067(null, "W", m8736(str, true));
    }

    /* renamed from: ɩ */
    private static String m8733(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3));
    }

    public static void afErrorLog(String str, Throwable th) {
        m8735(str, th, false);
    }

    public static void afInfoLog(String str, boolean z) {
        if (m8732(LogLevel.INFO)) {
            Log.i("AppsFlyer_5.2.0", m8736(str, false));
        }
        if (z) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067(null, "I", m8736(str, true));
        }
    }

    /* renamed from: ι */
    private static String m8736(String str, boolean z) {
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(m8733(System.currentTimeMillis() - f6729));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m8735(str, th, z);
    }

    /* renamed from: ɩ */
    private static void m8735(String str, Throwable th, boolean z) {
        String str2;
        StackTraceElement[] stackTraceElementArr;
        String[] strArr;
        if (m8732(LogLevel.ERROR) && z) {
            Log.e("AppsFlyer_5.2.0", m8736(str, false), th);
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai aiVar = C2015ai.f6878;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            str2 = th.getMessage();
        } else {
            str2 = cause.getMessage();
        }
        if (cause == null) {
            stackTraceElementArr = th.getStackTrace();
        } else {
            stackTraceElementArr = cause.getStackTrace();
        }
        if (stackTraceElementArr == null) {
            strArr = new String[]{str2};
        } else {
            String[] strArr2 = new String[(stackTraceElementArr.length + 1)];
            strArr2[0] = str2;
            for (int i = 1; i < stackTraceElementArr.length; i++) {
                strArr2[i] = stackTraceElementArr[i].toString();
            }
            strArr = strArr2;
        }
        aiVar.mo10067(ApiHandler.API_CALLBACK_EXCEPTION, simpleName, strArr);
    }
}
