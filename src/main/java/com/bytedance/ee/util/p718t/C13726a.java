package com.bytedance.ee.util.p718t;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.bytedance.ee.util.t.a */
public class C13726a {
    /* renamed from: a */
    public static boolean m55673a(Activity activity) {
        return m55675a(activity, activity.getClass().getName());
    }

    /* renamed from: a */
    public static boolean m55674a(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m55676b(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT < 17) {
                if (!activity.isFinishing()) {
                    return true;
                }
            } else if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m55675a(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        if (context == null || TextUtils.isEmpty(str) || (runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1)) == null || runningTasks.size() <= 0 || !str.equals(runningTasks.get(0).topActivity.getClassName())) {
            return false;
        }
        return true;
    }
}
