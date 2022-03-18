package com.ss.android.lark.mm.module.player.notification;

import android.os.Binder;

/* renamed from: com.ss.android.lark.mm.module.player.notification.d */
public abstract class AbstractBinderC46708d extends Binder {

    /* renamed from: a */
    public AbstractC46705a f117502a;

    /* renamed from: a */
    public abstract void mo164059a();

    /* renamed from: a */
    public abstract void mo164060a(long j);

    /* renamed from: a */
    public abstract void mo164061a(AbstractC46705a aVar);

    /* renamed from: b */
    public abstract void mo164062b();

    /* renamed from: c */
    public AbstractC46705a mo164067c() {
        return this.f117502a;
    }

    /* renamed from: b */
    public void mo164066b(AbstractC46705a aVar) {
        AbstractC46705a aVar2 = this.f117502a;
        if (aVar2 != null && aVar2 == aVar) {
            this.f117502a = null;
        }
    }
}
