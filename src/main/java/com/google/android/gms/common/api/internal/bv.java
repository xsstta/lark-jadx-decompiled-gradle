package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.AbstractC21697o;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class bv implements IBinder.DeathRecipient, bw {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f52730a;

    /* renamed from: b */
    private final WeakReference<AbstractC21697o> f52731b;

    /* renamed from: c */
    private final WeakReference<IBinder> f52732c;

    private bv(BasePendingResult<?> basePendingResult, AbstractC21697o oVar, IBinder iBinder) {
        this.f52731b = new WeakReference<>(oVar);
        this.f52730a = new WeakReference<>(basePendingResult);
        this.f52732c = new WeakReference<>(iBinder);
    }

    @Override // com.google.android.gms.common.api.internal.bw
    /* renamed from: a */
    public final void mo73408a(BasePendingResult<?> basePendingResult) {
        m78502a();
    }

    public final void binderDied() {
        m78502a();
    }

    /* renamed from: a */
    private final void m78502a() {
        BasePendingResult<?> basePendingResult = this.f52730a.get();
        AbstractC21697o oVar = this.f52731b.get();
        if (!(oVar == null || basePendingResult == null)) {
            oVar.mo73528a(basePendingResult.mo73294c().intValue());
        }
        IBinder iBinder = this.f52732c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ bv(BasePendingResult basePendingResult, AbstractC21697o oVar, IBinder iBinder, bu buVar) {
        this(basePendingResult, null, iBinder);
    }
}
