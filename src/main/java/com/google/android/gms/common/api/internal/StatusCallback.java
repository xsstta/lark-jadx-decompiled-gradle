package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.IStatusCallback;

public class StatusCallback extends IStatusCallback.Stub {
    private final C21655b.AbstractC21657b<Status> mResultHolder;

    public StatusCallback(C21655b.AbstractC21657b<Status> bVar) {
        this.mResultHolder = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.mResultHolder.mo73385a(status);
    }
}
