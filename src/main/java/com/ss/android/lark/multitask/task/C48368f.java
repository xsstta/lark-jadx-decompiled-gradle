package com.ss.android.lark.multitask.task;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"isRestoredTask", "", "Landroid/content/Intent;", "retrieveSnapshotId", "", "features_multitask_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.f */
public final class C48368f {
    /* renamed from: a */
    public static final boolean m190780a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$isRestoredTask");
        return ActivityTaskUtils.m190778a(intent);
    }

    /* renamed from: b */
    public static final long m190781b(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "$this$retrieveSnapshotId");
        return ActivityTaskUtils.m190779b(intent);
    }
}
