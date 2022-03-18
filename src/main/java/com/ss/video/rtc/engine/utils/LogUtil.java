package com.ss.video.rtc.engine.utils;

import android.os.Environment;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public class LogUtil {
    private static String sDeviceID = null;
    private static String sLogDir = getDefaultLogDir();
    private static IRtcEngineEventHandler.RtcLogLevel sLogLevel = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO;
    private static AtomicReference<LoggerSink> sLoggerSink = new AtomicReference<>();

    public interface LoggerSink {
        void onLoggerMessage(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th);
    }

    public static void setDebug(boolean z) {
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static String getLogDir() {
        return sLogDir;
    }

    public static IRtcEngineEventHandler.RtcLogLevel getLogLevel() {
        return sLogLevel;
    }

    private static LoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    private static String getDefaultLogDir() {
        try {
            return Environment.getExternalStorageDirectory() + File.separator + "RTCEngine" + File.separator + "Log" + File.separator + "logs";
        } catch (Exception unused) {
            return "/sdcard/RTCEngine/Log" + File.separator + "logs";
        }
    }

    private static String getTraceInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length < 3) {
            return "";
        }
        stringBuffer.append("[");
        stringBuffer.append("ThreadName:");
        stringBuffer.append(Thread.currentThread().getName());
        stringBuffer.append("] ");
        stringBuffer.append("[");
        stringBuffer.append(stackTrace[2].getFileName());
        stringBuffer.append(":");
        stringBuffer.append(stackTrace[2].getLineNumber());
        stringBuffer.append("] ");
        stringBuffer.append("[");
        stringBuffer.append("Func:");
        stringBuffer.append(stackTrace[2].getMethodName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogLevel(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel) {
        sLogLevel = rtcLogLevel;
    }

    public static void setLogDir(String str) {
        sLogDir = str + File.separator + "logs";
    }

    public static void setLoggerSink(LoggerSink loggerSink) {
        if (loggerSink != null) {
            sLoggerSink.set(loggerSink);
        } else {
            sLoggerSink.compareAndSet(getLoggerSink(), null);
        }
    }

    /* renamed from: d */
    public static void m257129d(String str, String str2) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s] %s [msg:%s]", "DEBUG", getTraceInfo(), str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG, String.format("[%s:%s]:%s", "BYTERTC", str, format), null);
        }
    }

    /* renamed from: e */
    public static void m257130e(String str, String str2) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s] %s [msg:%s]", "ERROR", getTraceInfo(), str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR, String.format("[%s:%s]:%s", "BYTERTC", str, format), null);
        }
    }

    /* renamed from: i */
    public static void m257132i(String str, String str2) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s] %s [msg:%s]", "INFO", getTraceInfo(), str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO, String.format("[%s:%s]:%s", "BYTERTC", str, format), null);
        }
    }

    /* renamed from: w */
    public static void m257133w(String str, String str2) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s] %s [msg:%s]", "WARNING", getTraceInfo(), str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING, String.format("[%s:%s]:%s", "BYTERTC", str, format), null);
        }
    }

    private static void notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
        LoggerSink loggerSink;
        if (sLoggerSink != null && (loggerSink = getLoggerSink()) != null) {
            loggerSink.onLoggerMessage(rtcLogLevel, str, th);
        }
    }

    /* renamed from: e */
    public static void m257131e(String str, String str2, Throwable th) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s][msg:%s]", "ERROR", str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR, String.format("[%s:%s]:%s", "BYTERTC", str, format), th);
        }
    }

    /* renamed from: w */
    public static void m257134w(String str, String str2, Throwable th) {
        if (IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING.compareTo((Enum) sLogLevel) >= 0) {
            String format = String.format("[%s][msg:%s]", "WARNING", str2);
            notifyLoggerSinks(IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING, String.format("[%s:%s]:%s", "BYTERTC", str, format), th);
        }
    }
}
