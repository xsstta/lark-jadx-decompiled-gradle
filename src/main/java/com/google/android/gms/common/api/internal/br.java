package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;

final class br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AbstractC21641i f52721a;

    /* renamed from: b */
    private final /* synthetic */ bq f52722b;

    br(bq bqVar, AbstractC21641i iVar) {
        this.f52722b = bqVar;
        this.f52721a = iVar;
    }

    public final void run() {
        try {
            BasePendingResult.f52602c.set(true);
            this.f52722b.f52719h.sendMessage(this.f52722b.f52719h.obtainMessage(0, this.f52722b.f52712a.mo73527a(this.f52721a)));
            BasePendingResult.f52602c.set(false);
            bq bqVar = this.f52722b;
            bq.m78490b((bq) this.f52721a);
            AbstractC21631d dVar = (AbstractC21631d) this.f52722b.f52718g.get();
            if (dVar != null) {
                dVar.mo73270b(this.f52722b);
            }
        } catch (RuntimeException e) {
            this.f52722b.f52719h.sendMessage(this.f52722b.f52719h.obtainMessage(1, e));
            BasePendingResult.f52602c.set(false);
            bq bqVar2 = this.f52722b;
            bq.m78490b((bq) this.f52721a);
            AbstractC21631d dVar2 = (AbstractC21631d) this.f52722b.f52718g.get();
            if (dVar2 != null) {
                dVar2.mo73270b(this.f52722b);
            }
        } catch (Throwable th) {
            BasePendingResult.f52602c.set(false);
            bq bqVar3 = this.f52722b;
            bq.m78490b((bq) this.f52721a);
            AbstractC21631d dVar3 = (AbstractC21631d) this.f52722b.f52718g.get();
            if (dVar3 != null) {
                dVar3.mo73270b(this.f52722b);
            }
            throw th;
        }
    }
}
