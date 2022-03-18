package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.os.PowerManager;
import com.ss.android.lark.voip.service.impl.app.C58047f;

/* renamed from: com.ss.android.lark.voip.service.impl.app.a */
class C58037a implements C58047f.AbstractC58049a {

    /* renamed from: a */
    private PowerManager.WakeLock f142773a;

    /* renamed from: b */
    private AbstractC58038a f142774b;

    /* renamed from: com.ss.android.lark.voip.service.impl.app.a$a */
    interface AbstractC58038a {
        boolean allowAcquire();
    }

    /* renamed from: c */
    public void mo196783c() {
        PowerManager.WakeLock wakeLock = this.f142773a;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f142773a.release();
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58047f.AbstractC58049a
    /* renamed from: a */
    public void mo196780a() {
        PowerManager.WakeLock wakeLock;
        AbstractC58038a aVar = this.f142774b;
        if ((aVar == null || aVar.allowAcquire()) && (wakeLock = this.f142773a) != null && !wakeLock.isHeld()) {
            this.f142773a.acquire();
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58047f.AbstractC58049a
    /* renamed from: b */
    public void mo196782b() {
        PowerManager.WakeLock wakeLock = this.f142773a;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f142773a.setReferenceCounted(false);
            this.f142773a.release();
        }
    }

    /* renamed from: a */
    public void mo196781a(AbstractC58038a aVar) {
        this.f142774b = aVar;
    }

    public C58037a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f142773a = powerManager.newWakeLock(32, "AutoWakeOffScreen");
        }
    }
}
