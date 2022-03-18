package com.bytedance.realx.base;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import java.io.PrintWriter;
import java.io.StringWriter;

public class RXLogging {
    private static Severity loggableSeverity = null;
    private static volatile boolean loggingEnabled = true;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (RXLogging.class) {
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
        }
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static void m74903d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* renamed from: e */
    public static void m74904e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    /* renamed from: v */
    public static void m74906v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m74907w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(DynamicModule.f58006b),
        TRACE_TIMER(MediaPlayer.MEDIA_PLAYER_OPTION_APPID),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        private TraceLevel(int i) {
            this.level = i;
        }
    }

    /* renamed from: e */
    public static void m74905e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        }
    }

    /* renamed from: w */
    public static void m74908w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }
}
