package com.ss.android.lark.setting.service.impl;

import android.os.SystemClock;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.service.AbstractC54601a;

/* renamed from: com.ss.android.lark.setting.service.impl.b */
public class C54608b implements AbstractC54601a {

    /* renamed from: a */
    private long f134930a;

    /* renamed from: b */
    private long f134931b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.impl.b$a */
    public static class C54610a {

        /* renamed from: a */
        public static final C54608b f134932a = new C54608b();
    }

    private C54608b() {
    }

    /* renamed from: b */
    public static C54608b m211917b() {
        return C54610a.f134932a;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54601a
    /* renamed from: a */
    public long mo186512a() {
        return mo186513a(30000);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54601a
    /* renamed from: a */
    public long mo186513a(long j) {
        if (this.f134930a != 0 && SystemClock.elapsedRealtime() - this.f134931b <= j) {
            return this.f134930a + (SystemClock.elapsedRealtime() - this.f134931b);
        }
        this.f134930a = SdkSender.getNtpTime();
        this.f134931b = SystemClock.elapsedRealtime();
        return this.f134930a;
    }
}
