package org.apache.commons.lang3.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: org.apache.commons.lang3.exception.b */
public class C69880b {

    /* renamed from: a */
    private static final String[] f174653a = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    /* renamed from: c */
    private static <R, T extends Throwable> R m268166c(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: b */
    public static <R> R m268165b(Throwable th) {
        return (R) m268166c(th);
    }

    /* renamed from: a */
    public static String m268164a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }
}
