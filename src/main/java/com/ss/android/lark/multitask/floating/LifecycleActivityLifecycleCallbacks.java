package com.ss.android.lark.multitask.floating;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/floating/LifecycleActivityLifecycleCallbacks;", "Lcom/ss/android/lark/multitask/floating/SimpleActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateLifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.j */
public class LifecycleActivityLifecycleCallbacks extends SimpleActivityLifecycleCallbacks {
    /* renamed from: a */
    public LifecycleObserver mo169022a() {
        return null;
    }

    @Override // com.ss.android.lark.multitask.floating.SimpleActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        LifecycleObserver a;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        super.onActivityCreated(activity, bundle);
        if ((activity instanceof FragmentActivity) && (a = mo169022a()) != null) {
            ((FragmentActivity) activity).getLifecycle().addObserver(a);
        }
    }
}
