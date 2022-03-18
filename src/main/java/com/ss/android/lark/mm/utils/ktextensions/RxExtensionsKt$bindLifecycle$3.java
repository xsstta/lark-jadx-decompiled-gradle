package com.ss.android.lark.mm.utils.ktextensions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/utils/ktextensions/RxExtensionsKt$bindLifecycle$3", "Landroidx/lifecycle/LifecycleObserver;", "onDispose", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RxExtensionsKt$bindLifecycle$3 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ Disposable f118639a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDispose() {
        this.f118639a.dispose();
    }

    RxExtensionsKt$bindLifecycle$3(Disposable disposable) {
        this.f118639a = disposable;
    }
}
