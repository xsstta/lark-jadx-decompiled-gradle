package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C21752k;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.u */
public final class C21773u implements AbstractC21635e.AbstractC21636a {

    /* renamed from: a */
    private final /* synthetic */ AbstractC21635e f53110a;

    /* renamed from: b */
    private final /* synthetic */ TaskCompletionSource f53111b;

    /* renamed from: c */
    private final /* synthetic */ C21752k.AbstractC21753a f53112c;

    /* renamed from: d */
    private final /* synthetic */ C21752k.AbstractC21754b f53113d;

    C21773u(AbstractC21635e eVar, TaskCompletionSource taskCompletionSource, C21752k.AbstractC21753a aVar, C21752k.AbstractC21754b bVar) {
        this.f53110a = eVar;
        this.f53111b = taskCompletionSource;
        this.f53112c = aVar;
        this.f53113d = bVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e.AbstractC21636a
    /* renamed from: a */
    public final void mo73295a(Status status) {
        if (status.isSuccess()) {
            this.f53111b.setResult(this.f53112c.mo73066a(this.f53110a.mo73289a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f53111b.setException(this.f53113d.mo73726a(status));
    }
}
