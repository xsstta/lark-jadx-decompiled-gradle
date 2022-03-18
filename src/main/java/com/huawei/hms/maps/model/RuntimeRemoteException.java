package com.huawei.hms.maps.model;

import android.os.RemoteException;

public final class RuntimeRemoteException extends RuntimeException {
    public RuntimeRemoteException(RemoteException remoteException) {
        super(remoteException);
    }

    public RuntimeRemoteException(String str) {
        super(str);
    }
}
