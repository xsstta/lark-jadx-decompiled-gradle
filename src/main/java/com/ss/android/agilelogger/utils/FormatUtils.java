package com.ss.android.agilelogger.utils;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.agilelogger.formatter.AbstractC27510a;
import com.ss.android.agilelogger.formatter.p1255a.C27512b;
import com.ss.android.agilelogger.formatter.p1256b.C27513a;
import com.ss.android.agilelogger.formatter.p1256b.p1257a.C27514a;
import com.ss.android.agilelogger.formatter.p1256b.p1258b.C27516a;
import com.ss.android.agilelogger.formatter.p1256b.p1258b.C27517b;
import com.ss.android.agilelogger.formatter.p1256b.p1259c.C27519a;
import com.ss.android.agilelogger.formatter.p1260c.C27521a;
import com.ss.android.agilelogger.formatter.p1261d.C27523a;
import java.util.concurrent.ConcurrentHashMap;

public class FormatUtils {

    /* renamed from: a */
    private static ConcurrentHashMap<TYPE, AbstractC27510a> f68752a;

    public enum TYPE {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR
    }

    static {
        ConcurrentHashMap<TYPE, AbstractC27510a> concurrentHashMap = new ConcurrentHashMap<>();
        f68752a = concurrentHashMap;
        concurrentHashMap.put(TYPE.MSG, new C27513a());
        f68752a.put(TYPE.JSON, new C27514a());
        f68752a.put(TYPE.BUNDLE, new C27516a());
        f68752a.put(TYPE.INTENT, new C27517b());
        f68752a.put(TYPE.BORDER, new C27512b());
        f68752a.put(TYPE.STACKTRACE, new C27521a());
        f68752a.put(TYPE.THREAD, new C27523a());
        f68752a.put(TYPE.THROWABLE, new C27519a());
    }

    /* renamed from: a */
    public static String m100457a(TYPE type, Intent intent) {
        return ((C27517b) f68752a.get(type)).mo98131a(intent);
    }

    /* renamed from: a */
    public static String m100458a(TYPE type, Bundle bundle) {
        return ((C27516a) f68752a.get(type)).mo98131a(bundle);
    }

    /* renamed from: a */
    public static String m100459a(TYPE type, String str) {
        AbstractC27510a aVar = f68752a.get(type);
        if (aVar == null) {
            return str;
        }
        if (type != TYPE.BORDER) {
            return aVar.mo98131a(str);
        }
        return aVar.mo98131a(new String[]{str});
    }

    /* renamed from: a */
    public static String m100460a(TYPE type, Thread thread) {
        return f68752a.get(type).mo98131a(thread);
    }

    /* renamed from: a */
    public static String m100461a(TYPE type, Throwable th) {
        return f68752a.get(type).mo98131a(th);
    }

    /* renamed from: a */
    public static String m100462a(TYPE type, StackTraceElement[] stackTraceElementArr) {
        return f68752a.get(type).mo98131a(stackTraceElementArr);
    }
}
