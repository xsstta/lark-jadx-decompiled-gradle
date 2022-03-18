package com.larksuite.arch.jack;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/larksuite/arch/jack/Tuple2;", "A", "B", "", AbstractC60044a.f149675a, C63954b.f161494a, "(Ljava/lang/Object;Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getB", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/larksuite/arch/jack/Tuple2;", "equals", "", "other", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.y */
public final class Tuple2<A, B> {

    /* renamed from: a */
    private final A f59443a;

    /* renamed from: b */
    private final B f59444b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuple2)) {
            return false;
        }
        Tuple2 yVar = (Tuple2) obj;
        return Intrinsics.areEqual(this.f59443a, yVar.f59443a) && Intrinsics.areEqual(this.f59444b, yVar.f59444b);
    }

    public int hashCode() {
        A a = this.f59443a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f59444b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Tuple2(a=" + ((Object) this.f59443a) + ", b=" + ((Object) this.f59444b) + ")";
    }

    public Tuple2(A a, B b) {
        this.f59443a = a;
        this.f59444b = b;
    }
}
