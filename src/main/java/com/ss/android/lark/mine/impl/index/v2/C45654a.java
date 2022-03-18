package com.ss.android.lark.mine.impl.index.v2;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a,\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a,\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t¨\u0006\u000b"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/MutableLiveData;", "T", "observeAndNotify", "", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeOnce", "core_mine_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.a */
public final class C45654a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/ss/android/lark/mine/impl/index/v2/ExtensionsKt$observeOnce$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.a$a */
    static final class RunnableC45655a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f115284a;

        /* renamed from: b */
        final /* synthetic */ LifecycleOwner f115285b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1178x f115286c;

        RunnableC45655a(Object obj, LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
            this.f115284a = obj;
            this.f115285b = lifecycleOwner;
            this.f115286c = xVar;
        }

        public final void run() {
            this.f115286c.onChanged(this.f115284a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/ExtensionsKt$observeOnce$2", "Landroidx/lifecycle/Observer;", "onChanged", "", "t", "(Ljava/lang/Object;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.a$b */
    public static final class C45656b implements AbstractC1178x<T> {

        /* renamed from: a */
        final /* synthetic */ LiveData f115287a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1178x f115288b;

        @Override // androidx.lifecycle.AbstractC1178x
        public void onChanged(T t) {
            this.f115288b.onChanged(t);
            this.f115287a.mo5928b((AbstractC1178x) this);
        }

        C45656b(LiveData<T> liveData, AbstractC1178x xVar) {
            this.f115287a = liveData;
            this.f115288b = xVar;
        }
    }

    /* renamed from: a */
    public static final <T> void m181034a(LiveData<T> liveData, LifecycleOwner lifecycleOwner, AbstractC1178x<T> xVar) {
        Intrinsics.checkParameterIsNotNull(liveData, "$this$observeOnce");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        T b = liveData.mo5927b();
        if (b != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                UICallbackExecutor.execute(new RunnableC45655a(b, lifecycleOwner, xVar));
            }
        }
        liveData.mo5923a(lifecycleOwner, new C45656b(liveData, xVar));
    }
}
