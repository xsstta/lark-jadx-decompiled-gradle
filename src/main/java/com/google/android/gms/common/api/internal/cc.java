package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21615d;
import com.google.android.gms.common.internal.Objects;

public final class cc<O extends C21611a.AbstractC21615d> {

    /* renamed from: a */
    private final boolean f52779a;

    /* renamed from: b */
    private final int f52780b;

    /* renamed from: c */
    private final C21611a<O> f52781c;

    /* renamed from: d */
    private final O f52782d;

    private cc(C21611a<O> aVar, O o) {
        this.f52781c = aVar;
        this.f52782d = o;
        this.f52780b = Objects.hashCode(aVar, o);
    }

    private cc(C21611a<O> aVar) {
        this.f52779a = true;
        this.f52781c = aVar;
        this.f52780b = System.identityHashCode(this);
    }

    /* renamed from: a */
    public static <O extends C21611a.AbstractC21615d> cc<O> m78611a(C21611a<O> aVar, O o) {
        return new cc<>(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C21611a.AbstractC21615d> cc<O> m78610a(C21611a<O> aVar) {
        return new cc<>(aVar);
    }

    /* renamed from: a */
    public final String mo73446a() {
        return this.f52781c.mo73223d();
    }

    public final int hashCode() {
        return this.f52780b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return !this.f52779a && !ccVar.f52779a && Objects.equal(this.f52781c, ccVar.f52781c) && Objects.equal(this.f52782d, ccVar.f52782d);
    }
}
