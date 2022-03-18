package com.ss.android.lark.mail.impl.utils;

/* renamed from: com.ss.android.lark.mail.impl.utils.l */
public final class C43770l {
    /* renamed from: a */
    public static String m173501a(int i) {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        StringBuilder sb = new StringBuilder();
        int min = Math.min(stackTrace.length, Math.max(i, 1) + 1 + 1);
        for (int i2 = 1; i2 < min; i2++) {
            if (i2 != 1) {
                sb.append(" -> ");
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            String[] split = stackTraceElement.getClassName().split("\\.");
            sb.append(split[split.length - 1]);
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("()[");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("]");
        }
        return sb.toString();
    }
}
