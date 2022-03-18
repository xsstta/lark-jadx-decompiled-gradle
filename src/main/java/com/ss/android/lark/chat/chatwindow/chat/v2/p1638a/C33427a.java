package com.ss.android.lark.chat.chatwindow.chat.v2.p1638a;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a,\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\u001a,\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t¨\u0006\u000b"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/MutableLiveData;", "T", "observeAndNotify", "", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeOnce", "im_chat_chat_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a.a */
public final class C33427a {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "T", "run", "com/ss/android/lark/chat/chatwindow/chat/v2/extension/ExtensionsKt$observeOnce$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a.a$b */
    public static final class RunnableC33429b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f86138a;

        /* renamed from: b */
        final /* synthetic */ LifecycleOwner f86139b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1178x f86140c;

        RunnableC33429b(Object obj, LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
            this.f86138a = obj;
            this.f86139b = lifecycleOwner;
            this.f86140c = xVar;
        }

        public final void run() {
            this.f86140c.onChanged(this.f86138a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/extension/ExtensionsKt$distinctUntilChanged$1", "Landroidx/lifecycle/Observer;", "mFirstTime", "", "getMFirstTime", "()Z", "setMFirstTime", "(Z)V", "onChanged", "", "currentValue", "(Ljava/lang/Object;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a.a$a */
    public static final class C33428a implements AbstractC1178x<T> {

        /* renamed from: a */
        final /* synthetic */ C1174u f86136a;

        /* renamed from: b */
        private boolean f86137b = true;

        C33428a(C1174u uVar) {
            this.f86136a = uVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public void onChanged(T t) {
            Object b = this.f86136a.mo5927b();
            if (this.f86137b || ((b == null && t != null) || (b != null && !b.equals(t)))) {
                this.f86137b = false;
                this.f86136a.mo5929b((Object) t);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/extension/ExtensionsKt$observeOnce$2", "Landroidx/lifecycle/Observer;", "onChanged", "", "t", "(Ljava/lang/Object;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.a.a$c */
    public static final class C33430c implements AbstractC1178x<T> {

        /* renamed from: a */
        final /* synthetic */ LiveData f86141a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1178x f86142b;

        @Override // androidx.lifecycle.AbstractC1178x
        public void onChanged(T t) {
            this.f86142b.onChanged(t);
            this.f86141a.mo5928b((AbstractC1178x) this);
        }

        C33430c(LiveData<T> liveData, AbstractC1178x xVar) {
            this.f86141a = liveData;
            this.f86142b = xVar;
        }
    }

    /* renamed from: a */
    public static final <T> C1177w<T> m129532a(C1177w<T> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "$this$distinctUntilChanged");
        C1174u uVar = new C1174u();
        uVar.mo6042a(wVar, new C33428a(uVar));
        return uVar;
    }

    /* renamed from: a */
    public static final <T> void m129533a(LiveData<T> liveData, LifecycleOwner lifecycleOwner, AbstractC1178x<T> xVar) {
        Intrinsics.checkParameterIsNotNull(liveData, "$this$observeOnce");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(xVar, "observer");
        T b = liveData.mo5927b();
        if (b != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                UICallbackExecutor.execute(new RunnableC33429b(b, lifecycleOwner, xVar));
            }
        }
        liveData.mo5923a(lifecycleOwner, new C33430c(liveData, xVar));
    }
}
