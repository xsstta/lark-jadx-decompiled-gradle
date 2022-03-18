package com.ss.android.lark.mail.impl.home.threadlist.header.outbox;

import com.larksuite.arch.jack.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.d */
public final class OutboxState implements State {

    /* renamed from: a */
    private final boolean f108526a;

    /* renamed from: b */
    private int f108527b;

    /* renamed from: c */
    private final long f108528c;

    /* renamed from: d */
    private final long f108529d;

    /* renamed from: e */
    private final String f108530e;

    /* renamed from: a */
    public static /* synthetic */ OutboxState m170061a(OutboxState dVar, boolean z, int i, long j, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dVar.f108526a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f108527b;
        }
        if ((i2 & 4) != 0) {
            j = dVar.f108528c;
        }
        if ((i2 & 8) != 0) {
            j2 = dVar.f108529d;
        }
        if ((i2 & 16) != 0) {
            str = dVar.f108530e;
        }
        return dVar.mo153226a(z, i, j, j2, str);
    }

    /* renamed from: a */
    public final OutboxState mo153226a(boolean z, int i, long j, long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        return new OutboxState(z, i, j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutboxState)) {
            return false;
        }
        OutboxState dVar = (OutboxState) obj;
        return this.f108526a == dVar.f108526a && this.f108527b == dVar.f108527b && this.f108528c == dVar.f108528c && this.f108529d == dVar.f108529d && Intrinsics.areEqual(this.f108530e, dVar.f108530e);
    }

    public int hashCode() {
        boolean z = this.f108526a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f108528c;
        long j2 = this.f108529d;
        int i4 = ((((((i * 31) + this.f108527b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f108530e;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OutboxState(show=" + this.f108526a + ", count=" + this.f108527b + ", lastUpdatedTimestamp=" + this.f108528c + ", dismissTimestamp=" + this.f108529d + ", labelId=" + this.f108530e + ")";
    }

    /* renamed from: a */
    public final boolean mo153227a() {
        return this.f108526a;
    }

    /* renamed from: b */
    public final int mo153228b() {
        return this.f108527b;
    }

    /* renamed from: c */
    public final long mo153229c() {
        return this.f108528c;
    }

    /* renamed from: d */
    public final long mo153230d() {
        return this.f108529d;
    }

    /* renamed from: e */
    public final String mo153231e() {
        return this.f108530e;
    }

    public OutboxState(boolean z, int i, long j, long j2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        this.f108526a = z;
        this.f108527b = i;
        this.f108528c = j;
        this.f108529d = j2;
        this.f108530e = str;
    }
}
