package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hms.locationSdk.AbstractC23644c;
import com.huawei.hms.locationSdk.C23643b;
import com.huawei.hms.locationSdk.C23668s;

public class ActivityIdentificationService {

    /* renamed from: a */
    private AbstractC23644c f58363a;

    public ActivityIdentificationService(Activity activity) {
        this.f58363a = C23643b.m86017a(activity, (C23668s) null);
    }

    public ActivityIdentificationService(Context context) {
        this.f58363a = C23643b.m86018a(context, (C23668s) null);
    }

    public AbstractC23432f<Void> createActivityConversionUpdates(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        return this.f58363a.mo83492a(activityConversionRequest, pendingIntent);
    }

    public AbstractC23432f<Void> createActivityIdentificationUpdates(long j, PendingIntent pendingIntent) {
        return this.f58363a.mo83490a(j, pendingIntent);
    }

    public AbstractC23432f<Void> deleteActivityConversionUpdates(PendingIntent pendingIntent) {
        return this.f58363a.mo83493b(pendingIntent);
    }

    public AbstractC23432f<Void> deleteActivityIdentificationUpdates(PendingIntent pendingIntent) {
        return this.f58363a.mo83491a(pendingIntent);
    }
}
