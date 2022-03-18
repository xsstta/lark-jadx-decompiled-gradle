package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.g */
public class C21672g {

    /* renamed from: a */
    private final Set<C21668f<?>> f52863a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo73488a() {
        for (C21668f<?> fVar : this.f52863a) {
            fVar.mo73479a();
        }
        this.f52863a.clear();
    }

    /* renamed from: a */
    public static <L> C21668f<L> m78739a(L l, Looper looper, String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new C21668f<>(looper, l, str);
    }

    /* renamed from: a */
    public static <L> C21668f.C21669a<L> m78738a(L l, String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new C21668f.C21669a<>(l, str);
    }
}
