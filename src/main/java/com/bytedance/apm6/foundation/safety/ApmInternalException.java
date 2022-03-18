package com.bytedance.apm6.foundation.safety;

public class ApmInternalException extends Exception {
    public ApmInternalException() {
    }

    public ApmInternalException(String str) {
        super(str);
    }

    public ApmInternalException(Throwable th) {
        super(th);
    }

    public ApmInternalException(String str, Throwable th) {
        super(str, th);
    }
}
