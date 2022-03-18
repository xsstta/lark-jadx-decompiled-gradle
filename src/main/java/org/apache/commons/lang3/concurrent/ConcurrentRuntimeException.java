package org.apache.commons.lang3.concurrent;

public class ConcurrentRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    protected ConcurrentRuntimeException() {
    }

    public ConcurrentRuntimeException(Throwable th) {
        super(C69875a.m268153a(th));
    }

    public ConcurrentRuntimeException(String str, Throwable th) {
        super(str, C69875a.m268153a(th));
    }
}
