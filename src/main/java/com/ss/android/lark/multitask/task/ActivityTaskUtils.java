package com.ss.android.lark.multitask.task;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/multitask/task/ActivityTaskUtils;", "", "()V", "isRestoredTask", "", "intent", "Landroid/content/Intent;", "retrieveSnapshotId", "", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.e */
public final class ActivityTaskUtils {

    /* renamed from: a */
    public static final ActivityTaskUtils f121799a = new ActivityTaskUtils();

    private ActivityTaskUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m190778a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return intent.getBooleanExtra("lark.multitask.task.restored", false);
    }

    @JvmStatic
    /* renamed from: b */
    public static final long m190779b(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        return intent.getLongExtra("lark.multitask.snapshot.id", Long.MIN_VALUE);
    }
}
