package com.google.android.gms.common.api.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ce {

    /* renamed from: a */
    private final ArrayMap<cc<?>, ConnectionResult> f52788a = new ArrayMap<>();

    /* renamed from: b */
    private final ArrayMap<cc<?>, String> f52789b = new ArrayMap<>();

    /* renamed from: c */
    private final TaskCompletionSource<Map<cc<?>, String>> f52790c = new TaskCompletionSource<>();

    /* renamed from: d */
    private int f52791d;

    /* renamed from: e */
    private boolean f52792e = false;

    public ce(Iterable<? extends C21628c<?>> iterable) {
        Iterator<? extends C21628c<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f52788a.put(((C21628c) it.next()).mo73252e(), null);
        }
        this.f52791d = this.f52788a.keySet().size();
    }

    /* renamed from: a */
    public final Set<cc<?>> mo73453a() {
        return this.f52788a.keySet();
    }

    /* renamed from: b */
    public final Task<Map<cc<?>, String>> mo73455b() {
        return this.f52790c.getTask();
    }

    /* renamed from: a */
    public final void mo73454a(cc<?> ccVar, ConnectionResult connectionResult, String str) {
        this.f52788a.put(ccVar, connectionResult);
        this.f52789b.put(ccVar, str);
        this.f52791d--;
        if (!connectionResult.isSuccess()) {
            this.f52792e = true;
        }
        if (this.f52791d != 0) {
            return;
        }
        if (this.f52792e) {
            this.f52790c.setException(new AvailabilityException(this.f52788a));
            return;
        }
        this.f52790c.setResult(this.f52789b);
    }
}
