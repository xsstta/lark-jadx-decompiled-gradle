package com.ss.android.lark.monitor;

import com.facebook.battery.p951a.p953b.AbstractC20990a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.m */
public class C48236m implements AbstractC20990a<C48233j> {
    C48236m() {
    }

    /* renamed from: a */
    public void mo71087a(C48233j jVar, AbstractC20990a.AbstractC20991a aVar) {
        aVar.mo71089a("max_mem", jVar.maxMemMB);
        aVar.mo71089a("total_mem", jVar.totalMemMB);
        aVar.mo71089a("native_heap", jVar.nativeHeapMB);
        aVar.mo71089a("java_heap", jVar.javaHeapMB);
    }
}
