package com.larksuite.framework.section.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1177w;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/larksuite/framework/section/utils/MutableLiveDataPlus;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "value", "(Ljava/lang/Object;)V", "NOT_SET", "", "mPendingData", "mPostValueRunnable", "Ljava/lang/Runnable;", "postValueIfChanged", "", "setValueIfChanged", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.e */
public final class MutableLiveDataPlus<T> extends C1177w<T> {

    /* renamed from: g */
    public static final Lazy f64023g = LazyKt.lazy(C25881b.INSTANCE);

    /* renamed from: h */
    public static final Companion f64024h = new Companion(null);

    /* renamed from: a */
    public final Object f64025a;

    /* renamed from: f */
    public volatile Object f64026f;

    /* renamed from: i */
    private final Runnable f64027i = new RunnableC25882c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/framework/section/utils/MutableLiveDataPlus$Companion;", "", "()V", "uiHandler", "Landroid/os/Handler;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler$delegate", "Lkotlin/Lazy;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.e$a */
    public static final class Companion {
        /* renamed from: a */
        public final Handler mo92062a() {
            Lazy lazy = MutableLiveDataPlus.f64023g;
            Companion aVar = MutableLiveDataPlus.f64024h;
            return (Handler) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "T", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.e$b */
    static final class C25881b extends Lambda implements Function0<Handler> {
        public static final C25881b INSTANCE = new C25881b();

        C25881b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public MutableLiveDataPlus() {
        Object obj = new Object();
        this.f64025a = obj;
        this.f64026f = obj;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.framework.a.a.e$c */
    static final class RunnableC25882c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MutableLiveDataPlus f64028a;

        RunnableC25882c(MutableLiveDataPlus eVar) {
            this.f64028a = eVar;
        }

        public final void run() {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            synchronized (this.f64028a.f64025a) {
                objectRef.element = (T) this.f64028a.f64026f;
                MutableLiveDataPlus eVar = this.f64028a;
                eVar.f64026f = eVar.f64025a;
                Unit unit = Unit.INSTANCE;
            }
            this.f64028a.mo92060c(objectRef.element);
        }
    }

    /* renamed from: c */
    public final void mo92060c(T t) {
        T b = mo5927b();
        if (b == null || !Intrinsics.areEqual((Object) b, (Object) t)) {
            super.mo5929b((Object) t);
        }
    }

    public MutableLiveDataPlus(T t) {
        super(t);
        Object obj = new Object();
        this.f64025a = obj;
        this.f64026f = obj;
    }

    /* renamed from: d */
    public final void mo92061d(T t) {
        boolean z;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        synchronized (this.f64025a) {
            if (this.f64026f == this.f64025a) {
                z = true;
            } else {
                z = false;
            }
            booleanRef.element = z;
            if (t != null) {
                this.f64026f = t;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        if (booleanRef.element) {
            f64024h.mo92062a().post(this.f64027i);
        }
    }
}
