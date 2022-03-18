package com.ss.android.lark.log;

import android.os.Build;
import com.ss.android.lark.log.alog.ALogger;
import com.ss.android.lark.log.alog.LarkALogService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Log {
    private static String _logTag = "lark";
    private static List<AbstractC41686a> errorHooks = new CopyOnWriteArrayList();
    private static AbstractC41701c logger = new C41705e();
    private static C41702d sLogConfig;

    /* renamed from: com.ss.android.lark.log.Log$a */
    public interface AbstractC41686a {
        /* renamed from: a */
        void mo136546a(String str, String str2, Throwable th, boolean z);
    }

    public static void flushDiskLog() {
    }

    public static String getDefaultTag() {
        return _logTag;
    }

    public static C41702d getLogConfig() {
        return sLogConfig;
    }

    public static void addErrorHook(AbstractC41686a aVar) {
        errorHooks.add(aVar);
    }

    /* renamed from: d */
    public static void m165378d(String str) {
        m165379d(_logTag, str);
    }

    /* renamed from: e */
    public static void m165382e(String str) {
        m165383e(_logTag, str);
    }

    /* renamed from: i */
    public static void m165388i(String str) {
        m165389i(_logTag, str);
    }

    public static boolean removeErrorHook(AbstractC41686a aVar) {
        return errorHooks.remove(aVar);
    }

    /* renamed from: v */
    public static void m165392v(String str) {
        m165393v(_logTag, str);
    }

    /* renamed from: w */
    public static void m165396w(String str) {
        m165397w(_logTag, str);
    }

    public static void wtf(String str) {
        wtf(_logTag, str);
    }

    public static void init(C41702d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                NativeHandler.m165401a().start();
            } catch (Exception e) {
                android.util.Log.e("NativeHandler", "NativeHandler start err", new RuntimeException(e));
                e.printStackTrace();
            }
        }
        sLogConfig = dVar;
        if (dVar.f105905b != 4) {
            logger = new C41705e();
        } else {
            logger = new ALogger(dVar);
        }
        LarkALogService.m165477f();
    }

    public static void json(String str, String str2) {
        json(_logTag, str, str2);
    }

    public static void xml(String str, String str2) {
        xml(_logTag, str, str2);
    }

    /* renamed from: d */
    public static void m165379d(String str, String str2) {
        logger.mo149901c(str, str2);
    }

    /* renamed from: e */
    public static void m165383e(String str, String str2) {
        m165385e(str, str2, null, false);
    }

    /* renamed from: i */
    public static void m165389i(String str, String str2) {
        logger.mo149895a(str, str2);
    }

    /* renamed from: v */
    public static void m165393v(String str, String str2) {
        logger.mo149898b(str, str2);
    }

    /* renamed from: w */
    public static void m165397w(String str, String str2) {
        logger.mo149903d(str, str2);
    }

    public static void wtf(String str, String str2) {
        logger.mo149905e(str, str2);
    }

    public static void debug(String str, Map<String, String> map) {
        debug(str, "", map);
    }

    public static void error(String str, Map<String, String> map) {
        error(str, "", map);
    }

    public static void fatal(String str, Map<String, String> map) {
        fatal(str, "", map);
    }

    public static void info(String str, Map<String, String> map) {
        info(str, "", map);
    }

    public static void verbose(String str, Map<String, String> map) {
        verbose(str, "", map);
    }

    public static void warn(String str, Map<String, String> map) {
        warn(str, "", map);
    }

    /* renamed from: d */
    public static void m165381d(String str, Throwable th) {
        m165380d(_logTag, str, th);
    }

    /* renamed from: i */
    public static void m165391i(String str, Throwable th) {
        m165390i(_logTag, str, th);
    }

    /* renamed from: v */
    public static void m165395v(String str, Throwable th) {
        m165394v(_logTag, str, th);
    }

    /* renamed from: w */
    public static void m165399w(String str, Throwable th) {
        m165398w(_logTag, str, th);
    }

    public static void wtf(String str, Throwable th) {
        wtf(_logTag, str, th);
    }

    /* renamed from: e */
    public static void m165386e(String str, Throwable th) {
        m165387e(str, th, false);
    }

    public static void debug(String str, String str2, Map<String, String> map) {
        debug(str, _logTag, str2, map);
    }

    public static void error(String str, String str2, Map<String, String> map) {
        error(str, _logTag, str2, map);
    }

    public static void fatal(String str, String str2, Map<String, String> map) {
        fatal(str, _logTag, str2, map);
    }

    public static void info(String str, String str2, Map<String, String> map) {
        info(str, _logTag, str2, map);
    }

    public static void verbose(String str, String str2, Map<String, String> map) {
        verbose(str, _logTag, str2, map);
    }

    public static void warn(String str, String str2, Map<String, String> map) {
        warn(str, _logTag, str2, map);
    }

    public static void json(String str, String str2, String str3) {
        logger.mo149896a(str, str2, str3);
    }

    public static void xml(String str, String str2, String str3) {
        logger.mo149899b(str, str2, str3);
    }

    /* renamed from: d */
    public static void m165380d(String str, String str2, Throwable th) {
        logger.mo149904d(str, str2, th);
    }

    /* renamed from: e */
    public static void m165384e(String str, String str2, Throwable th) {
        m165385e(str, str2, th, false);
    }

    /* renamed from: i */
    public static void m165390i(String str, String str2, Throwable th) {
        logger.mo149900b(str, str2, th);
    }

    /* renamed from: v */
    public static void m165394v(String str, String str2, Throwable th) {
        logger.mo149902c(str, str2, th);
    }

    /* renamed from: w */
    public static void m165398w(String str, String str2, Throwable th) {
        logger.mo149906e(str, str2, th);
    }

    public static void wtf(String str, String str2, Throwable th) {
        logger.mo149907f(str, str2, th);
    }

    public static void writeFile(String str, String str2, String str3) {
        if (sLogConfig.f105911h) {
            android.util.Log.d(_logTag + "_" + str + "_" + str2, str3);
        }
        C41696b.m165505a().mo149962a(sLogConfig.mo149967b(), str, str2, str3);
    }

    public static void debug(String str, String[] strArr, Map<String, String> map) {
        debug(str, strArr, "", map);
    }

    public static void error(String str, String[] strArr, Map<String, String> map) {
        error(str, strArr, "", map);
    }

    public static void fatal(String str, String[] strArr, Map<String, String> map) {
        fatal(str, strArr, "", map);
    }

    public static void info(String str, String[] strArr, Map<String, String> map) {
        info(str, strArr, "", map);
    }

    public static void verbose(String str, String[] strArr, Map<String, String> map) {
        verbose(str, strArr, "", map);
    }

    public static void warn(String str, String[] strArr, Map<String, String> map) {
        warn(str, strArr, "", map);
    }

    /* renamed from: e */
    public static void m165387e(String str, Throwable th, boolean z) {
        m165385e(_logTag, str, th, z);
    }

    public static void debug(String str, String str2, String str3, Map<String, String> map) {
        debug(str, new String[]{str2}, str3, map);
    }

    public static void error(String str, String str2, String str3, Map<String, String> map) {
        error(str, new String[]{str2}, str3, map);
    }

    public static void fatal(String str, String str2, String str3, Map<String, String> map) {
        fatal(str, new String[]{str2}, str3, map);
    }

    public static void info(String str, String str2, String str3, Map<String, String> map) {
        info(str, new String[]{str2}, str3, map);
    }

    public static void verbose(String str, String str2, String str3, Map<String, String> map) {
        verbose(str, new String[]{str2}, str3, map);
    }

    public static void warn(String str, String str2, String str3, Map<String, String> map) {
        warn(str, new String[]{str2}, str3, map);
    }

    public static void debug(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.DEBUG.getNumber(), str, strArr, str2, map);
    }

    /* renamed from: e */
    public static void m165385e(String str, String str2, Throwable th, boolean z) {
        logger.mo149897a(str, str2, th);
        for (AbstractC41686a aVar : errorHooks) {
            aVar.mo136546a(str, str2, th, z);
        }
    }

    public static void error(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.ERROR.getNumber(), str, strArr, str2, map);
    }

    public static void fatal(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.ASSERT.getNumber(), str, strArr, str2, map);
    }

    public static void info(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.INFO.getNumber(), str, strArr, str2, map);
    }

    public static void verbose(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.VERBOSE.getNumber(), str, strArr, str2, map);
    }

    public static void warn(String str, String[] strArr, String str2, Map<String, String> map) {
        logger.mo149894a(LogLevel.WARN.getNumber(), str, strArr, str2, map);
    }

    public static void writeFile(String str, String str2, String str3, boolean z) {
        if (sLogConfig.f105911h) {
            android.util.Log.d(_logTag + "_" + str + "_" + str2, str3);
        }
        C41696b.m165505a().mo149963a(sLogConfig.mo149967b(), str, str2, str3, z);
    }
}
