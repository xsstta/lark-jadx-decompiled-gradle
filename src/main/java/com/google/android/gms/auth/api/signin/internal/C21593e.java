package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AbstractC1195a;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.internal.AbstractC21674i;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C21593e extends AbstractC1195a<Void> implements AbstractC21674i {

    /* renamed from: f */
    private Semaphore f52528f = new Semaphore(0);

    /* renamed from: g */
    private Set<AbstractC21631d> f52529g;

    public C21593e(Context context, Set<AbstractC21631d> set) {
        super(context);
        this.f52529g = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final Void mo6101d() {
        int i = 0;
        for (AbstractC21631d dVar : this.f52529g) {
            if (dVar.mo73266a(this)) {
                i++;
            }
        }
        try {
            this.f52528f.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.loader.content.C1198c
    /* renamed from: i */
    public final void mo6116i() {
        this.f52528f.drainPermits();
        mo6130s();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21674i
    /* renamed from: h */
    public final void mo73095h() {
        this.f52528f.release();
    }
}
