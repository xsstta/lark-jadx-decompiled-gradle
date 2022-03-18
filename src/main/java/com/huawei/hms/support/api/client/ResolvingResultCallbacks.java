package com.huawei.hms.support.api.client;

import android.app.Activity;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private static final String TAG = "ResolvingResultCallbacks";
    private final Activity mActivity;
    private final int requestCode;

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(Status status);

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public final void onFailure(Status status) {
        try {
            if (status.hasResolution()) {
                status.startResolutionForResult(this.mActivity, this.requestCode);
            } else {
                onUnresolvableFailure(status);
            }
        } catch (Exception e) {
            HMSLog.m86964e(TAG, "Failed to start resolution: " + e);
            onUnresolvableFailure(Status.RESULT_INTERNAL_ERROR);
        }
    }

    protected ResolvingResultCallbacks(Activity activity, int i) {
        this.mActivity = (Activity) Preconditions.checkNotNull(activity, "Activity must not be null");
        this.requestCode = i;
    }
}
