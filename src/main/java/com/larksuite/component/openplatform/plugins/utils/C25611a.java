package com.larksuite.component.openplatform.plugins.utils;

/* renamed from: com.larksuite.component.openplatform.plugins.utils.a */
public class C25611a {
    /* renamed from: a */
    public static String m91379a(Throwable th) {
        return String.format("native exception %s stack:%s", th, m91380a(th, 0));
    }

    /* renamed from: a */
    private static String m91380a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = i + 5;
        if (i2 > stackTrace.length) {
            i2 = stackTrace.length;
        }
        if (i < i2) {
            sb.append(stackTrace[i]);
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                sb.append(" ");
                sb.append(stackTrace[i]);
            }
        }
        return sb.toString();
    }
}
