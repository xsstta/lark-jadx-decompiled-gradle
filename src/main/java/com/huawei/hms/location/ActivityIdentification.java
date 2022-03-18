package com.huawei.hms.location;

import android.app.Activity;
import android.content.Context;

public class ActivityIdentification {
    public static ActivityIdentificationService getService(Activity activity) {
        return new ActivityIdentificationService(activity);
    }

    public static ActivityIdentificationService getService(Context context) {
        return new ActivityIdentificationService(context);
    }
}
