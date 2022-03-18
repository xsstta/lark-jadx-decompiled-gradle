package com.ss.android.agilelogger.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.agilelogger.utils.c */
public class C27527c {
    /* renamed from: a */
    public static String m100470a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return stringWriter.toString();
    }
}
