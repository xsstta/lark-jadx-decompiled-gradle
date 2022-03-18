package com.ss.android.lark.main.app;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/main/app/DualActivityManager;", "", "()V", "defaultRightRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getDefaultRightRef", "()Ljava/lang/ref/WeakReference;", "setDefaultRightRef", "(Ljava/lang/ref/WeakReference;)V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.b */
public final class DualActivityManager {

    /* renamed from: a */
    public static final DualActivityManager f112116a = new DualActivityManager();

    /* renamed from: b */
    private static WeakReference<Activity> f112117b = new WeakReference<>(null);

    private DualActivityManager() {
    }

    /* renamed from: a */
    public final WeakReference<Activity> mo157167a() {
        return f112117b;
    }

    /* renamed from: a */
    public final void mo157168a(WeakReference<Activity> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "<set-?>");
        f112117b = weakReference;
    }
}
