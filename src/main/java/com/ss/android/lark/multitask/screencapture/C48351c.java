package com.ss.android.lark.multitask.screencapture;

import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"findContentViewToDraw", "Landroid/view/View;", "mostRecentActivityObj", "Landroid/app/Activity;", "base_multitask_impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.screencapture.c */
public final class C48351c {
    /* renamed from: a */
    public static final View m190717a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mostRecentActivityObj");
        return activity.findViewById(16908290);
    }
}
