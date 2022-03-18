package com.bytedance.lynx.webview.util;

import android.util.Log;
import com.bytedance.lynx.webview.internal.C19975k;
import java.io.FileWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.lynx.webview.util.g */
public class C20048g implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static String f48982a = "TT_WEBVIEW";

    /* renamed from: b */
    private static SimpleDateFormat f48983b;

    /* renamed from: c */
    private static C20048g f48984c;

    /* renamed from: d */
    private FileWriter f48985d;

    /* renamed from: e */
    private Thread.UncaughtExceptionHandler f48986e;

    /* renamed from: a */
    private static String m73159a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 5) {
            return "";
        }
        int i = 4;
        while (i < stackTrace.length && "com.bytedance.lynx.webview.util.Log".equals(stackTrace[i].getClassName())) {
            i++;
        }
        if (i >= stackTrace.length) {
            return "";
        }
        String className = stackTrace[i].getClassName();
        String methodName = stackTrace[i].getMethodName();
        int lineNumber = stackTrace[i].getLineNumber();
        return className + "(" + lineNumber + ") " + methodName + "  ";
    }

    /* renamed from: a */
    public static void m73160a(Throwable th) {
        m73164d(Log.getStackTraceString(th));
    }

    /* renamed from: a */
    public static void m73161a(String... strArr) {
        String e = m73165e(strArr);
        C19975k.m72861c(f48982a, e);
        C20048g gVar = f48984c;
        if (gVar != null) {
            gVar.m73166f(e);
        }
    }

    /* renamed from: b */
    public static void m73162b(String... strArr) {
        String e = m73165e(strArr);
        C19975k.m72862d(f48982a, e);
        C20048g gVar = f48984c;
        if (gVar != null) {
            gVar.m73166f(e);
        }
    }

    /* renamed from: c */
    public static void m73163c(String... strArr) {
        String e = m73165e(strArr);
        C19975k.m72857a(f48982a, e);
        C20048g gVar = f48984c;
        if (gVar != null) {
            gVar.m73166f(e);
        }
    }

    /* renamed from: d */
    public static void m73164d(String... strArr) {
        String e = m73165e(strArr);
        C19975k.m72859b(f48982a, e);
        C20048g gVar = f48984c;
        if (gVar != null) {
            gVar.m73166f(e);
        }
    }

    /* renamed from: e */
    public static String m73165e(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str + " ");
        }
        return sb.toString();
    }

    /* renamed from: f */
    private void m73166f(String... strArr) {
        try {
            StringBuilder sb = new StringBuilder(m73159a());
            if (strArr != null) {
                for (String str : strArr) {
                    sb.append(str);
                    sb.append(" ");
                }
                sb.delete(sb.length() - 2, sb.length());
            }
            if (this.f48985d != null) {
                Date date = new Date(System.currentTimeMillis());
                this.f48985d.write(f48983b.format(date) + " " + sb.toString() + "\n");
                this.f48985d.flush();
            }
        } catch (Exception unused) {
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m73164d("****************************");
        m73164d("Thread", thread.getName(), String.valueOf(thread.getId()));
        m73160a(th);
        m73164d("****************************");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f48986e;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
