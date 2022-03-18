package com.huawei.hms.feature.dynamic;

public class RuntimeRemoteException extends RuntimeException {
    public RuntimeRemoteException(Exception exc) {
        super(exc);
    }
}
