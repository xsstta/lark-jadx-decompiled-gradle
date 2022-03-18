package com.ss.android.lark.diskmanage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/diskmanage/CleanResult;", "", "isSuccess", "", "cleanSize", "", "extra", "", "", "(ZJLjava/util/Map;)V", "getCleanSize", "()J", "setCleanSize", "(J)V", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.a */
public final class CleanResult {

    /* renamed from: a */
    private boolean f94517a;

    /* renamed from: b */
    private long f94518b;

    /* renamed from: c */
    private Map<String, String> f94519c;

    public CleanResult() {
        this(false, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CleanResult) {
                CleanResult aVar = (CleanResult) obj;
                if (this.f94517a == aVar.f94517a) {
                    if (!(this.f94518b == aVar.f94518b) || !Intrinsics.areEqual(this.f94519c, aVar.f94519c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f94517a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f94518b;
        int i4 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Map<String, String> map = this.f94519c;
        return i4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "CleanResult(isSuccess=" + this.f94517a + ", cleanSize=" + this.f94518b + ", extra=" + this.f94519c + ")";
    }

    /* renamed from: b */
    public final long mo135504b() {
        return this.f94518b;
    }

    /* renamed from: a */
    public final boolean mo135503a() {
        return this.f94517a;
    }

    /* renamed from: a */
    public final void mo135501a(long j) {
        this.f94518b = j;
    }

    /* renamed from: a */
    public final void mo135502a(boolean z) {
        this.f94517a = z;
    }

    public CleanResult(boolean z, long j, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "extra");
        this.f94517a = z;
        this.f94518b = j;
        this.f94519c = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CleanResult(boolean z, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? new HashMap() : map);
    }
}
