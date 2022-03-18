package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r);

    public final void onResult(R r) {
        try {
            Status status = r.getStatus();
            if (status.isSuccess()) {
                onSuccess(r);
                return;
            }
            onFailure(status);
            if (r instanceof Releasable) {
                ((Releasable) r).release();
            }
        } catch (Exception e) {
            HMSLog.m86967w(TAG, "Failed to release " + r + ", reason: " + e);
        }
    }
}
