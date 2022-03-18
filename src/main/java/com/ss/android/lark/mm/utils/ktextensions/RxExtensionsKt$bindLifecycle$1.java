package com.ss.android.lark.mm.utils.ktextensions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.mm.p2288b.C45855f;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/utils/ktextensions/RxExtensionsKt$bindLifecycle$1", "Landroidx/lifecycle/LifecycleObserver;", "onDispose", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RxExtensionsKt$bindLifecycle$1 implements LifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ Disposable f118637a;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDispose() {
        this.f118637a.dispose();
        C45855f.m181663b("bindLifecycle", "dispose: " + this.f118637a.isDisposed());
    }

    RxExtensionsKt$bindLifecycle$1(Disposable disposable) {
        this.f118637a = disposable;
    }
}
