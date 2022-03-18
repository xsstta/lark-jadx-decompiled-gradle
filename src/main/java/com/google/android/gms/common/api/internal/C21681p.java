package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.p */
public final class C21681p {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f52872a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<TaskCompletionSource<?>, Boolean> f52873b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73499a(BasePendingResult<? extends AbstractC21641i> basePendingResult, boolean z) {
        this.f52872a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo73291a((AbstractC21635e.AbstractC21636a) new C21682q(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void mo73500a(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f52873b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new C21683r(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73501a() {
        return !this.f52872a.isEmpty() || !this.f52873b.isEmpty();
    }

    /* renamed from: b */
    public final void mo73502b() {
        m78759a(false, C21661c.f52737a);
    }

    /* renamed from: c */
    public final void mo73503c() {
        m78759a(true, bt.f52724a);
    }

    /* renamed from: a */
    private final void m78759a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f52872a) {
            hashMap = new HashMap(this.f52872a);
        }
        synchronized (this.f52873b) {
            hashMap2 = new HashMap(this.f52873b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo73315c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }
}
