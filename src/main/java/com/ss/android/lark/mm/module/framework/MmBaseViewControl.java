package com.ss.android.lark.mm.module.framework;

import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.framework.IMmLifecycle;
import com.ss.android.lark.mm.module.framework.IMmListener;
import io.reactivex.disposables.C68289a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B!\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u00028\u0001¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H&J\r\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "C", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "D", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmLifecycle;", "viewControlContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "baseControlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "getDependency", "()Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "()Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onCreate", "", "onDestroy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.a.i */
public abstract class MmBaseViewControl<C extends IMmListener, D extends IMmDependency> implements IMmLifecycle {

    /* renamed from: a */
    private final Lazy f115721a = LazyKt.lazy(C45905a.INSTANCE);

    /* renamed from: b */
    private final IMmViewControlContext f115722b;

    /* renamed from: c */
    private final MmBaseViewControlAdapter<C, D> f115723c;

    /* renamed from: c */
    public abstract C mo161243c();

    /* renamed from: e */
    public abstract IMmInquirer mo161244e();

    /* renamed from: v */
    public final C68289a mo161246v() {
        return (C68289a) this.f115721a.getValue();
    }

    /* renamed from: A */
    public void mo161241A() {
        IMmLifecycle.C45903a.m181874d(this);
    }

    /* renamed from: x */
    public void mo161248x() {
        IMmLifecycle.C45903a.m181871a(this);
    }

    /* renamed from: y */
    public void mo161249y() {
        IMmLifecycle.C45903a.m181872b(this);
    }

    /* renamed from: z */
    public void mo161250z() {
        IMmLifecycle.C45903a.m181873c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "C", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "D", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.a.i$a */
    static final class C45905a extends Lambda implements Function0<C68289a> {
        public static final C45905a INSTANCE = new C45905a();

        C45905a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    /* renamed from: w */
    public final D mo161247w() {
        return this.f115723c.mo161230c();
    }

    public void be_() {
        this.f115723c.mo161253a(mo161243c());
        this.f115723c.mo161252a(mo161244e());
        this.f115723c.mo161251a();
    }

    /* renamed from: h */
    public void mo161245h() {
        mo161246v().mo237935a();
        this.f115723c.mo161256d();
        this.f115723c.mo161255b(mo161243c());
        this.f115723c.mo161254b(mo161244e());
    }

    public MmBaseViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<C, D> jVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "viewControlContext");
        Intrinsics.checkParameterIsNotNull(jVar, "baseControlAdapter");
        this.f115722b = gVar;
        this.f115723c = jVar;
    }
}
