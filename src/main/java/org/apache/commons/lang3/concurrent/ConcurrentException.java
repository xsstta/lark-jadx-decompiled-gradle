package org.apache.commons.lang3.concurrent;

public class ConcurrentException extends Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    protected ConcurrentException() {
    }

    public ConcurrentException(Throwable th) {
        super(C69875a.m268153a(th));
    }

    public ConcurrentException(String str, Throwable th) {
        super(str, C69875a.m268153a(th));
    }
}
