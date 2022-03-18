package com.p063a.p064a.p065a.p066a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.a.a.a.a.e */
public final class C1716e {
    /* renamed from: a */
    static <T> T m7641a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    static boolean m7643a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m7642a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
