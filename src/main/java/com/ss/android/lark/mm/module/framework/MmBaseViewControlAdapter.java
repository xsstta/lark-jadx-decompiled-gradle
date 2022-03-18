package com.ss.android.lark.mm.module.framework;

import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.framework.IMmListener;
import io.reactivex.disposables.C68289a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "C", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "D", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlAdapter;", "baseViewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "baseControlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "baseControl", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/framework/MmBaseControl;)V", "callback", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "bindInquirer", "", "inquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getListener", "()Lcom/ss/android/lark/mm/module/framework/IMmListener;", "onCreate", "onDestroy", "subscribe", "listener", "(Lcom/ss/android/lark/mm/module/framework/IMmListener;)V", "unBindInquirer", "unSubscribe", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.a.j */
public abstract class MmBaseViewControlAdapter<C extends IMmListener, D extends IMmDependency> implements IMmViewControlAdapter<C, D> {

    /* renamed from: a */
    private C f115724a;

    /* renamed from: b */
    private final C68289a f115725b = new C68289a();

    /* renamed from: c */
    private final MmViewControlRegister f115726c;

    /* renamed from: d */
    private final MmControlRegister f115727d;

    /* renamed from: e */
    private final MmBaseControl f115728e;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C68289a mo161257h() {
        return this.f115725b;
    }

    /* renamed from: i */
    public C mo161258i() {
        return this.f115724a;
    }

    /* renamed from: a */
    public void mo161251a() {
        this.f115727d.mo161914a(this.f115728e);
    }

    /* renamed from: d */
    public void mo161256d() {
        this.f115725b.dispose();
    }

    /* renamed from: a */
    public void mo161252a(IMmInquirer cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "inquirer");
        this.f115726c.mo161261a(cVar);
    }

    /* renamed from: b */
    public void mo161254b(IMmInquirer cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "inquirer");
        this.f115726c.mo161264b(cVar.getClass());
    }

    /* renamed from: a */
    public void mo161253a(C c) {
        Intrinsics.checkParameterIsNotNull(c, "listener");
        this.f115724a = c;
        this.f115726c.mo161262a(c);
    }

    /* renamed from: b */
    public void mo161255b(C c) {
        Intrinsics.checkParameterIsNotNull(c, "listener");
        this.f115726c.mo161265c(c.getClass());
        this.f115724a = (C) null;
    }

    public MmBaseViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmBaseControl hVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "baseViewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "baseControlRegister");
        Intrinsics.checkParameterIsNotNull(hVar, "baseControl");
        this.f115726c = kVar;
        this.f115727d = eVar;
        this.f115728e = hVar;
    }
}
