package com.bytedance.ee.bear.service.exception;

public class InvokeRemoteException extends RuntimeException {
    public InvokeRemoteException() {
    }

    public InvokeRemoteException(String str) {
        super(str);
    }

    public InvokeRemoteException(Throwable th) {
        super(th);
    }

    public InvokeRemoteException(String str, Throwable th) {
        super(str, th);
    }
}
