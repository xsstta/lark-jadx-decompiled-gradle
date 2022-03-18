package com.bytedance.ee.bear.basesdk.apisupport;

public final class InvalidAccessException extends RuntimeException {
    public InvalidAccessException() {
        super("the interface is not implemented for this flavor app. ");
    }

    private InvalidAccessException(String str) {
        super(str);
    }

    private InvalidAccessException(Throwable th) {
        super(th);
    }

    private InvalidAccessException(String str, Throwable th) {
        super(str, th);
    }

    private InvalidAccessException(String str, Throwable th, boolean z, boolean z2) {
        super(str, th, z, z2);
    }
}
