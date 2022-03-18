package com.huawei.hms.support.api.entity.location.activityrecognition;

import android.app.PendingIntent;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

public class RequestActivityUpdatesRequest implements IMessageEntity {
    @Packed
    private PendingIntent callbackIntent;
    @Packed
    private long detectionIntervalMillis;

    public PendingIntent getCallbackIntent() {
        return this.callbackIntent;
    }

    public long getDetectionIntervalMillis() {
        return this.detectionIntervalMillis;
    }

    public void setCallbackIntent(PendingIntent pendingIntent) {
        this.callbackIntent = pendingIntent;
    }

    public void setDetectionIntervalMillis(long j) {
        this.detectionIntervalMillis = j;
    }
}
