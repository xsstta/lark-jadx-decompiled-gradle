package com.bytedance.apm.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.bytedance.apm.util.u */
public class C3138u {
    /* renamed from: b */
    public static String m13079b(Throwable th) {
        return m13077a(th, 30);
    }

    /* renamed from: a */
    public static String m13076a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            cause.printStackTrace(printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                cause2.printStackTrace(printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        if (stringWriter2.length() > 1024) {
            return stringWriter2.substring(0, 1024);
        }
        return stringWriter2;
    }

    /* renamed from: a */
    public static String m13078a(StackTraceElement[] stackTraceElementArr) throws IllegalArgumentException {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        int i = 0;
        while (i < stackTraceElementArr.length && i <= 40) {
            if ((i != 0 || !"getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) && (i != 1 || !"getStackTrace".equals(stackTraceElementArr[1].getMethodName()))) {
                sb.append("\tat " + stackTraceElementArr[i].getClassName());
                sb.append(".");
                sb.append(stackTraceElementArr[i].getMethodName());
                sb.append("(");
                sb.append(stackTraceElementArr[i].getFileName());
                sb.append(":");
                sb.append(stackTraceElementArr[i].getLineNumber());
                sb.append(")\n");
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13077a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i2++;
            sb.append("\tat " + stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i2 > i) {
                break;
            }
        }
        return sb.toString();
    }
}
