package com.bytedance.frameworks.baselib.network.http.exception;

import java.io.IOException;

public class NotAllowApiHttpException extends IOException {
    private static final long serialVersionUID = -5588326043064908201L;

    public NotAllowApiHttpException() {
    }

    public NotAllowApiHttpException(String str) {
        super(str);
    }

    public NotAllowApiHttpException(Throwable th) {
        initCause(th);
    }

    public NotAllowApiHttpException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
