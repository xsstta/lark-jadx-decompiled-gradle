package com.ss.android.lark.mm.utils;

import android.os.SystemClock;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.utils.m */
public class C47113m {

    /* renamed from: a */
    private int f118647a;

    /* renamed from: b */
    private long f118648b;

    public C47113m() {
        this(ParticipantRepo.f117150c);
    }

    public C47113m(int i) {
        this.f118647a = i;
    }

    /* renamed from: a */
    public void mo165501a(Runnable runnable) {
        C45859k.m181685a(new Runnable(runnable) {
            /* class com.ss.android.lark.mm.utils.$$Lambda$m$g7wLtPmXzziVtlLR86dL1o3N9Mk */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C47113m.this.m186576b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m186576b(Runnable runnable) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f118648b > ((long) this.f118647a)) {
            this.f118648b = elapsedRealtime;
            runnable.run();
        }
    }
}
