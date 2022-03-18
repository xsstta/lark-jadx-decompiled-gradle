package com.bytedance.bae.base;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
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

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.bae.base.Logging$1 */
    public static /* synthetic */ class C35011 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$bae$base$Logging$Severity;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.bae.base.Logging$Severity[] r0 = com.bytedance.bae.base.Logging.Severity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.bae.base.Logging.C35011.$SwitchMap$com$bytedance$bae$base$Logging$Severity = r0
                com.bytedance.bae.base.Logging$Severity r1 = com.bytedance.bae.base.Logging.Severity.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.bae.base.Logging.C35011.$SwitchMap$com$bytedance$bae$base$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.bae.base.Logging$Severity r1 = com.bytedance.bae.base.Logging.Severity.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.bae.base.Logging.C35011.$SwitchMap$com$bytedance$bae$base$Logging$Severity     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.bae.base.Logging$Severity r1 = com.bytedance.bae.base.Logging.Severity.LS_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.base.Logging.C35011.<clinit>():void");
        }
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
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
    public static void m14755d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* renamed from: e */
    public static void m14756e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    /* renamed from: v */
    public static void m14758v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m14759w(String str, String str2) {
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
    public static void m14757e(String str, String str2, Throwable th) {
        log(Severity.LS_ERROR, str, str2);
        log(Severity.LS_ERROR, str, th.toString());
        log(Severity.LS_ERROR, str, getStackTraceString(th));
    }

    /* renamed from: w */
    public static void m14760w(String str, String str2, Throwable th) {
        log(Severity.LS_WARNING, str, str2);
        log(Severity.LS_WARNING, str, th.toString());
        log(Severity.LS_WARNING, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (loggable != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        } else {
            int i = C35011.$SwitchMap$com$bytedance$bae$base$Logging$Severity[severity.ordinal()];
            if (i == 1) {
                level = Level.SEVERE;
            } else if (i == 2) {
                level = Level.WARNING;
            } else if (i != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            Logger logger = fallbackLogger;
            logger.log(level, str + ": " + str2);
        }
    }
}
