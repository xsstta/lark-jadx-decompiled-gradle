package com.ss.android.lark.multitask;

import android.app.Activity;
import com.ss.android.lark.multitask.task.ActivityLifecycle;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"findMostRecentActivity", "Landroid/app/Activity;", "activityString", "", "core-integrator_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.k */
public final class C48337k {
    /* renamed from: a */
    public static final Activity m190659a(String str) {
        Activity activity;
        Intrinsics.checkParameterIsNotNull(str, "activityString");
        List<Activity> a = ActivityLifecycle.f121792a.mo169205a();
        ListIterator<Activity> listIterator = a.listIterator(a.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                activity = null;
                break;
            }
            activity = listIterator.previous();
            if (Intrinsics.areEqual(activity.getClass().getName(), str)) {
                break;
            }
        }
        return activity;
    }
}
