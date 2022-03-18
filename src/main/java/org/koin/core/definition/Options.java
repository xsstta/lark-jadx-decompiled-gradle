package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/koin/core/definition/Options;", "", "isCreatedAtStart", "", "override", "(ZZ)V", "()Z", "setCreatedAtStart", "(Z)V", "getOverride", "setOverride", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.definition.e */
public final class Options {

    /* renamed from: a */
    private boolean f175041a;

    /* renamed from: b */
    private boolean f175042b;

    public Options() {
        this(false, false, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options eVar = (Options) obj;
        return this.f175041a == eVar.f175041a && this.f175042b == eVar.f175042b;
    }

    public int hashCode() {
        boolean z = this.f175041a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f175042b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "Options(isCreatedAtStart=" + this.f175041a + ", override=" + this.f175042b + ")";
    }

    /* renamed from: a */
    public final boolean mo246661a() {
        return this.f175041a;
    }

    /* renamed from: b */
    public final boolean mo246662b() {
        return this.f175042b;
    }

    public Options(boolean z, boolean z2) {
        this.f175041a = z;
        this.f175042b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Options(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
