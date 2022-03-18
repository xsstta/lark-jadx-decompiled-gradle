package com.ss.android.lark.mm.module.minifloatwindow;

import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a;
import com.ss.android.lark.mm.module.minifloatwindow.floating.C46522b;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a */
public class C46490a implements IMmDepend.AbstractC45871b.AbstractC45874c {

    /* renamed from: a */
    private static C46490a f117053a;

    /* renamed from: b */
    private boolean f117054b = true;

    private C46490a() {
    }

    /* renamed from: a */
    public static C46490a m183861a() {
        if (f117053a == null) {
            synchronized (C46522b.class) {
                if (f117053a == null) {
                    f117053a = new C46490a();
                }
            }
        }
        return f117053a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m183862a(IMmDepend.AbstractC45871b.C45872a aVar) {
        boolean z;
        String z2;
        C45855f.m181664c("AppLifecycleObserver", "mCacheIsForeground=" + this.f117054b + " newState.isAppFront= " + aVar.f115713c);
        if (this.f117054b != aVar.f115713c) {
            this.f117054b = aVar.f115713c;
            boolean y = MmRecordManager.m185552y();
            boolean h = C45852d.m181651a().mo161151b().mo164278h();
            if (y || h) {
                z = true;
            } else {
                z = false;
            }
            boolean a = C46313a.m183388a(C45899c.m181859a().getContextDepend().mo144557a());
            if (z && a) {
                C46509b bVar = new C46509b();
                MiniType b = bVar.mo163404b();
                if ((b != MiniType.MINUTES_PODCAST && b != MiniType.MINUTES_RECORDING) || !bVar.mo163405c()) {
                    boolean z3 = !aVar.f115713c;
                    boolean b2 = true ^ C45899c.m181859a().getLifecycleDependency().mo144571b();
                    C45855f.m181664c("AppLifecycleObserver", "isAppBackground= " + z3 + " isAppRealBackground=" + b2);
                    if (z3 == b2 && z3) {
                        if (y && (z2 = MmRecordManager.m185553z()) != null) {
                            C45852d.m181651a().mo161150a(z2).mo164522a(false);
                        }
                        if (h) {
                            C45852d.m181651a().mo161151b().mo164269a(false);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b.AbstractC45874c
    /* renamed from: a */
    public void mo149331a(IMmDepend.AbstractC45871b.C45872a aVar, IMmDepend.AbstractC45871b.C45872a aVar2) {
        C45859k.m181685a(new Runnable(aVar2) {
            /* class com.ss.android.lark.mm.module.minifloatwindow.$$Lambda$a$2vSMuOdUXg_GcF1VBOlC526nNDQ */
            public final /* synthetic */ IMmDepend.AbstractC45871b.C45872a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46490a.lambda$2vSMuOdUXg_GcF1VBOlC526nNDQ(C46490a.this, this.f$1);
            }
        });
    }
}
