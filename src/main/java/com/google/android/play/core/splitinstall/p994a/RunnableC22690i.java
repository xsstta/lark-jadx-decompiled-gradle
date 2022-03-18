package com.google.android.play.core.splitinstall.p994a;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.a.i */
public final class RunnableC22690i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f56142a;

    /* renamed from: b */
    final /* synthetic */ List f56143b;

    /* renamed from: c */
    final /* synthetic */ List f56144c;

    /* renamed from: d */
    final /* synthetic */ List f56145d;

    /* renamed from: e */
    final /* synthetic */ C22682a f56146e;

    RunnableC22690i(C22682a aVar, long j, List list, List list2, List list3) {
        this.f56146e = aVar;
        this.f56142a = j;
        this.f56143b = list;
        this.f56144c = list2;
        this.f56145d = list3;
    }

    public final void run() {
        long j = this.f56142a / 3;
        long j2 = 0;
        int i = 0;
        while (((long) i) < 3) {
            j2 = Math.min(this.f56142a, j2 + j);
            C22682a.m82557a(this.f56146e, 2, Long.valueOf(j2));
            i++;
            C22684c.m82569a();
        }
        if (this.f56146e.f56126m.get()) {
            C22682a.m82556a(this.f56146e, -6);
        } else {
            this.f56146e.m82560a((C22682a) this.f56143b, this.f56144c, this.f56145d, (List) this.f56142a, 0L);
        }
    }
}
